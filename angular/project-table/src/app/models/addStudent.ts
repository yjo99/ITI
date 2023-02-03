export class AddStudent{
    
    FirstName:String="";
    LastName:String="";
    Mobile:string="";
    Email:string="";
    NationalID:string="";
    Age:number=0;

    constructor(FirstName:string,LastName:string,mobile:string,email:string,NationalID:string,age:number){
        this.FirstName=FirstName;
        this.LastName = LastName;
        this.Mobile=mobile;
        this.Email=email;
        this.NationalID = NationalID;
        this.Age = age;
    }
}