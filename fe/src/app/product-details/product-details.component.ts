import {Component, OnInit} from '@angular/core';
import {ProductService} from "../services/product.service";
import {ActivatedRoute} from "@angular/router";
import {Cart, Product} from "../model/product.model";

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit{
  constructor(private productService : ProductService, private route : ActivatedRoute) {
    this.route.params.subscribe(
      params => {
        this.productId = +params['id']
      }
    )
  }

  productId : number = 0
  product : any
  prince : String = "Prince"
  ngOnInit(): void {
    this.getProduct()
  }

  getProduct(){
    this.productService.getProduct(this.productId)
      .subscribe({
        next : data => {
          console.log(data)
          this.product = data
        },
        error : err => {
          alert("error")
        }
      })
  }

  addToCart(product: Cart) {
    product.quantity = 1
    this.productService.addToCart(product)
      .subscribe({
        next : data => {
          alert("Sucessss!!!!!")
        },
        error : err => {
          alert("Failedddd!!!!!")
        }
      })
  }
}
