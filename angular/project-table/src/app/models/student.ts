import { first } from "rxjs";

export class Student{
    ID:number=0;
    Name:String="";
    Mobile:string="";
    Email:string="";
    NationalID:string="";
    Age:number=0;

    constructor(ID:number,Name:string,mobile:string,email:string,NationalID:string,age:number){
        this.ID=ID;
        this.Name=Name;
        this.Mobile=mobile;
        this.Email=email;
        this.NationalID = NationalID;
        this.Age = age;
    }
}