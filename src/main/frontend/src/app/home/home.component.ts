import { Component, OnInit } from '@angular/core';

import {ApiService, Category, Producer} from "../api.service";

@Component({
  selector: 'app-home',
  template: `
    <div *ngIf="!producers && !categories">Товаров нет!</div>
    <div class="row" *ngIf="producers">
      <app-producer-item *ngFor="let producer of producers" [producer]="producer"></app-producer-item>
    </div>
    <div class="row" *ngIf="categories">
      <app-category-item *ngFor="let category of categories" [category]="category" [routeUrl]="'/category/'+category.alias"></app-category-item>
    </div>`
})
export class HomeComponent implements OnInit {

  producers: Producer[];
  categories: Category[];

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.producers().subscribe(data => this.producers = data);
    this.api.categories().subscribe(data => this.categories = data);
  }

}
