package utils

import java.math
import java.math.BigInteger
class function {
    def factorial(x : BigInt): BigInt =
        if (x == 0) 1 else x * factorial(x - 1)

    def factorialWithJava(x: BigInteger): BigInteger =
        if(x == BigInteger.ZERO) BigInteger.ONE else x.multiply(factorialWithJava(x.subtract(BigInteger.ONE)))

    def max(x: Int, y: Int): Int = if (x > y) x else y

}
