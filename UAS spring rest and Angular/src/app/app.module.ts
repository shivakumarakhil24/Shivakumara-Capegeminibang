import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { RouterModule } from '@angular/router';
import { ScheduledprogramComponent } from './scheduledprogram/scheduledprogram.component';
import { ApplicataionstatusComponent } from './applicataionstatus/applicataionstatus.component';
import { ContactdetailsComponent } from './contactdetails/contactdetails.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ScheduledprogramsDetailsComponent } from './scheduledprograms-details/scheduledprograms-details.component';
import { AdminOperationsComponent } from './admin-operations/admin-operations.component';
import { ViewAllApplicationsComponent } from './view-all-applications/view-all-applications.component';
import { AddCourseComponent } from './add-course/add-course.component';
import { MacLoginComponent } from './mac-login/mac-login.component';
import { MacOperationsComponent } from './mac-operations/mac-operations.component';
import { ViewallacceptedComponent } from './viewallaccepted/viewallaccepted.component';
import { ViewappliedappicationsComponent } from './viewappliedappications/viewappliedappications.component';
import { ViewallrejectedComponent } from './viewallrejected/viewallrejected.component';
import { SetstatusComponent } from './setstatus/setstatus.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    HeaderComponent,
    ScheduledprogramComponent,
    ApplicataionstatusComponent,
    ContactdetailsComponent,
    AboutusComponent,
    ScheduledprogramsDetailsComponent,
    AdminOperationsComponent,
    ViewAllApplicationsComponent,
    AddCourseComponent,
    MacLoginComponent,
    MacOperationsComponent,
    ViewallacceptedComponent,
    ViewallacceptedComponent,
    ViewappliedappicationsComponent,
    ViewallrejectedComponent,
    SetstatusComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
