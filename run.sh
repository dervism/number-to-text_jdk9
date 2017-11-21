#!/bin/bash

set -e

cd number_main

LANG=$2
if [ -z "$2" ]; then
    LANG=en
fi

mvn exec:exec -Dnumber="$1" -Dlang="$LANG"
