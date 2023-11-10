package org.example.Phone;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+7111111111", "IPhone XS", 150.3);
        Phone phone2 = new Phone("+7222222222", "IPhone 8");
        Phone phone3 = new Phone();
        phone3.setNumber("+733333333");
        phone3.setModel("Samsung");
        phone3.setWeight(200.5);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println("\n");

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println("\n");

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println("\n");

        phone1.receiveCall("Игорь");
        phone2.receiveCall("Маша");
        phone1.receiveCall("Маша", "+7222222222");
        phone2.receiveCall("Игорь", "+7111111111");
        System.out.println("\n");
        phone1.sendMessage("Сообщение1 ", "1111111111", "22222222222", "333333333333", "44444444444");
        phone1.sendMessage("Сообщение2 ", "5555555555", "66666666666");
    }
}
