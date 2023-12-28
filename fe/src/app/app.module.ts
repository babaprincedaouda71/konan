import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CatalogComponent } from './catalog/catalog.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { CartComponent } from './cart/cart.component';
import { PayementComponent } from './payement/payement.component';
import { OrderConfirmationComponent } from './order-confirmation/order-confirmation.component';
import { FooterComponent } from './footer/footer.component';
import { NavigationBarComponent } from './navigation-bar/navigation-bar.component';
import { InventoryManagementComponent } from './inventory-management/inventory-management.component';
import { AboutComponent } from './about/about.component';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { CustomerComponent } from './customer/customer.component';
import { NewCustomerComponent } from './new-customer/new-customer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CatalogComponent,
    ProductDetailsComponent,
    CartComponent,
    PayementComponent,
    OrderConfirmationComponent,
    FooterComponent,
    NavigationBarComponent,
    InventoryManagementComponent,
    AboutComponent,
    CustomerComponent,
    NewCustomerComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
