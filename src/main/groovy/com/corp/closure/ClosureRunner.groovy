package com.corp.closure

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {

    static void main(String[] args) {
        Function<Integer, Integer> func = value -> value + value
        def result = func.apply(5)
        println result

        Closure closure = {val = 70 ->
            println val
            val + val
        }

        def result1 = closure()
        println result1

        Stream.of(1, 2, 3, 4)
                .map(func)
                .map(closure)
                .map(value -> value + value)
                .map(String.&valueOf)
                .forEach(System.out::println)


        int x = 10

        check(x > 0) {println (++x)}
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
