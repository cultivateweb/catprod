import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from "@angular/router";

import {ApiService, Category, Producer, Product} from "../api.service";

@Component({
  selector: 'app-producer',
  template: `
    <h4 class="brand-logo" *ngIf="producer">{{producer.name}}</h4>
    <div *ngIf="!categories && !products">Товаров нет!</div>
    <div class="row" *ngIf="categories">
      <app-category-item *ngFor="let category of categories" [category]="category" [routeUrl]="'/producer/'+producer.alias+'/category/'+category.alias"></app-category-item>
    </div>
    <div class="row" *ngIf="products">
      <app-product-item *ngFor="let product of products" [product]="product"></app-product-item>
    </div>`
})
export class ProducerComponent implements OnInit {

  producer: Producer;
  categories: Category[];
  products: Product[];

  constructor(private api: ApiService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      const aliasProducer: string = params.get("aliasProducer");
      const aliasCategory: string = params.get("aliasCategory");

      this.api.producer( aliasProducer )
        .subscribe(data => this.producer = data);

      if (aliasProducer && aliasCategory) {
        this.api.producerCategorySubcategories(aliasProducer, aliasCategory)
          .subscribe(data => this.categories = data);
        this.api.producerCategoryProducts(aliasProducer, aliasCategory)
          .subscribe(data => this.products = data);

      } else if (aliasProducer)
        this.api.producerCategories( aliasProducer )
          .subscribe(data => this.categories = data);
    });
  }

}
