import { Component, inject, OnInit, signal } from '@angular/core';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { NzListModule } from 'ng-zorro-antd/list';
import { NzGridModule } from 'ng-zorro-antd/grid';
import { Post, PostService } from '../../services/post.service';

@Component({
  selector: 'app-home',
  imports: [
    NzButtonModule,
    NzListModule,
    NzGridModule,
  ],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home implements OnInit {
  private postService = inject(PostService);

  data = signal<Post[]>([]);
  loading = signal(false);

  ngOnInit(): void {
    this.loadPosts();
  }

  change(): void {
    this.loading.set(true);
    setTimeout(() => this.loadPosts(), 1000);
  }

  private loadPosts(): void {
    this.postService.getPosts().subscribe(posts => {
      this.data.set(posts);
      this.loading.set(false);
    });
  }
}
