package com.corp.trait

class MixinClass {

    static def testMixin(String self, String point='.') {
        println "Hello $self$point"
    }
}
