package com.corp.operationsWithVariables

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 2**3 == 8
assert 3.intdiv(2) == 1

def result = (int) 1.5
def res = 1.5 as int // def asType(clazz)

assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

def a = 5
assert a++ == 5
assert ++a == 7
assert a-- == 7
assert --a == 5

println result >= 29

print a <=> 5

a = 0b00101010
assert a == 42
int b = 0b00001000
assert b == 8
assert (a & a) == a
assert (a & b) == b
assert (a | a) == a
assert (a | b) == a

int mask = 0b11111111
assert ((a ^ a) & mask) == 0b00000000
assert ((a ^ b) & mask) == 0b00100010
assert ((~a) & mask)    == 0b11010101