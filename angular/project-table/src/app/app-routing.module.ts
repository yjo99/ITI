import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeComponent } from './components/employee/employee.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { StudentComponent } from './components/student/student.component';
import { ToDoListComponent } from './components/to-do-list/to-do-list.component';
import { UserInformationComponent } from './components/user-information/user-information.component';


const routes: Routes = [

    // {path:'home',component:EmployeeComponent},
    {path:'',component:EmployeeComponent},
    {path:'toDoList',component:ToDoListComponent},
    {path:'student', component:StudentComponent},

    {path:'userInfo', component:UserInformationComponent},



    //should be last item
    {path:'**', component:NotfoundComponent},
    
  
  ];
  
  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }
  