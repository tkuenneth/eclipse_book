import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  clickMessage = 'Noch kein Versuch';
  title = 'AngularZahlenraten';
  min = 1;
  max = 20;
  guess;

  constructor(private httpClient: HttpClient) {
  }

  onClickMe() {
      const url = `http://localhost:8080/guess?guess=${this.guess}&min=${this.min}&max=${this.max}`;
      this.httpClient.get(url).subscribe((res: any[]) => {
          const correct = res['correct'];
          console.log(res);
          this.clickMessage = correct ? 'Richtig' : 'Falsch';
          });
  }
}
