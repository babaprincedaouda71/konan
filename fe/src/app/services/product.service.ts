import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Cart, Product} from "../model/product.model";
import {Customer} from "../model/customer.model";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http : HttpClient) { }

  public getProducts() : Observable<Array<Product>>{
    return this.http.get<Array<Product>>("http://localhost:8082/perfumes")
  }
  public getProductsFromCart() : Observable<Array<Cart>>{
    return this.http.get<Array<Cart>>("http://localhost:3000/cart")
  }

  public getProduct(productId : number) : Observable<Product>{
    return this.http.get<Product>(`http://localhost:8082/perfumes/${productId}`)
  }

  public addToCart(product : Product) : Observable<any>{
    return this.http.post("http://localhost:3000/cart", product)
  }
  public removeFromCart(product : Product) : Observable<any>{
    return this.http.delete(`http://localhost:3000/cart/${product.id}`)
  }
}
