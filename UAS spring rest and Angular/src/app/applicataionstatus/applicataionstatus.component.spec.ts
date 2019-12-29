import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplicataionstatusComponent } from './applicataionstatus.component';

describe('ApplicataionstatusComponent', () => {
  let component: ApplicataionstatusComponent;
  let fixture: ComponentFixture<ApplicataionstatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApplicataionstatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApplicataionstatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
