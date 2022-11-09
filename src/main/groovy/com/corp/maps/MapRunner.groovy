package com.corp.maps

class MapRunner {

    static void main(String[] args) {

        def map = ["one": 1, "two": 2]
        assert map.getClass() == LinkedHashMap

        // Read
        assert map.get("one") == 1 // Получение значение по ключу, как в Java
        assert map["one"] == 1 // Обращение как с массивом - достаем по ключу
        assert map."one" == 1 // Обращение как к свойству
        assert map.one == 1 // Если наша строка состоит из одного слова, то можно даже опустить кавычки

        assert map.get("dummy", 10) == 10 // Эквивалентно Java методу getOrDefault()
        assert map.get("dummy1", 20) == 20 // Java method. При остутсвии такого ключа в map - добавляет его, присваивает дефолтное значение и возвращает его

        // Write
        map.put("thour", 4) // Java method
        map["six"] = 6
        map.three = 3
        map."five" = 5

        //Получение под-map`ы
        assert map.subMap("one", "thour", "three") == ["one": 1, "thour": 4, "three": 3]
        assert map.subMap("one", "rrr", "three") == ["one": 1, "three": 3]


        def newMap = ["q": 22, "rt": 99, *:map] // Добавление map`ы к map`е
        // Можно сделать тоже самое через putAll(Map<K, V>)
        println newMap
    }
}
