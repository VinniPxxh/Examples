package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ATM {
    /**
     * Банкомат.
     * Инициализируется набором купюр и умеет выдавать купюры для заданной суммы, либо отвечать отказом.
     * При выдаче купюры списываются с баланса банкомата.
     * Допустимые номиналы: 50₽, 100₽, 500₽, 1000₽, 5000₽.
     */


    public enum Bancnote {
        FIVE_THOUSAND(5000),
        ONE_THOUSAND(1000),
        FIVE_HUNDRED(500),
        ONE_HUNDRED(100),
        FIFTY(50);

        private int value;

        Bancnote(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    Map<Bancnote, Integer> cash = new HashMap();

    public ATM(Map<Bancnote, Integer> cash) {
        this.cash = cash;
    }

    public HashMap<Bancnote, Integer> money(int ruble) {
        HashMap<Bancnote, Integer> result = new HashMap<>();
        for (Bancnote bancnote : Bancnote.values()) {
            int numberOfBanknotes = bancnote.getValue();
            if (numberOfBanknotes > 0) {
                result.put(bancnote, numberOfBanknotes);
                ruble -= numberOfBanknotes * bancnote.getValue();
            }
        }
        if (ruble == 0) {
            return result;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        ATM bancomat = new ATM(Map.of(Bancnote.ONE_THOUSAND, 2, Bancnote.ONE_HUNDRED, 3, Bancnote.FIFTY, 1));
        System.out.println(bancomat.money(100));
    }
}
