# Javascript - Dynamic
    5. Update ``card.component.ts`` to request data from a service:

` 
  cats: Array<any> = [];

  constructor(private cardService: CardService) { }

  ngOnInit(): void {
    this.cardService.getCats().subscribe((cats) => this.cats = cats);
  }
`{{copy}}


    6. Add the HttpClientModule in the app.module.ts

`  imports: [
    BrowserModule,
    HttpClientModule
  ]`

    7. Create a new service

`ng g s card/card`{{execute}}

    8. Update ``card.service.ts`` to recieve data from backend
` 
    private catsUrl = '/cats';
  //private imagesUrl = '/images/search';
  // https://docs.thecatapi.com/api-reference/images/images-search

  constructor(private http: HttpClient ) { }

  getCats() {
    return this.http.get(this.catsUrl);
  }
`{{copy}}

Bonus points for loading the cats images from an external resource.
HINT: you can use the commented api.
