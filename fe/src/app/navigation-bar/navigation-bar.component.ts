import { Component } from '@angular/core';

@Component({
  selector: 'app-navigation-bar',
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.css']
})
export class NavigationBarComponent {
  actions : Array<any> = [
    {title : "Accueil", "route" : "/home", icon : "bi bi-house"},
    {title : "Catalogue", "route" : "/catalog", icon : ""},
    {title : "A Propos", "route" : "/about", icon : "bi bi-question"},
  ]

  currentAction : any

  setCurrentAction(action: any) {
    this.currentAction = action;
  }
}
