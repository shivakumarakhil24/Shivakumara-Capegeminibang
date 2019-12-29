import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ScheduledprogramsDetailsComponent } from './scheduledprograms-details.component';

describe('ScheduledprogramsDetailsComponent', () => {
  let component: ScheduledprogramsDetailsComponent;
  let fixture: ComponentFixture<ScheduledprogramsDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ScheduledprogramsDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ScheduledprogramsDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
