import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TasksComponent } from './components/tasks/tasks.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { DetailsComponent } from './components/details/details.component';
import { LoginComponent } from './components/login/login.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MaxLengthPipe } from './pipes/max-length.pipe';
import { ArabicDatePipe } from './pipes/arabic-date.pipe';
import { HeaderComponent } from './components/shared/header/header.component';
import { RatingComponent } from './components/shared/rating/rating.component';

@NgModule({
  declarations: [
    AppComponent,
    TasksComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    NotFoundComponent,
    DetailsComponent,
    LoginComponent,
    MaxLengthPipe,
    ArabicDatePipe,
    HeaderComponent,
    RatingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
