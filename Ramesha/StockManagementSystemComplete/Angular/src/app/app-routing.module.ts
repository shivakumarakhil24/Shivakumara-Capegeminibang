import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';

import { ShowAllProductsComponent } from './show-all-products/show-all-products.component';
import { AddProductComponent } from './add-product/add-product.component';
import { OrderListComponent } from './order-list/order-list.component';
import { CartComponent } from './cart/cart.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'contactus', component: ContactusComponent },
  { path: 'showallproducts', component: ShowAllProductsComponent },
  { path: 'addProduct', component: AddProductComponent },
  {path : 'cart', component : CartComponent},
  {path : 'order-list', component : OrderListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
