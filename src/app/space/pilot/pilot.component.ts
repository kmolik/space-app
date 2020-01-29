import { Component, OnInit, Input } from '@angular/core';
import { Pilot } from '../pilot';

@Component({
  selector: 'app-pilot',
  templateUrl: './pilot.component.html',
  styleUrls: ['./pilot.component.sass']
})
export class PilotComponent implements OnInit {
pilots: Pilot[] = [];

  @Input() pilot: Pilot;

  constructor() { }

  ngOnInit() {
  }

}
