import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-space-ship',
  templateUrl: './space-ship.component.html',
  styleUrls: ['./space-ship.component.sass']
})
export class SpaceShipComponent implements OnInit {
  spaceShip = {
    modelName: 'TIE fighter',
    imageUrl: '/assets/TIEfighter.png',
    health: 75,
    activeShields: true,
    activeWeapons: false
  };

  constructor() { }

  ngOnInit() {
  }

}
