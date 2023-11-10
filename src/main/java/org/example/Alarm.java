package org.example;

public class Alarm {
    /*
     Напишите функцию с именем setAlarm/set_alarm/set-alarm/setalarm (в зависимости от языка), которая получает два параметра.
     Первый параметр, employed, имеет значение true всякий раз, когда вы работаете, а второй параметр, vacation имеет значение true всякий раз, когда вы находитесь в отпуске.
     Функция должна возвращать значение true, если вы работаете, а не в отпуске (потому что именно при таких обстоятельствах вам необходимо установить будильник).
     В противном случае она должна возвращать значение false.

                    employed | vacation
                true     | true     => false
                true     | false    => true
                false    | true     => false
                false    | false    => false
    */
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed && vacation) return false;
        else if (!employed && vacation) return false;
        else return employed;

    }
}
