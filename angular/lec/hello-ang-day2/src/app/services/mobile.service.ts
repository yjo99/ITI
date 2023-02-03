import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MobileService {

  constructor(){
    alert("MobileService");
}
isValidMobileNumber(mobile:string):boolean
{
return true;
}
}
