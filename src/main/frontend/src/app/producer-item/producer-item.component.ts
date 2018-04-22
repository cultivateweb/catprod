import { Component, Input, OnInit } from '@angular/core';

import { Producer } from "../api.service";

@Component({
  selector: 'app-producer-item',
  template: `<a *ngIf="producer"
                class="waves-effect btn-small blue"
                routerLink="/producer/{{producer.alias}}">{{producer.name}}</a>`
})
export class ProducerItemComponent implements OnInit {

  @Input() producer: Producer;

  constructor() { }

  ngOnInit() {
  }

}
