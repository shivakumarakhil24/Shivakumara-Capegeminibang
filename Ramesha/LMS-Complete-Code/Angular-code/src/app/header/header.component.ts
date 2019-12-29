import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  userType: string;
  constructor(private router: Router) { }

  ngOnInit() {
  }

  isLoggedIn() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user) {
      return true;
    } else {
      return false;
    }
  }
  isAdmin() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user.userType === 'Admin') {
      return true;
    } else {
      return false;
    }
  }

  isLibrarian() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user.userType === 'Librarian') {
      return true;
    } else {
      return false;
    }
  }

  isStudent() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.user.userType === 'Student') {
      return true;
    } else {
      return false;
    }
  }
  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/')
  }

}
