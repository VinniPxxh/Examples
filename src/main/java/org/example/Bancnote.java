package org.example;

import lombok.Getter;

@Getter
public enum Bancnote {
    FIVE_THOUSAND(5000),
    ONE_THOUSAND(1000),
    FIVE_HUNDRED(500),
    ONE_HUNDRED(100),
    FIFTY(50);

    private final int value;

    Bancnote(int value) {
        this.value = value;
    }
}