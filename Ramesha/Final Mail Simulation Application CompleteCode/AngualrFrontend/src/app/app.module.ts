import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { HeadpageComponent } from './headpage/headpage.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ComposeComponent } from './userhome/compose/compose.component';
import { DraftComponent } from './userhome/draft/draft.component';
import { InboxComponent } from './userhome/inbox/inbox.component';
import { UserHomeHeaderComponent } from './userhome/user-home-header/user-home-header.component';
import { SentmailsComponent } from './userhome/sentmails/sentmails.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    ChangepasswordComponent,
    ForgotpasswordComponent,
    HeadpageComponent,
    ComposeComponent,
    DraftComponent,
    InboxComponent,
    UserHomeHeaderComponent,
    UserhomeComponent,
    SentmailsComponent

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
