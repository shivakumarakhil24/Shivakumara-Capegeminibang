import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { HeadpageComponent } from './headpage/headpage.component';
import { ComposeComponent } from './userhome/compose/compose.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { InboxComponent } from './userhome/inbox/inbox.component';
import { DraftComponent } from './userhome/draft/draft.component';
import { SentmailsComponent } from './userhome/sentmails/sentmails.component';



const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  { path: 'changepassword', component: ChangepasswordComponent },
  { path: 'forgot', component: ForgotpasswordComponent },
  { path: 'head', component: HeadpageComponent },
  {
    path: 'userhome', component: UserhomeComponent
  },
  {
    path: 'compose', component: ComposeComponent
  },
  {path: 'sent', component: SentmailsComponent},
  {
    path: 'inbox', component: InboxComponent
  },
  {
    path: 'draft', component: DraftComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
