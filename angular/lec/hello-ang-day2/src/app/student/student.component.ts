import { Component } from '@angular/core';
import { Student } from '../models/student';
import { MobileService } from '../services/mobile.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {
  //mobileService=new MobileService();
  constructor(private mobileService:MobileService){
   
  }
 //string name="Mohamed";
 

 myClassName="";
 student=new Student();
 //arrayStudent:Student[]=[];
 //StudentList:Student[]=[];
 students:Student[]=[];
 courses:string[]=['Angular','Java','C#','React'];
 firstName:string="Mohamed";
 lastName:string="Ali";
 age:number=36;
 imageURL="https://www.daralnahda.com/images/logo.png";

 getFullName():string{
  return this.firstName+" "+this.lastName;
 }


//  changeFirstName(firstName:string):void
//  {
//   this.firstName=firstName;
//  }

 changeLastName(newLastName:string):void
 {
  this.lastName=newLastName;
  //this.student.lastName=newLastName;
  this.myClassName="Mostafa";
 }


 isAgeAbove30():boolean{
  return this.age>30;
 }

 deleteCourse(index:number):void
 {
  this.courses.splice(index,1);
 }
 add(firstName:string,lastName:string,age:number,mobile:string):void{
  /// Validate if emp exists
  /// validate if mobile valid
  //Add Emp
  //let mobileService=new MobileService();

  this.mobileService.isValidMobileNumber(mobile);
  }
 
  
 


}