package com.corp.ranges

class RangeRunner {

    static void main(String[] args) {

        def range = 2..8 // [2, 3, 4, 5, 6, 7, 8] - 8 ВКЛЮЧИТЕЛЬНО!
        def secondRange = 2..<8 // [2, 3, 4, 5, 6, 7] - 8 НЕ ВКЛЮЧЕНО!
        assert range.getClass() == IntRange

        assert range.get(3) == 5 // Обращаемся как со списком
        assert range.contains(8) == true // 8 ВКЛЮЧИТЕЛЬНО!
        assert secondRange.contains(8) == false // 8 НЕ ВКЛЮЧЕНО!

        range.each { println it }

        ('a'..'d').each { println it }

        (WeekDay.MO..WeekDay.FR).each { println it}
        (WeekDay.FR..WeekDay.MO).each { println it}
        List
    }
}
