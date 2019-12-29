import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowallissuedbooksComponent } from './showallissuedbooks.component';

describe('ShowallissuedbooksComponent', () => {
  let component: ShowallissuedbooksComponent;
  let fixture: ComponentFixture<ShowallissuedbooksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowallissuedbooksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowallissuedbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
