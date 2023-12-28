import {Component, OnInit} from '@angular/core';
import {ProductService} from "../services/product.service";
import {Product} from "../model/product.model";

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit{
  constructor(private productService : ProductService) {
  }

  parfumes : Array<Product> = []

  ngOnInit(): void {
    this.productService.getProducts()
      .subscribe({
        next : data =>{
          this.parfumes = data
        },
        error : err => {
          alert("Erreur lors du chargements des Parfums")
        }
      })
  }
}
