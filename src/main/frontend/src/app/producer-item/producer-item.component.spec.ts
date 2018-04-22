import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProducerItemComponent } from './producer-item.component';

describe('ProducerItemComponent', () => {
  let component: ProducerItemComponent;
  let fixture: ComponentFixture<ProducerItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProducerItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProducerItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
