import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-information',
  templateUrl: './user-information.component.html',
  styleUrls: ['./user-information.component.css'],
})
export class UserInformationComponent implements OnInit {
  constructor(private formGroup: FormBuilder) {}
  userInformation: FormGroup;
  maxLength: number = 30;
  minLength: number = 3;

  ngOnInit(): void {
    //can use this form as an object have just parameter
    this.userInformation = this.formGroup.group({
      name: [
        '',
        [
          Validators.required,
          Validators.maxLength(this.maxLength),
          Validators.minLength(this.minLength),
        ],
      ],
      email: [],
      password: [],
      age: [],
      gender: ['', [Validators.required]],
      militaryService: ['', [Validators.required]],
    });
  }

  add(): void {
    alert('Hello');
  }

  milteryServicestatus(): void {
    if (this.userInformation.controls['gender'].value == 1) {
      this.userInformation.controls['militaryService'].setValidators([
        Validators.required,
      ]);
      this.userInformation.controls['militaryService'].updateValueAndValidity();
      console.log('true');
    } else {
      this.userInformation.controls['militaryService'].setValidators([]);
      // this.userInformation.removeControl('milteryService')
      this.userInformation.controls['militaryService'].updateValueAndValidity();
      console.log('false');
    }

    // console.log("test")
  }
}
