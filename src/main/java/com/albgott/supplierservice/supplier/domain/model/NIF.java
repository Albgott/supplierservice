package com.albgott.supplierservice.supplier.domain.model;

import java.util.Objects;

public class NIF {
    private final static char[] allowedLettersForNIF = { 'T', 'R', 'W', 'A',
            'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
            'V', 'H', 'L', 'C', 'K', 'E', 'T' };

    private String value;


    protected NIF() {
    }

    public NIF(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NIF NIF = (NIF) o;
        return Objects.equals(value, NIF.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String value(){
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
