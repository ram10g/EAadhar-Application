import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisPageComponent } from './regis-page.component';

describe('RegisPageComponent', () => {
  let component: RegisPageComponent;
  let fixture: ComponentFixture<RegisPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegisPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
