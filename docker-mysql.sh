#!/bin/bash

docker run --name mysql-curso -e MYSQL_ROOT_PASSWORD=root -d  -p 33060:3306 mysql:8.0.32