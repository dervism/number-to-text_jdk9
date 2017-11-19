#!/bin/bash

set -e

cd number_main

mvn exec:exec -Darg="$1"
