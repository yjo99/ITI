import { HttpClient } from '@angular/common/http';
import { Task } from './../../models/task';
import { Component, OnInit } from '@angular/core';
import { ResponseViewModel } from 'src/app/models/response-view-model';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {

constructor(private _http:HttpClient){}
ngOnInit(): void {
  //alert("1");
  this._http.get<ResponseViewModel>('https://api.mohamed-sadek.com/Task/Get')
  .subscribe(
    response=>{
      //alert("2");
      this.tasks=response.Data;
    },
    error=>{
      alert('error occurred');
    }
  );
  //alert("3");
}
tasks:Task[]=[];
name:string="Mohamed Ali";
add(title:string):void
{
  let task=new Task();
  task.Title=title;
  this._http.post<ResponseViewModel>('https://api.mohamed-sadek.com/Task/POST',task)
  .subscribe(
    resposne=>{
      if(resposne.Success)
        this.tasks.push(task);
        else
       alert(resposne.Message); 
    }
  );
  
}
update(task:Task):void
{
  task.IsDone=!task.IsDone;
  this._http.put<ResponseViewModel>('https://api.mohamed-sadek.com/Task/PUT',task)
  .subscribe(
    respose=>{
      alert(respose.Message);
    }
  );
}
delete(index:number){
  let task=this.tasks[index];
  this._http.delete('https://api.mohamed-sadek.com/Task/delete?id='+task.ID)
  .subscribe(
    response=>{ 
       this.tasks.splice(index,1);
    }
  );
}


getPendingTasksCount():number{
  return this.tasks.filter(x=>!x.IsDone).length;
}

}
