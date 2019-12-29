import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-show-all-products',
  templateUrl: './show-all-products.component.html',
  styleUrls: ['./show-all-products.component.css']
})
export class ShowAllProductsComponent implements OnInit {

  selectProduct;
  msg: string;
  products: any[];
  selectedProduct = {
    id: null,
    name: null,
    category: null,
    company: null,
    quantity: null,
    price: null
  };
  constructor(private service: UserService, private router: Router) {
    this.getAllProducts();
  }

  getAllProducts() {
    this.service.showAllProduct().subscribe(responseData => {
      console.log(responseData);
      this.products = responseData.productInfo;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Users got successfully');
    });
  }

  editProduct(product) {
    this.selectedProduct = product;
  }

  update_product(form: NgForm) {
    this.msg = null;
    this.service.updateProduct(form.value)
      .subscribe(responseresponseData => {
        this.msg = responseresponseData.description;
        console.log('Response of Updated Product', responseresponseData);
        if (responseresponseData && responseresponseData.description === 'Product data Updated Successfully') {
          this.router.navigateByUrl('/');
        } else {
          this.router.navigateByUrl('/showallproducts');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
  delete(ans) {
    this.selectProduct = ans;
  }
  remove(id) {
    console.log(id);
    this.service.removeProduct(id).subscribe(responseData => {
      console.log('Response of Remove Product', responseData);
      if (responseData && responseData.description === 'Product data deleted Successfully') {
        this.router.navigateByUrl('/');
      } else {
        this.router.navigateByUrl('/showallproducts');
      }
    }, err => {
      console.log(err);
      this.msg = err.description;
    }, () => {
      console.log("Book Deleted Successfully");
    });
  }
  searchProduct(form: NgForm) {
    this.service.searchProductByName(form.value).subscribe(responseData => {
      console.log(responseData);
      this.products = responseData.productInfo;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('User responseData got successfully');
    });
  }
  move() {
    this.router.navigate(['cart']);
  }
  addCart(product) {
    console.log(product);
    this.service.selectedProducts.push(product);
    console.log(this.service.selectedProducts);
  }


  ngOnInit() {
  }

}
