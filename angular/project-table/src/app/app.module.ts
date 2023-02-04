import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { EmployeeComponent } from './components/employee/employee.component';
import { StudentComponent } from './components/student/student.component';
import { ToDoListComponent } from './components/to-do-list/to-do-list.component';
import { IdentityPageComponent } from './components/identity-page/identity-page.component';
import { UserInformationComponent } from './components/user-information/user-information.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    ToDoListComponent,
    StudentComponent,
    IdentityPageComponent,
    UserInformationComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
