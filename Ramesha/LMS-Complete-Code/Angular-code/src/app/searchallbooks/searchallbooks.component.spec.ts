import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchallbooksComponent } from './searchallbooks.component';

describe('SearchallbooksComponent', () => {
  let component: SearchallbooksComponent;
  let fixture: ComponentFixture<SearchallbooksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchallbooksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchallbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
