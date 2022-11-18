# Javascript - Dynamic
We can fetch data from a dynamic api by creating a new angular service and doing an HTTP request to receive the payload:
You can check the response by calling:
``http://aim.incubation.tech:8080/cats``

    5. Add the HttpClientModule in the app.module.ts. This module will allow us to do the HTTP request and retrieve data from the endpoint above.

Import the module:
```
import { HttpClientModule } from '@angular/common/http';
```{{copy}}

Update the imports:
```  
imports: [
    BrowserModule,
    HttpClientModule
]
```

    6. Create a new service

`ng g s card/card`{{execute}}

The service should be imported added to the module providers in app.module.ts
Import the service:
```
 import{ CardService } from './card/card.service';
```{{copy}}

Module providers:
```
  providers: [ CardService ],
```


    7. Update ``card.service.ts`` to recieve data from backend
```
    private catsUrl = '/cats';
  //private imagesUrl = '/images/search';
  // https://docs.thecatapi.com/api-reference/images/images-search

  constructor(private http: HttpClient ) { }

  getCats() {
    return this.http.get(this.catsUrl);
  }
```{{copy}}


   8. Update ``card.component.ts`` to request data from a service:
Import the service:
```
import { CardService } from './card.service';
```{{copy}}

Component scope:
``` 
  cats: Array<any> = [];

  constructor(private cardService: CardService) { }

  ngOnInit(): void {
    this.cardService.getCats().subscribe((cats: any) => this.cats = cats);
  }
```{{copy}}



Bonus points for loading the cats images from an external resource.
HINT: you can use the commented api.