import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../model/customer.model";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http : HttpClient) { }

  public getCustomers() : Observable<Array<Customer>>{
    return this.http.get<Array<Customer>>("http://localhost:8085/customers")
  }

  public saveCustomer(customer : Customer) : Observable<Customer>{
    return this.http.post<Customer>("http://localhost:8085/customers", customer)
  }
  public deleteCustomer(customer : Customer) : Observable<any>{
    return this.http.delete(`http://localhost:3000/customers/${customer.id}`)
  }
}
