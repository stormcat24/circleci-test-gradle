package com.github.stormcat24.circleci

import spock.lang.Specification
import spock.lang.Unroll


/**
 *
 * @author stormcat24
 */
@Unroll
class CircleCiGradleSpec extends Specification {

    def "test execute #value"() {

        when:
        def target = new CircleCiGradle()
        def actual = target.execute(value)

        then:
        expect == actual

        where:
        value   | expect
        "hoge1" | "execute(hoge1)"
        "hoge2" | "execute(hoge2)"
        "hoge3" | "execute(hoge3)"

    }
}