import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html',
  styleUrls: ['./rating.component.css']
})
export class RatingComponent {
  @Input() rate:number=4;
  @Output() change=new EventEmitter<number>();
  //@Input() type:number=1;
  stars=[1,2,3,4,5];

  changeRate(rate:number):void
  {
    this.rate=rate;
    this.change.emit(rate);
    alert(rate);
    //Course API
    //Student API
    //ins API
    //Product API
  }
}
