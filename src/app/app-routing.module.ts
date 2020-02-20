import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HangarComponent } from './space/hangar/hangar.component';
import { BlackHoleComponent } from './black-hole/black-hole.component';



const routes: Routes = [
  {path: 'space', component: HangarComponent},
  {path: '', redirectTo: 'space', pathMatch: 'full'},
  {path: '**', component: BlackHoleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
