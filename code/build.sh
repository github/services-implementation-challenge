#!/bin/bash
# Script to build frontend and backend
set -e

echo "Building backend..."
mvn -f backend/pom.xml -s settings.xml install

echo "Buidling frontend..."
mvn -f frontend/pom.xml -s settings.xml install

mkdir ../bin
cp backend/target/backend.war ../bin/backend.war
cp frontend/target/frontend.war ../bin/frontend.war
