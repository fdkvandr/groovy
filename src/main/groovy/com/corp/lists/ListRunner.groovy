package com.corp.lists

class ListRunner {

    static void main(String[] args) {

        def list = [1, 3, 4]
        assert list.getClass() == ArrayList.class

        // Read
        assert list[2] == 4         // Работа как с Array
        assert list.get(2) == 4     // Работа как с ArrayList
        assert list[-1] == 4        // Работа как со строками
        assert list[1..2] == [3, 4] // Работа как со строками. Более того используем Range
        assert list[8] == null      // !!! Получим null а не OutOfBoundException как в Java

        // Write
        list += 9
        // Просто добавляем в конец ArrayList значение. Т.е. вроде работаем как с массивом, но под капотом - ArrayList
        list += [7, 8]
        list << 11 // Просто добавляем в конец ArrayList значение
        list << 11 << 15 << 123// Можно даже продолжать
        list.add(12) // Работа как с ArrayList
        assert list == [1, 3, 4, 9, 7, 8, 11, 11, 15, 123, 12]

        // Можно умножать на число
        assert [7, 8] * 3 == [7, 8, 7, 8, 7, 8]

        // Delete
        list -= 11 // Удалит все элементы со значением 11
        list -= [7, 8] // Удалит все элементы из списка с такими значениями
//        list.remove() // Работа как с ArrayList
//        list.pop() / Работа как с ArrayList
        assert list == [1, 3, 4, 9, 15, 123, 12]

        list.push(999) // Добавление элементов вначало списка
        assert list.pop() == 999 // Удаление элементов из начала очереди (сразуже возвращает его)
        assert list.head() == 1 // Выдает, но не удаляет первый элемент из очереди
        assert list.tail() == [3, 4, 9, 15, 123, 12]
        assert list.last() == 12 // Выдает, но не удаляет последний элемент очереди

        assert [1, 2, [4, 6, 7,]].flatten() == [1, 2, 4, 6, 7]
        // Разворачиват все массивы в один. Почти как flatMap() у Stream
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 4]) == [2, 3] // Пересечение множеств
        assert [1, 2, 3].disjoint([4, 5, 6]) == true // Возвращает true, если нету пересечения с другой коллекцией

        def (a, b, c) = [3, 5]
        assert a == 3
        assert b == 5
        assert c == null
        // Остальные значения ни к чему не присвоятся просто

        func(*[3, 3], 1)
    }

    static void func(def a, def b, def c) {
        println(a)
        println(b)
        println(c)
    }
}
