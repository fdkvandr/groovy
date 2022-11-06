package com.corp.stringAndGString

def valueInt = 5
def valueString = "hello!"


def name1 = "Ivan \"Hi!\" $valueInt $valueString"
def name2 = 'Hello "Hi!"'
def name3 = '''Ivan'''
def name4 = """
SELECT *
FROM table_name t
"""
def name5 = /Ivan/
def name6 = $/Ivan/$

println name1[3]

def func(def name) {
    "Hello, $name"
}
println "Example: ${func('Ivan')}"

def name = "IvaIvna"
println name[1]
println name[-1] // Для вывода последнего символа
println name[1..2] // Для того, чтобы взять substring
println name * 3 // Для у
println name - 'Ivan'
println name - 'Iv'
println name - 'na'