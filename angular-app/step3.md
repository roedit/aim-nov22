# CSS
    2. Align component in the middle
`
.card-container {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    margin-top: 16px;
}
`{{copy}}
    3. Set image withing the card bounderies
`
.card {
    width: 300px;
    margin: 30px auto;
    background-color: white;
    box-shadow: 0px 5px 20px #555;
}

.card-body {
    text-align: center;
    padding: 15px 20px;
    box-sizing: border-box;
}

.card-image {
    height: 150px;
    position: relative;
    overflow: hidden;
}

img {
    width: 100%;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    filter: grayscale(1);
    transition-property: filter width;
    transition-duration: .3s;
}
`{{copy}}
    4. Additional styles to make the card nicer
`
.card a {
    color: #333;
    text-decoration: none;
}

.card a:hover img {
    width: 100%+10%;
    filter: grayscale(0);
}


.card-breed {
    font-family: 'Source Sans Pro', sans-serif;
}

.card-title,
.card-exceprt {
    font-family: 'Playfair Display', serif;
}

.card-breed,
.card-title {
    text-align: center;
    text-transform: uppercase;
    font-weight: bold;
}

.card-breed,
.card-excerpt {
    color: #777;
}
`{{copy}}