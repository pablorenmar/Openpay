import { Component, inject, OnInit } from '@angular/core';
import { ComicsService } from '../../services/comics.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-logs',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './logs.component.html',
  styleUrl: './logs.component.css',
})
export class LogsComponent implements OnInit {
  logs: any[] = [];
  ComicsService = inject(ComicsService);

  constructor() {}

  ngOnInit() {
    this.ComicsService.getLogs().subscribe((data) => {
      this.logs = data;
    });
  }
}
