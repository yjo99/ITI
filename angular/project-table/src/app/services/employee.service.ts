import { Injectable } from '@angular/core';
import { employee } from '../components/employee/employee';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor() {}

  isEmpty(firstName: string, lastName: string, age: number): boolean {
    if (firstName == '' && lastName == '' && age == 0) {
      return true;
    }else{
    return false;}
  }

  IsExist(employees: employee[], firstName:string ):boolean{
    var check = employees.some((el) => el.firstName === firstName); //isExist
    if(!check){
      return true;
    }
    return false;
  }
}
