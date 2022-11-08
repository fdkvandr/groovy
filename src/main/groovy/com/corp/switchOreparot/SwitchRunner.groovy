package com.corp.switchOreparot

import com.corp.condition.Person

class SwitchRunner {

    static void main(String[] args) {
        int x = 12
        switch (x) {
            case String:        // isInstance()
                println 0
                break
            case 5:             // equals(), ==
                println 1
                break
            case new Person(29): // person.isCase(x)
                println 5
                break
            case ~/\d+/:        // pattern.matcher(x.toString()).matches()
                println 2
                break
            case { it % 5 == 0 }:
                println 3
                break
            case [1, 3, 5, 9]:  // list.isCase(x)
                println 4
                break
            default:
                println "None"
                break
        }

        if (x int[1, 3, 4, 6, 5]) {
            println x
        }
    }
}
