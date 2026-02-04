import { Component } from '@angular/core';
import { PokemonService } from '../../../services/pokemon.service/pokemon.service';
import { CommonModule, JsonPipe } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';

@Component({
  selector: 'app-pokemon.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './pokemon.component.html',
  styleUrl: './pokemon.component.css',
})
export class PokemonComponent {
//signals

  pokemons : any[] = [];
  
  constructor(private pokemonService: PokemonService, private cdr: ChangeDetectorRef) {
    this.pokemonService.getPokemons().subscribe((data: any) => {
      this.pokemons = data.results;
      console.log(this.pokemons);
      this.cdr.detectChanges();
    });
  }
}
