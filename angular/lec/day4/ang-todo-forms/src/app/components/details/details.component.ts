import { ResponseViewModel } from './../../models/response-view-model';
import { HttpClient } from '@angular/common/http';
import { Task } from './../../models/task';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
task:Task=new Task();
constructor(private _activatedRoute:ActivatedRoute,private _http:HttpClient){}

ngOnInit(): void {
  this._activatedRoute.paramMap
  .subscribe(
    parms=>{
     let id= parms.get('id')||'';
     this.getTaskByID(id);

    }
  );
}

getTaskByID(id:string):void
{
this._http.get<ResponseViewModel>(`https://api.mohamed-sadek.com/Task/GetByID?id=${id}`)
.subscribe(
  resposne=>{
    this.task=resposne.Data;
  }
);
}
}
