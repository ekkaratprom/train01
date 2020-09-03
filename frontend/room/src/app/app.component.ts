import { Room } from './room.model';
import { RoomService } from './room.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'room';
  rooms: Room[] = [];

  constructor(public service: RoomService) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(): void {
    this.service.getAllRooms().subscribe(
      (rooms) => {
        return (this.rooms = rooms);
      }
    );
  }




}
