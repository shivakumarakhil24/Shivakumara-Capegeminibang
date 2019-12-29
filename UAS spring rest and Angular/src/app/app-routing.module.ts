import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ScheduledprogramComponent } from './scheduledprogram/scheduledprogram.component';
import { ContactdetailsComponent } from './contactdetails/contactdetails.component';
import { ApplicataionstatusComponent } from './applicataionstatus/applicataionstatus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddCourseComponent } from './add-course/add-course.component';
import { AdminOperationsComponent } from './admin-operations/admin-operations.component';
import { MacLoginComponent } from './mac-login/mac-login.component';
import { MacOperationsComponent } from './mac-operations/mac-operations.component';
import { ScheduledprogramsDetailsComponent } from './scheduledprograms-details/scheduledprograms-details.component';
import { ViewAllApplicationsComponent } from './view-all-applications/view-all-applications.component';
import { ViewallacceptedComponent } from './viewallaccepted/viewallaccepted.component';
import { ViewappliedappicationsComponent } from './viewappliedappications/viewappliedappications.component';
import { ViewallrejectedComponent } from './viewallrejected/viewallrejected.component';
import { SetstatusComponent } from './setstatus/setstatus.component';
import { AuthGuard } from './auth.guard';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'scheduledprogram', component: ScheduledprogramComponent},
  { path: 'contactdetails', component: ContactdetailsComponent},
  { path: 'applicationstatus', component: ApplicataionstatusComponent},
  { path: 'aboutus', component: AboutusComponent},
  { path: 'addcourse', component: AddCourseComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin'] } },
  { path: 'adminoperations', component: AdminOperationsComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin', 'mac'] } },
  { path: 'macoperations', component: MacOperationsComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin', 'mac'] } },
  { path: 'scheduledprogramdetails', component: ScheduledprogramsDetailsComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin'] } },
  { path: 'viewallapplications', component: ViewAllApplicationsComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin', 'mac'] } },
  { path: 'viewallaccepted', component: ViewallacceptedComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin'] } },
  { path: 'viewallrejected', component: ViewallrejectedComponent, canActivate: [AuthGuard], data: { expectedRole: ['admin'] } },
  { path: 'setstatus', component: SetstatusComponent, canActivate: [AuthGuard], data: { expectedRole: ['mac'] } }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
