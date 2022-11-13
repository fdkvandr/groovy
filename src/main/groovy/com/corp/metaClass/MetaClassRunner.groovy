package com.corp.metaClass

import com.corp.oop.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {

    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        println "Hello"

        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test 2")
        // Первый аргумент - это объект у коротого мы вызываем метод println, потому что мы получили этот метод (мы передаем student, но так получается, что это dummy объект и он ни на что не влияет, потому что наш метод статический). А все остальные - это аргументы этого метода, т.е. для println это self (т.к. он статический), поэтому мы передаем снова student и value
        // Получилось, что мы как будто вызвали student.println("Test 2")

        // MetaClassImpl
        println student.metaClass
        println student.metaClass.methods
        println student.metaClass.properties

        // ExpandoMetaClass
        student.metaClass.abc = "Test property"
        student.metaClass.testMethod = { println "It`s a new method" }
        println student.abc
        student.testMethod()
        println student.metaClass

        student.class.metaClass.newMethod = {int value ->
            println "New method in class Student, $value"
        }
//        Поскольку мы добавили новый метод после создания объекта, то будет Exception, но для новых объектов уже этот метод будет
//        student.newMethod(28)
        def student2 = new Student()
        student2.newMethod(28)
    }
}
