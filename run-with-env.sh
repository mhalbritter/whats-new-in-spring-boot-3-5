#!/usr/bin/env bash

set -euo pipefail

./gradlew bootJar

export MY_CONFIGURATION="my.name=Moritz
my.employer=Broadcom"

java -jar build/libs/boot-three-five-0.0.1-SNAPSHOT.jar --spring.config.import=env:MY_CONFIGURATION
