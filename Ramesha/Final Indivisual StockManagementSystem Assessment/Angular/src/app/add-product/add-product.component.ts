import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  msg: string;
  constructor(private service: UserService, private router: Router) { }

  addProduct(form: NgForm) {
    this.msg = null;
    this.service.addProduct(form.value)
      .subscribe(Data => {
        this.msg = Data.description;
        console.log('Response after adding product', Data);
        if (Data && Data.description === 'Product added to the database Successfully') {
          this.router.navigateByUrl('/');
        } else {
          this.router.navigateByUrl('/addProduct');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.Data.description;
      });
  }

}
