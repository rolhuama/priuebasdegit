#!/bin/bash

git init
git pull https://github.com/rolhuama/pruebasdecodigo.git
gradle bootjar
docker build -t demo .
docker tag demo rolervengador/demo
docker push rolervengador/demo
docker run -dp 9000:8080 demo
