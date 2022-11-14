#!/bin/bash

echo "Installing node and angular"
apt update && apt upgrade && apt install -y curl && apt install npm 
curl -s https://deb.nodesource.com/setup_16.x | sudo bash
apt install nodejs -y
npm install -g @angular/cli && clear && echo "Welcome to the tutorial, all the dependencies are installed, and you should be good to go!"
