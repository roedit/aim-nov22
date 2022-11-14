#!/bin/bash
echo "Installing node and angular"
apt -y update && apt -y upgrade && apt install -y curl && apt install -y npm 
curl -sL https://deb.nodesource.com/setup_16.x | bash -
apt install nodejs -y
npm install -g @angular/cli 
cd assets
npm install
clear && echo "Welcome to the tutorial, all the dependencies are installed, and you should be good to go!"
npm run start
