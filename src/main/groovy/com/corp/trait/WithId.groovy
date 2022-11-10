package com.corp.trait

trait WithId {

    Integer id

    boolean validateId() {
        id > 0
    }
}