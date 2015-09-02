
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by PValentinS on 17.08.2015.
 */
class MaxOfTwoSpec extends Specification{
    @Unroll
    def "maximum of two numbers"(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

//        where:
//        a | b | c
//        1 | 3 | 3
//        7 | 4 | 7
//        0 | 0 | 0

//        where:
//        a | b || c
//        3 | 5 || 5
//        7 | 0 || 7

//        where:
//        a << [3, 7, 0]
//        b << [5, 0, 0]
//        c << [5, 7, 0]

//        where:
//        [a, b, c] << sql.rows("select a, b, c from maxdata")

//        where:
//        a = 3
//        b = Math.random() * 100
//        c = a > b ? a : b

//        where:
//        row << sql.rows("select * from maxdata")
//        a = row.a
//        b = row.b
//        c = row.c

        where:
        a | _
        3 | _
        7 | _
        0 | _
        b << [5, 0, 0]
        c = a > b ? a : b
    }
}
