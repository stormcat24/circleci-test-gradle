package com.github.stormcat24.circleci;

import lombok.Delegate;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author stormcat24
 */
@RequiredArgsConstructor
public class RedisClient {

    @NonNull
    private final String host;

    @NonNull
    private final int port;

    private JedisPool pool;

    @Delegate
    private Jedis jedis;

    public void begin() {
        pool = new JedisPool(new JedisPoolConfig(), host, port);
        jedis = pool.getResource();
    }

    public void finish() {
        pool.returnResource(jedis);
        pool.destroy();
    }
}
