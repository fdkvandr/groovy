package com.corp.condition

class ConditionRunner {

    static void main(String[] args) {
        int x = 10
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println person?.getId()
        }


        def result = x ?: 1
        print result
    }
}
