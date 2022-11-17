#!/bin/bash
echo "Installing node and angular"
apt install net-tools && \
curl -sL https://deb.nodesource.com/setup_16.x | bash - && \
apt install nodejs -y && \
npm install -g @angular/cli && \
cd assets && \
npm install && \
clear && \
echo "Welcome to the tutorial, all the dependencies are installed, and you should be good to go!" && \
ng serve --host 0.0.0.0 --disable-host-check
