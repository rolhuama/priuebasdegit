#!/bin/bash

mkdir demo
cd demo
git init
git pull https://github.com/rolhuama/pruebasdecodigo.git
gradle bootjar
docker build -t demo .
docker tag demo rolervengador/demo
docker push rolervengador/demo
docker run -dp 8080:8080 demo