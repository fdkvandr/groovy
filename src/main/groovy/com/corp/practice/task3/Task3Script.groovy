import static groovy.lang.Closure.DELEGATE_ONLY

given {
    a = 23
    b = 10
} when {
    result = a * b
} then {
    result == 230
}

def given(Closure closure) {
    def valueHolder = [:]
    closure.delegate = valueHolder
    closure.resolveStrategy = DELEGATE_ONLY
    closure()
    [when: { Closure whenClosure -> {
        whenClosure.delegate = valueHolder
        whenClosure.resolveStrategy = DELEGATE_ONLY
        whenClosure()
        [then: { Closure thenClosure -> {
            thenClosure.delegate = valueHolder
            thenClosure.resolveStrategy = DELEGATE_ONLY
            assert thenClosure()
        }
        }]
    }
    }]
}