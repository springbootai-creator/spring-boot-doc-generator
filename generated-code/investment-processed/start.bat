@echo off
cd %~dp0
mvn clean install
mvn spring-boot:run
