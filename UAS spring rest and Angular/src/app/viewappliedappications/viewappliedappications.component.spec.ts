import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewappliedappicationsComponent } from './viewappliedappications.component';

describe('ViewappliedappicationsComponent', () => {
  let component: ViewappliedappicationsComponent;
  let fixture: ComponentFixture<ViewappliedappicationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewappliedappicationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewappliedappicationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
