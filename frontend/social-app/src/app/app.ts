import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { NzIconModule } from 'ng-zorro-antd/icon';
import { NzLayoutModule } from 'ng-zorro-antd/layout';
import { NzMenuModule } from 'ng-zorro-antd/menu';




@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    NzIconModule,
    NzMenuModule,
    NzLayoutModule
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('social-app');
  protected readonly date = new Date();
}
