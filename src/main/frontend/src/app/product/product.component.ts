import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";

import { ApiService, Product } from "../api.service";

@Component({
  selector: 'app-product',
  template: `
    <!--<a routerLink="../">обратно</a>-->
    <div class="row" *ngIf="product">
      <div class="col s12 m6 l4">
        <div class="card">
          <div class="card-content">
            <div class="card-image">
              <img src="{{product.image}}" alt="{{product.name}}" />
            </div>
            <span class="card-title">{{product.name}}</span>
            <span *ngIf="!product.exist">Нет в наличии!</span>
            <span *ngIf="product.exist">Цена: {{product.price}} грн.</span>
            <br>
            <br>
            {{product.description}}
            <div class="card-action">
              <a class="waves-effect waves-light btn right" [class.disabled]="!product.exist" routerLink="/product/{{product.alias}}">Заказать</a>
            </div>
          </div>
        </div>
      </div>
    </div>`
})
export class ProductComponent implements OnInit {

  product: Product;

  constructor(private api: ApiService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe((params) => {
      this.api.product( params.get("aliasProduct") ).subscribe(data => this.product = data)
    });
  }

}
