import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-book-dashboard',
    templateUrl: './book-dashboard.component.html',
    styleUrls: ['./book-dashboard.component.scss']
})

export class BookDashboardComponent implements OnInit {
    public count = [1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2];
    constructor() { }

    ngOnInit() {

    }

}
