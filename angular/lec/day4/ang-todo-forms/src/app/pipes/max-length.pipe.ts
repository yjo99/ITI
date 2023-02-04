import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'maxLength'
})
export class MaxLengthPipe implements PipeTransform {

  transform(value: string,length:number=3): string {
    if(value.length>length)
    return value.substring(0,length);
    else
    return value;
  }

}
