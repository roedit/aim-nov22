# HTML - Dynamic

    5. Update the html structure of the card.component.html to the fallowing: 
    
```
<div class="card-container">
    <div class="card" *ngFor="let cat of cats">
        <a href="#">
            <div class="card-image">
                <img src="{{cat.url}}" alt="cat-img" />
            </div>

            <div class="card-body">
                <div class="card-breed">
                    <time>{{cat.breed}}</time>
                </div>

                <div class="card-title">
                    <h3>{{cat.name}}</h3>
                </div>

                <div class="card-excerpt">
                    <p>Favourite food: {{cat.likes}}</p>
                </div>
            </div>
        </a>
    </div>
</div>
```{{copy}}

This bounds values from the card.component.ts to the html and updates dynamicly the values.