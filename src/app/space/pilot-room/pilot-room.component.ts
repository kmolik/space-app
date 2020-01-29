import { Component, OnInit } from '@angular/core';
import { Pilot } from '../pilot';

@Component({
  selector: 'app-pilot-room',
  templateUrl: './pilot-room.component.html',
  styleUrls: ['./pilot-room.component.sass']
})
export class PilotRoomComponent implements OnInit {
  pilots: Pilot[] = [];
  selectedPilot: Pilot = null;

  constructor() { }

  ngOnInit() {
    this.pilots.push(new Pilot('Wes Janson', '/assets/rebel1.png'));
    this.pilots.push(new Pilot('Dak Ralter', '/assets/rebel2.png'));
  }

  select(pilot: Pilot): void {
    this.selectedPilot = pilot;
  }
}
