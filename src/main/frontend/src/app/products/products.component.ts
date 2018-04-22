import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";

import { ApiService, Category, Product } from "../api.service";

@Component({
  selector: 'app-products',
  template: `
    <div *ngIf="!categories && !products">Товаров нет!</div>
    <div class="row" *ngIf="categories">
      <app-category-item *ngFor="let category of categories" [category]="category" [routeUrl]="'/category/'+category.alias"></app-category-item>
    </div>
    <div class="row" *ngIf="products">
      <app-product-item *ngFor="let product of products" [product]="product"></app-product-item>
    </div>`
})
export class ProductsComponent implements OnInit {

  category: Category;
  categories: Category[];
  products: Product[];

  constructor(private api: ApiService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.api.subcategories( params.get("aliasCategory") )
              .subscribe(data => this.categories = data);
      this.api.products( params.get("aliasCategory") )
              .subscribe(data => this.products = data);
    });
  }

}
