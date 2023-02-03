import { Component } from '@angular/core';
import { MobileService } from '../services/mobile.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {
  //mobileService=new MobileService();
  constructor(private mobileService:MobileService){
    //let mobileService=new MobileService();
  }

add(firstName:string,lastName:string,age:number,mobile:string):void{
/// Validate if emp exists
/// validate if mobile valid
//Add Emp
this.mobileService.isValidMobileNumber(mobile);
}

isAlreadyExists(firstName:string,lastName:string):boolean{
  return false;
}



}
