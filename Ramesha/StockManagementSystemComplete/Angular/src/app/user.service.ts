import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  selectedProducts = new Array();

  constructor(private http: HttpClient) { }
  showAllProduct(): Observable<any> {
    return this.http.get(`http://localhost:8083/showallproducts`);
  }
  addProduct(product): Observable<any> {
    return this.http.post(`http://localhost:8083/addProduct`, product);
  }
  updateProduct(product): Observable<any> {
    return this.http.put(`http://localhost:8083/updateProduct`, product);
  }
  removeProduct(product): Observable<any> {
    return this.http.delete(`http://localhost:8083/deleteProduct/${product.id}`);
  }
  searchProductByName(product): Observable<any> {
    return this.http.get(`http://localhost:8083/getproduct_byname/${product.name}`);
  }
  orderProducts(products, total, total_gst) {
    return this.http.post<any>(`http://localhost:8083/generate/${total}/${total_gst}`, products);
  }
}
