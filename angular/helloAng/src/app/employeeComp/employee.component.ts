import { emitDistinctChangesOnlyDefaultValue } from '@angular/compiler';
import { Component } from '@angular/core';
import { employee } from './employee';


@Component({
  selector: 'employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {


  //array of employees
  employees:employee[] = []
  numberOfEmps:number = this.employees.length;

  addEmployee(inputFirstName:string, inputLastName:string, inputAge:string){

    if(inputFirstName != "" && inputLastName!="" && inputAge!=""){
      
          var check = this.employees.some(el => el.firstName === inputFirstName); //isExist
          if(!check){
            this.employees.push({"firstName": inputFirstName, "lastName":inputLastName, "age":inputAge})
            this.numberOfEmps = this.employees.length;
          }else{
            alert("This Employee is already Exist");
          }
        
    
    }else{
      alert("Please Fill Your Form Data");
    }
  }

  getNumberOfEmployees():number{

    return this.employees.length
  }


}
