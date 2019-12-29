import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetstatusComponent } from './setstatus.component';

describe('SetstatusComponent', () => {
  let component: SetstatusComponent;
  let fixture: ComponentFixture<SetstatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetstatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetstatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
