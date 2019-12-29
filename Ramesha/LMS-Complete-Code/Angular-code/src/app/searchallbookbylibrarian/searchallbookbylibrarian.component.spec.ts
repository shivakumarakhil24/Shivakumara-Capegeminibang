import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchallbookbylibrarianComponent } from './searchallbookbylibrarian.component';

describe('SearchallbookbylibrarianComponent', () => {
  let component: SearchallbookbylibrarianComponent;
  let fixture: ComponentFixture<SearchallbookbylibrarianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchallbookbylibrarianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchallbookbylibrarianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
