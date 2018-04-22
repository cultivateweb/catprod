import { Component, Input, OnInit } from '@angular/core';

import { Product } from "../api.service";

@Component({
  selector: 'app-product-item',
  template: `
    <div class="col s12 m6 l3 xl3" *ngIf="product">
      <a routerLink="/product/{{product.alias}}">
        <div class="card hoverable">
          <div class="card-content">
            <div class="card-image">
              <img class="responsive-img" src="{{product.image}}" alt="{{product.name}}" />
            </div>
            <span class="card-title blue-text text-darken-2 truncate">{{product.name}}</span>
            <br/>
            <blockquote class="black-text">{{product.description}}</blockquote>
          </div>
        </div>
      </a>
    </div>`
})
export class ProductItemComponent implements OnInit {

  @Input() product: Product;

  constructor() { }

  ngOnInit() {
  }

}
