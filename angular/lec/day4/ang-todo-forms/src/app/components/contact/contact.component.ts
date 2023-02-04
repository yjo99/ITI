import { Component } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent {
  contactUsRate=3;
  
  onRatingChanged(rate:number):void{
    this.contactUsRate=rate;
  }

}
