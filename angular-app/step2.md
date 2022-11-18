# HTML
Follow the steps below to create the website content.
    1. Generate new angular component named card by running the fallowing angularcli command:

`ng g c card`{{execute}}

    2. Update the html structure for the newly created component on the file card.component.html to include the fallowing html:
```
<div class="card-container">
    <div class="card">
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

Use the card component by updating the app.component.ts by adding the fallowing in the "content" div:
`
  <app-card></app-card>
`{{copy}}