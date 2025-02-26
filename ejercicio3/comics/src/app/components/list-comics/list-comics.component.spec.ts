import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListComicsComponent } from './list-comics.component';

describe('ListComicsComponent', () => {
  let component: ListComicsComponent;
  let fixture: ComponentFixture<ListComicsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListComicsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListComicsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
