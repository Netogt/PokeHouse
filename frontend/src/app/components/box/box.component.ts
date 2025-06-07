import { Component } from '@angular/core';

@Component({
  selector: 'app-box',
  imports: [],
  templateUrl: './box.component.html',
  styleUrl: './box.component.scss'
})

export class BoxComponent {

  pokemons: any = [];

  async fetchPokemon(): Promise<void>{

    for (let i = 1; i < 31; i++) {
      const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${i}`);
      const data = await response.json();
      this.pokemons.push({
        name: data.name,
        image: data.sprites.other['official-artwork'].front_default
      })
    }
   
    console.log(this.pokemons);
  }
  ngOnInit():void {
    this.fetchPokemon();
  }
}
