import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewallrejectedComponent } from './viewallrejected.component';

describe('ViewallrejectedComponent', () => {
  let component: ViewallrejectedComponent;
  let fixture: ComponentFixture<ViewallrejectedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewallrejectedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewallrejectedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
