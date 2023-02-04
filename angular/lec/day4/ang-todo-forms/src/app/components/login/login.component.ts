import { LoginViewModel } from './../../models/login-view-model';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit  {
  
  loginForm: FormGroup;
  
  constructor(private _formBuilder:FormBuilder){}
 
  ngOnInit(): void {
    this.loginForm=this._formBuilder.group({
      Email:['mohamed@gmail.com',[Validators.required,Validators.minLength(3),Validators.maxLength(30),Validators.email]],
      Password:['',[Validators.required,Validators.minLength(5),Validators.maxLength(20)]],
      Gender:[1,[Validators.required]],
      MileteryStatus:['',[Validators.required]]
      });
    
  }

  login():void
  {
    let loginViewModel=this.loginForm.value as LoginViewModel;
    loginViewModel.IP="www";
    alert(JSON.stringify(this.loginForm.value));
  }

  removePasswordValidators()
  {
    this.loginForm.controls['Password'].setValidators([]);
    this.loginForm.controls['Password'].updateValueAndValidity();
  }

  addPasswordValidators()
  {
    this.loginForm.controls['Password'].setValidators([Validators.required,Validators.minLength(5),Validators.maxLength(20)]);
    this.loginForm.controls['Password'].updateValueAndValidity();
  }

  changeGender():void{
    let gender= this.loginForm.controls['Gender'].value as number;
    //alert(gender);
    if(gender==1)
    {
      this.loginForm.controls['MileteryStatus'].setValidators([Validators.required]);
      this.loginForm.controls['MileteryStatus'].updateValueAndValidity();
    }
    else
    {
      this.loginForm.controls['MileteryStatus'].setValidators([]);
      this.loginForm.controls['MileteryStatus'].updateValueAndValidity();

    }
  }
 
}
