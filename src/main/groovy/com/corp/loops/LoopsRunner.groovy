package com.corp.loops

class LoopsRunner {

    static void main(String[] args) {
        while (false) {
            println 1
        }


        for (i in 0..<3) {

        }


        def list = [1, 2, 3, 4, 5]
        for (int i = 0; i < 10; i++) {
        }

        for (def i = 0; list.size() < 5; i++) {
        }

        for (i in 0..list.size()) {
            println(list[i])
        }

        for (Integer value : list) {}

        for (value in list) {}

        0.upto(list.size()) {
            println it
        }

        list.size().downto(0) {
            println it
        }

        list.size().times {
            println it
        }

        0.step(5, 2) {
            println it
        }
    }
}
