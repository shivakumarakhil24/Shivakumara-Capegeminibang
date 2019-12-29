import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewallacceptedComponent } from './viewallaccepted.component';

describe('ViewallacceptedComponent', () => {
  let component: ViewallacceptedComponent;
  let fixture: ComponentFixture<ViewallacceptedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewallacceptedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewallacceptedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
