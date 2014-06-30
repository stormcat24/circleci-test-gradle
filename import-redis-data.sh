#!/usr/bin/env bash
REDIS_VERSION="2.8.12"
REDIS_CLI="redis-$REDIS_VERSION/src/redis-cli"
cat testdata/data.txt | xargs -L1 $REDIS_CLI

