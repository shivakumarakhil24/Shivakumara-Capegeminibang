import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MacOperationsComponent } from './mac-operations.component';

describe('MacOperationsComponent', () => {
  let component: MacOperationsComponent;
  let fixture: ComponentFixture<MacOperationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MacOperationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MacOperationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
