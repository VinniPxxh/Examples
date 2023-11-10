package org.example.Phone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит" + " " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + "с номера: " + number);
        System.out.println("Мой номер: " + getNumber());
    }


    public void sendMessage(String message, String... numbers) {
        System.out.println("Сообщение: " + message + "отправил(а): " + Arrays.toString(numbers));
//        for (String phone : numbers) {
//            System.out.println(phone);
//        }
//        System.out.println(Arrays.toString(numbers)); или так
    }


}
