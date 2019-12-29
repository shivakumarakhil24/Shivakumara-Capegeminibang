import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { RegisterComponent } from './register/register.component';
import { AuthGuard } from './auth.guard';
import { ContactusComponent } from './contactus/contactus.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { AddlibrarianComponent } from './addlibrarian/addlibrarian.component';
import { SearchalluserComponent } from './searchalluser/searchalluser.component';
import { SearchallbooksComponent } from './searchallbooks/searchallbooks.component';
import { CancelrequestComponent } from './cancelrequest/cancelrequest.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { AddbookComponent } from './addbook/addbook.component';
import { ShowallrequestsComponent } from './showallrequests/showallrequests.component';
import { ShowallissuedbooksComponent } from './showallissuedbooks/showallissuedbooks.component';
import { SearchallbookbylibrarianComponent } from './searchallbookbylibrarian/searchallbookbylibrarian.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'contactus', component: ContactusComponent },
  {
    path: 'admin', component: AdminComponent,
    canActivate: [AuthGuard], data: { userType: ['Admin'] }
  },
  {
    path: 'student', component: StudentComponent,
    canActivate: [AuthGuard], data: { userType: ['Student'] }
  },
  {
    path: 'librarian', component: LibrarianComponent,
    canActivate: [AuthGuard], data: { userType: ['Librarian'] }
  },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'addstudent', component: AddstudentComponent },
  { path: 'addlibrarian', component: AddlibrarianComponent },
  { path: 'searchalluser', component: SearchalluserComponent },
  { path: 'searchallbooks', component: SearchallbooksComponent },
  { path: 'requestbook', component: RequestbookComponent },
  { path: 'cancelrequest', component: CancelrequestComponent },
  { path: 'addbook', component: AddbookComponent },
  { path: 'showallrequests', component: ShowallrequestsComponent },
  { path: 'showallissuedbooks', component: ShowallissuedbooksComponent },
  { path: 'searchallbookbylibrarian', component: SearchallbookbylibrarianComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
