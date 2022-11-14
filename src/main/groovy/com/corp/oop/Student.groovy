package com.corp.oop

import com.corp.trait.WithId
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student implements WithId {

    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"

        def field = name - 'findBy'
        def fieldValue = this.age
        println "SELECT * FROM student WHERE $field = $fieldValue"
    }

    def propertyMissing(String name) {
        println "missing property $name is invoked"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject // == this
            println owner
            println delegate

            Closure second = {
                println thisObject // == this
                println owner
                println delegate
            }
            second()
        }
        closure
    }
}

