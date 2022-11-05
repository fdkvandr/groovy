package com.corp.primitiveTypesAndVariables

import groovy.transform.CompileStatic

import java.sql.Date as SqlDate
class VariableRunner {

    def field

    /**
     * byte, short, int, long, BigInteger
     * float, double, BigDecimal
     * char
     * boolean
     */
    @CompileStatic
    static void main(String[] args, def arg) {
        int value = 5
        Integer value2
        def date = new SqlDate(1, 1, 1)
    }
}