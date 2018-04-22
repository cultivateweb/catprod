import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ApiService } from "./api.service";
import { ProductComponent } from './product/product.component';
import { ProducerComponent } from './producer/producer.component';
import { CategoryItemComponent } from './category-item/category-item.component';
import { ProductsComponent } from './products/products.component';
import { ProductItemComponent } from './product-item/product-item.component';
import { ProducerItemComponent } from './producer-item/producer-item.component';

@NgModule({
  declarations: [ AppComponent, HomeComponent, ProductComponent, ProducerComponent, CategoryItemComponent, ProductsComponent, ProductItemComponent, ProducerItemComponent ],
  imports:  [ BrowserModule, AppRoutingModule, HttpClientModule ],
  providers: [ ApiService ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
