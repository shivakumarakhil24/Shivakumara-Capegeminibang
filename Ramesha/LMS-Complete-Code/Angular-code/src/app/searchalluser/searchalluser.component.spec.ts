import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchalluserComponent } from './searchalluser.component';

describe('SearchalluserComponent', () => {
  let component: SearchalluserComponent;
  let fixture: ComponentFixture<SearchalluserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchalluserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchalluserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
