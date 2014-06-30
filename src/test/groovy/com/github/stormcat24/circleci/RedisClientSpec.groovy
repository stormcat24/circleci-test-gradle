package com.github.stormcat24.circleci

import spock.lang.Specification
import spock.lang.Unroll


/**
 * @author stormcat24
 */
@Unroll
class RedisClientSpec extends Specification {

    // テストの前に予めtestdata/data.txtに記述されたデータがRedisに登録されている
    def "testdata/data.txt"() {

        setup:
        RedisClient client = new RedisClient("localhost", 6379)
        when:
        client.begin()
        def actual = client.get(key)
        client.finish()

        then:
        value == actual

        where:
        key     | value
        "name1" | "tehepero1"
        "name2" | "tehepero2"
        "name3" | "tehepero3"
        "name4" | "tehepero4"
        "name5" | "tehepero5"

    }
}