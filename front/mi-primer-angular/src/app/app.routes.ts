import { Routes } from '@angular/router';
import { UserComponent } from './view/user/user.component/user.component';
import { PokemonComponent } from './view/components/pokemon.component/pokemon.component';

export const routes: Routes = [
    { path: '', redirectTo: 'user', pathMatch: 'full' },
    { path: 'user', component: UserComponent }, //guards
    { path: 'pokemon', component: PokemonComponent }
];
