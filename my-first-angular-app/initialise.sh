#!/bin/bash

echo "Installing node and angular"
apt update -y && apt upgrade -y && apt install -y curl && apt -y install npm 
curl -sL https://deb.nodesource.com/setup_16.x | bash -
apt install nodejs -y
npm install -g @angular/cli 
cd assets
npm install
clear && echo "Welcome to the tutorial, all the dependencies are installed, and you should be good to go!"
npm run start
