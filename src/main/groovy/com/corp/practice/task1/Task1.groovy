package com.corp.practice.task1

import com.corp.oop.Student

class Task1 {

    static void main(String[] args) {

        Class.metaClass.make = { Object[] values ->
            println thisObject
            println owner
            println delegate
            delegate.metaClass.invokeConstructor(values)
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 5])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()

        println hashSet
        println student
        println student2
    }
}
