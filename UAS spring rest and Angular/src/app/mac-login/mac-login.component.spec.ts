import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MacLoginComponent } from './mac-login.component';

describe('MacLoginComponent', () => {
  let component: MacLoginComponent;
  let fixture: ComponentFixture<MacLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MacLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MacLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
