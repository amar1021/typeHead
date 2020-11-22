import { Component } from '@angular/core';
import { TypeaheadMatch } from 'ngx-bootstrap/typeahead/typeahead-match.class';
import { HttpClient } from '@angular/common/http';
 
import { noop, Observable, Observer, of } from 'rxjs';
import { map, switchMap, tap } from 'rxjs/operators';
 

interface searchParameters {
  id: string;
  name:  number;
  description: string;
}
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'searchEngine-acoustic';
  selected: string;

  suggestions$: Observable<searchParameters[]>;
  errorMessage: string;
  search: string;
  collection = [];
  p: any;
  noResultFound = true;
  initial: boolean = true;
  constructor(private http: HttpClient) {  }
 
  ngOnInit(): void {
    this.suggestions$ = new Observable((observer: Observer<string>) => {
      observer.next(this.search);
    }).pipe(
      switchMap((query: string) => {
        if (query) {
          return this.http.get<any>(
              'http://localhost:8481/topics',{
            params: { q: query }
          }).pipe(
            map((data: any) => {
              if(!data || data.length < 1){
                this.noResultFound = false;
              } else {
                this.initial = false;
              }
              return data || []}),
            tap(() => noop, err => {
              // in case of http error
              this.errorMessage = err && err.message || 'Something goes wrong';
            })
          );
        }
 
        return of([]);
      })
    );
  }

  onSelect(event: any): void {
    if(this.search && this.search !== "" && this.search !== undefined ){
      let qry;
      if(event.item === undefined || event.item === null){
        qry = event;
      }else {
        qry = event.item.name;
      }
      this.http.get<any>(
          'http://localhost:8481/topics/desc',{
        params: { q: qry }
      }).subscribe(data => {
        if(data.length < 1){
          this.noResultFound = true;
        }else {
          this.noResultFound = false;
          data.forEach(element => {
            this.collection.push(element.description);
          });;
        }
      })
    }
  }

  clear(){
    this.search = "";
    this.initial = true;
  }
}
