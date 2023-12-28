import {Component, OnInit} from '@angular/core';
import {ProductService} from "../services/product.service";
import {Cart, Product} from "../model/product.model";
import {Observable} from "rxjs";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit{
  constructor(private productService : ProductService) {
  }

  products : Array<Cart> = []

  ngOnInit(): void {
    this.getProductsFromCart()
  }

  getProductsFromCart(){
    this.productService.getProductsFromCart()
      .subscribe({
        next : data => {
          this.products = data
        },
        error : err => {}
      })
  }

  removeFromCart(product: Cart) {
    if(confirm("Do really want to delete this product"))
    this.productService.removeFromCart(product)
      .subscribe({
        next : value => {
          this.products = this.products.filter(p => p.id != product.id)
        },
        error : err => {
          alert("Errorrrrr!!!")
        }
      })
  }

  //Initiation du montant total
  totalAmount : number = 0

  updateTotalPrice(product : Cart) {
    this.totalAmount = 0
    for (let product of this.products){
      this.totalAmount += product.quantity * product.price
    }
  }
}
