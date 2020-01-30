import { Component, OnInit } from '@angular/core';
import { SpaceShipType } from '../space-ship-type.enum';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { OrderFormValue } from '../order-form-value';

interface ShipType{
  label: string;
  value: SpaceShipType;
}

@Component({
  selector: 'app-engineers-room',
  templateUrl: './engineers-room.component.html',
  styleUrls: ['./engineers-room.component.sass']
})
export class EngineersRoomComponent implements OnInit {
  spaceShipTypes: ShipType[] = [
    {label: 'Myśliwiec', value: SpaceShipType.Fighter},
    {label: 'Bombowiec', value: SpaceShipType.Bomber}
  ];

  form = new FormGroup({
    ShipType: new FormControl(SpaceShipType.Fighter, {
      validators: [Validators.required]
    }),
    shipCount: new FormControl(1, {
      validators: [Validators.required, Validators.min(1), Validators.max(5)]
    })
  });



  constructor() { }

  ngOnInit() {
  }

  orderSpaceShips(formValue: OrderFormValue): void {
    console.log(formValue);

  }

}
