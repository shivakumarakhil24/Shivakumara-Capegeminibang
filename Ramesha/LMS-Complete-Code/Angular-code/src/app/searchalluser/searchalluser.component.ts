import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchalluser',
  templateUrl: './searchalluser.component.html',
  styleUrls: ['./searchalluser.component.css']
})
export class SearchalluserComponent implements OnInit {
  selectUser;
  msg: string;
  users: any[];
  selectedUser= {
    userId: null,
    userName: null,
    userEmail: null,
    userType: null,
    userPassword: null,
    userMobileNo: null,
    userGender: null
  };
  constructor(private service: AdminService, private router: Router) {
    this.getAllUsers();
  }

  getAllUsers() {
    this.service.searchAllUsers().subscribe(Data => {
      console.log(Data);
      this.users = Data.userBean;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Users got successfully');
    });
  }

  searchUser(form: NgForm) {
    this.service.searchUserById(form.value).subscribe(Data => {
      console.log(Data);
      this.users = Data.userBean;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('User Data got successfully');
    });
  }

  delete(ans) {
    this. selectUser = ans;
  }

  remove(userId) {
    console.log(userId);
    this.service.removeUser(userId).subscribe(data => {
      console.log('Response of Remove User', data);
      if (data && data.description === 'User Data Removed from the DataBase') {
        this.router.navigateByUrl('/admin');
      } else {
        this.router.navigateByUrl('/searchalluser');
      }
    }, err => {
      console.log(err);
    }, () => {
      console.log("Book Deleted Successfully");
    });
  }

  editUser(user) {
    this.selectedUser = user;
  }
  update_user(form: NgForm) {
    this.msg = null;
    this.service.updateUser(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Updated user', responseData);
        if (responseData && responseData.description === 'User Data Updated in the DataBase') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/searchalluser');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
  ngOnInit() {
  }

}
