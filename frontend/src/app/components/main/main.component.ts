import { Component } from '@angular/core';
import { BoxComponent } from "../box/box.component";
import { AsideComponent } from "../aside/aside.component";

@Component({
  selector: 'app-main',
  imports: [BoxComponent, AsideComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

}
