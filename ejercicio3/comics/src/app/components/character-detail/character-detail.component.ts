import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Component, Inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatDialogModule } from '@angular/material/dialog';
@Component({
  selector: 'app-character-detail',
  standalone: true,
  imports: [CommonModule, MatDialogModule],
  templateUrl: './character-detail.component.html',
  styleUrl: './character-detail.component.css',
})
export class CharacterDetailComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public data: any) {}
}
