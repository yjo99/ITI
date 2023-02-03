import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Student } from 'src/app/models/student';
import { EmployeeService } from '../../services/employee.service';
import { ResponseViewModel } from 'src/app/models/responsive-view-model';
import { AddStudent } from 'src/app/models/addStudent';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students:Student[] = []
  isStuExist:boolean = false;
  isValueEmpty:boolean = false;

  constructor( private studentServ:EmployeeService<Student>, private http:HttpClient){
    

    
  }

  ngOnInit(): void {
    this.http.get<ResponseViewModel>('https://api.mohamed-sadek.com/Student/Get').subscribe(
      response => {
        this.students=response.Data;
      }
    )
  }




  add(firstName:string,lastName:string,mobile:string,email:string,nationalId:string,age:number):void{

    if(!this.studentServ.isStuEmpty(firstName, age)){
        this.isValueEmpty = false;
      if(this.studentServ.IsStuExist(this.students, firstName)){
        this.isStuExist = false;
        
        
        // this.students.push();
        this.http.post<ResponseViewModel>('https://api.mohamed-sadek.com/Student/POST',new AddStudent(firstName,lastName,mobile,email, nationalId, age)).subscribe(
          response =>{
            
            if(response.Success){
             
              var concName = firstName+ " " + lastName
              this.students.push(new Student(35,concName,mobile,email, nationalId, age))
              
            }else{
              alert(response.Message);
            }
          }
        )
      }else{
        this.isStuExist = true;
      }

    }else{
      this.isValueEmpty = true;
    }

  }

  delete(index:number){
    var Studentdeleted = this.students[index]
    this.http.delete<ResponseViewModel>('https://api.mohamed-sadek.com/Student/Delete?id='+Studentdeleted.ID).subscribe(
      Response => {
        if(Response.Success){
          this.students.splice(index,1)
        }else{
          alert(Response.Message)
        }
      }
    )
  }

  getTotal():number{
    return this.students.length;
  }

}
