#!/usr/bin/env bash
set -e

REDIS_VERSION="2.8.12"
if [ ! -e "redis-$REDIS_VERSION/src/redis-server" ]; then
   wget http://download.redis.io/releases/redis-$REDIS_VERSION.tar.gz
   tar xvzf redis-$REDIS_VERSION.tar.gz
   cd redis-$REDIS_VERSION && make
   # start redis on background
   ./src/redis-server > /dev/null &
fi
