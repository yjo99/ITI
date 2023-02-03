import { Component } from '@angular/core';
import { employee } from '../../models/employee';
import { EmployeeService } from '../../services/employee.service';
import { first } from 'rxjs';

@Component({
  selector: 'employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
})
export class EmployeeComponent {
  constructor(private employeeService: EmployeeService<employee>) {}

  //array of employees
  employees: employee[] = [];
  numberOfEmps: number = this.employees.length;
  isEmpExist:boolean = false;
  isValueEmpty:boolean = false;

  add(firstName: string, lastName: string, age: number) {
    if (!this.employeeService.isEmpty(firstName, lastName, age)) {
      this.isValueEmpty = false;
      if (this.employeeService.IsExist(this.employees, firstName)) {
        this.isEmpExist = false;
        this.employees.push(new employee(firstName, lastName, age));
      } else {
        this.isEmpExist = true;
        // alert('This Employee is already Exist');
      }
    } else {
      this.isValueEmpty = true;
      // alert('Please Fill Your Form Data');
    }
  }

  getNumberOfEmployees(): number {
    return this.employees.length;
  }


  delete(index:number){
    this.employees.splice(index,1);
  }
  sort(){
    return this.employees.sort((a, b) => a.age - b.age )
  }
}
