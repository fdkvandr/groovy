package com.corp.practice.task2

class Task2 {

    static void main(String[] args) {
        firstOption()
        thirdOption()
    }

    private static def secondOption() {
        Integer.metaClass.getCm {
            delegate * 10
            // Если укажем this, то он указывает на thisObject, т.е. указывает на тот класс, в котором мы его определили
        }

        Integer.metaClass.getMm {
            delegate
            // Если укажем this, то он указывает на thisObject, т.е. указывает на тот класс, в котором мы его определили
        }

        Integer.metaClass.getM {
            delegate * 1000
            // Если укажем this, то он указывает на thisObject, т.е. указывает на тот класс, в котором мы его определили
        }

        println 3.cm + 1.m - 25.mm
    }

    private static def thirdOption() {
        // Чтобы нам не открывать кждый раз Integer.metaClass при добавлении метода, можно их добавить все разом

        Integer.metaClass {
            getCm {
                delegate * 10
            }
            getMm {
                delegate
            }
            getM {
                delegate * 1000
            }

        }
        println 3.cm + 1.m - 25.mm
    }

    private static def firstOption() {
        use(IntegerMethods) {
            println 3.cm + 1.m - 25.mm
        }
    }
}
