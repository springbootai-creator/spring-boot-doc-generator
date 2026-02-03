#!/bin/bash
cd $(dirname $0)
mvn clean install
mvn spring-boot:run
