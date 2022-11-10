package com.corp.trait

class MuxinRunner {

    static void main(String[] args) {
        String.mixin(MixinClass)
        "Andrey".testMixin("!")
    }
}
