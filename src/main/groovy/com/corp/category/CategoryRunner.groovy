package com.corp.category

import com.corp.oop.Student

class CategoryRunner {

    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }
        // Вызовется methodMissing(), в противном лучае MissingMethodException
        // student.testStr()
    }
}
