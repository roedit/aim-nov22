# HTML
Follow the steps below to create the website content.
    1. Generate new card component

`ng g c card`{{execute}}

    2. Update the html structure 
```
<div class="card-container">
    <div class="card" *ngFor="let cat of cats">
        <a href="#">
            <div class="card-image">
                <img src="https://cdn2.thecatapi.com/images/U3G5VhSBE.jpg" alt="cat-img" />
            </div>

            <div class="card-body">
                <div class="card-breed">
                    <time>BENGAL</time>
                </div>

                <div class="card-title">
                    <h3>Milo</h3>
                </div>

                <div class="card-excerpt">
                    <p>Favourite food: Chicken, Fish</p>
                </div>
            </div>
        </a>
    </div>
</div>
```{{copy}}

Include the card component in the app.component.ts inside the content div
`
  <app-card></app-card>
`{{copy}}