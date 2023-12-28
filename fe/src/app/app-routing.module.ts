import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {AboutComponent} from "./about/about.component";
import {CatalogComponent} from "./catalog/catalog.component";
import {ProductDetailsComponent} from "./product-details/product-details.component";
import {CartComponent} from "./cart/cart.component";
import {CustomerComponent} from "./customer/customer.component";
import {NewCustomerComponent} from "./new-customer/new-customer.component";

const routes: Routes = [
  {path : "home", component : HomeComponent},
  {path : "", component : HomeComponent},
  {path : "catalog", component : CatalogComponent},
  {path : "about", component : AboutComponent},
  {path : "product-details/:id", component : ProductDetailsComponent},
  {path : "cart", component : CartComponent},
  {path : "customers", component : CustomerComponent},
  {path : "new-customer", component : NewCustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
