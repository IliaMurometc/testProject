package com.specs
import spock.lang.Specification
import spock.lang.Unroll

class AdderSpec extends Specification {

    Adder adder = new Adder()

    @Unroll("#i + #j == #sum?")
    def 'can add two numbers together to produce a sum'() {
        expect: "expected"
            sum == adder.add(i, j)
        where: "were"
            i | j | sum
            1 | 2 | 3
            2 | 2 | 4
           -1 | 1 | 0
    }

}

