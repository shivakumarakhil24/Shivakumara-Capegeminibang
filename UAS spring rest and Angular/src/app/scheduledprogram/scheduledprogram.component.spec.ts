import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ScheduledprogramComponent } from './scheduledprogram.component';

describe('ScheduledprogramComponent', () => {
  let component: ScheduledprogramComponent;
  let fixture: ComponentFixture<ScheduledprogramComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ScheduledprogramComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ScheduledprogramComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
