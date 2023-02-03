import { Injectable } from '@angular/core';
import { employee } from '../models/employee';
import { Student } from '../models/student';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService<T> {
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
  IsStuExist(students: Student[], firstName:string ):boolean{
    var check = students.some((el) => el.Name === firstName); //isExist
    if(!check){
      return true;
    }
    return false;
  }

  isStuEmpty( Name: string, age: number): boolean {
    if (Name == '' &&  age == 0) {
      return true;
    }else{
    return false;}
  }

}
