package com.corp.oop

import java.util.stream.Collectors

class OopRunner {

    static void main(String[] args) {
        def student = new Student()

        student.firstName = "Ivan" // setFirstName

        println student.firstName  // getFirstName
        println student['firstName'] // Получаем как будто это Map
        println student.'firstName' // Даже скобочки можно опустить

        println student.@firstName // Обойдем getter`ы и setter`ы и на прямую возьмем это поле

        def student1 = new Student(firstName: "Petr", lastName: "Petrov", age: 18, id: -1)
        assert !student1.validateId()
        println student1

        Student student2 = ['Sveta', 'Sveticova', 30] // coercion
        println student2

        def (fn, ln) = student2
        println fn
        println ln

//        def collect = [student1, student2].stream().map(it -> it.firstName).collect(Collectors.toList())
//        def collect = [student1, student2].collect { it.firstName }
//        def collect = [student1, student2]*.firstName // Указываем звездочку и поле, которое нас интересует
        def collect = [student1, student2].firstName // Звездочку можно опустить
        println collect
    }
}
