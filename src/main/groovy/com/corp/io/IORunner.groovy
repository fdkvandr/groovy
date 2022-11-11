package com.corp.io

import groovy.io.FileType

class IORunner {

    static void main(String[] args) {

        def file = new File(".gitignore")
        file.each { it -> println it }

        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        def file2 = new File("text.txt")
        file2.text = "Some text" // При отсутсвии файла - создаст. Также перетерает старые записи в файле
        file2 << "New line" << System.lineSeparator() << "Second Line"


        def srcDir = new File("src")
        srcDir.eachDir { println it }
        srcDir.eachDirRecurse { println it }
        srcDir.eachFile(FileType.DIRECTORIES) { println it }
    }
}
