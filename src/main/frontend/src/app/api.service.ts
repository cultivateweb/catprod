import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

/**
 * Producer
 */
export class Producer {
  alias: string;
  name: string;
  image: string;
}

/**
 * Category
 */
export interface Category {
  alias: string;
  name: string;
  image: string;
}

/**
 * Product
 */
export class Product {
  alias: string;
  producer: string;
  name: string;
  image: string;
  price: number;
  description: string;
  exist: boolean;
}

/**
 * ApiService
 */
@Injectable()
export class ApiService {

  constructor(private api: HttpClient) { }

  producers(): Observable<Producer[]> {
    return this.api.get<Producer[]>("api/producers");
  }

  categories(): Observable<Category[]> {
    return this.api.get<Category[]>("api/categories");
  }

  subcategories(alias: string): Observable<Category[]>{
    return this.api.get<Category[]>(`api/categories/${alias}/subcategories`);
  }

  products(alias: string): Observable<Product[]>{
    return this.api.get<Product[]>(`api/categories/${alias}/products`);
  }

  product(alias: string): Observable<Product>{
    return this.api.get<Product>(`api/products/${alias}`);
  }

  producer(alias: string) {
    return this.api.get<Producer>(`api/producers/${alias}`);
  }

  producerCategories(alias: string) {
    return this.api.get<Category[]>(`api/producers/${alias}/categories`);
  }

  producerCategorySubcategories(alias: string, aliasCategory: string) {
    return this.api.get<Category[]>(`api/producers/${alias}/categories/${aliasCategory}/subcategories`);
  }

  producerCategoryProducts(alias: string, aliasCategory: string) {
    return this.api.get<Product[]>(`api/producers/${alias}/categories/${aliasCategory}/products`);
  }

}
