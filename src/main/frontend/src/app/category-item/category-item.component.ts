import { Component, Input, OnInit } from '@angular/core';

import { Category } from "../api.service";

@Component({
  selector: 'app-category-item',
  template: `
    <div class="col s9 m4 l3 xl3" *ngIf="category">
      <a routerLink="{{routeUrl}}">
        <div class="card hoverable">
          <div class="card-content">
            <span class="card-title truncate center-align blue-text text-darken-2">{{category.name}}</span>
            <div class="card-image">
              <img class="responsive-img" src="{{category.image}}" alt="{{category.name}}" />
            </div>
          </div>
        </div>
      </a>
    </div>`
})
export class CategoryItemComponent implements OnInit {

  @Input() category: Category;
  @Input() routeUrl: string;

  constructor() { }

  ngOnInit() {
  }

}
