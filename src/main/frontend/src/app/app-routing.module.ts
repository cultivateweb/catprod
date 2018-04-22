import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from "./home/home.component";
import { ProductComponent } from "./product/product.component";
import { ProducerComponent } from "./producer/producer.component";
import { ProductsComponent } from "./products/products.component";

const routes: Routes = [
  { path: "",                                                component: HomeComponent },
  { path: "producer/:aliasProducer",                         component: ProducerComponent },
  { path: "producer/:aliasProducer/category/:aliasCategory", component: ProducerComponent },
  { path: "category/:aliasCategory",                         component: ProductsComponent },
  { path: "product/:aliasProduct",                           component: ProductComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
