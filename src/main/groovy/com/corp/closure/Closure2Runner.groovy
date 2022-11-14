package com.corp.closure

import com.corp.oop.Student

class Closure2Runner {

    static void main(String[] args) {
        Closure closure = {
            // this
            firstName = "Sveta"
        }

        println closure.thisObject
        println closure.owner
        println closure.delegate
//
        def student = new Student("Ivan", "Ivanov", 29)
        println student

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()
        student.with closure
//        student.with { firstName = "Sveta"}

        student.getInfo()()
    }
}
