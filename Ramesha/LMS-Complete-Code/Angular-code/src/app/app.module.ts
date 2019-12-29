import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { AddlibrarianComponent } from './addlibrarian/addlibrarian.component';
import { SearchalluserComponent } from './searchalluser/searchalluser.component';
import { SearchallbooksComponent } from './searchallbooks/searchallbooks.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { CancelrequestComponent } from './cancelrequest/cancelrequest.component';
import { AddbookComponent } from './addbook/addbook.component';
import { ShowallrequestsComponent } from './showallrequests/showallrequests.component';
import { ShowallissuedbooksComponent } from './showallissuedbooks/showallissuedbooks.component';
import { SearchallbookbylibrarianComponent } from './searchallbookbylibrarian/searchallbookbylibrarian.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    AdminComponent,
    StudentComponent,
    LibrarianComponent,
    ContactusComponent,
    AddstudentComponent,
    AddlibrarianComponent,
    SearchalluserComponent,
    SearchallbooksComponent,
    RequestbookComponent,
    CancelrequestComponent,
    AddbookComponent,
    ShowallrequestsComponent,
    ShowallissuedbooksComponent,
    SearchallbookbylibrarianComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
