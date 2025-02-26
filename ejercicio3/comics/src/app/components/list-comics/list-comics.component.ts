import { Component, inject, OnInit } from '@angular/core';
import { ComicsService } from '../../services/comics.service';
import { CommonModule } from '@angular/common';
import { CharacterDetailComponent } from '../character-detail/character-detail.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-list-comics',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-comics.component.html',
  styleUrl: './list-comics.component.css',
})
export class ListComicsComponent implements OnInit {
  characters: any[] = [];
  ComicsService = inject(ComicsService);
  dialog = inject(MatDialog);

  ngOnInit() {
    this.ComicsService.getCharacters().subscribe((data) => {
      this.characters = data.data.results;
    });
  }

  constructor() {}

  openCharacterDetail(character: any) {
    this.ComicsService.getCharacterById(character.id).subscribe((data) => {
      console.log(data.data.results[0]);

      this.dialog.open(CharacterDetailComponent, {
        width: '400px',
        data: data.data.results[0],
      });
    });
  }
}
