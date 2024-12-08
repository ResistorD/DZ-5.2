import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 5.2");

        System.out.println("Задача 1");

        int[] payment = new int[5];
        payment[0] = 19400;
        payment[1] = 24800;
        payment[2] = 30500;
        payment[3] = 32500;
        payment[4] = 21000;

        int sumPayment = 0;
        for (int i : payment) {
            sumPayment += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumPayment + " рублей");

        System.out.println("Задача 2");

        int maxPayment = payment[0];
        for (int current : payment) {
            if (current > maxPayment) {
                maxPayment = current;
            }
        }
        int minPayment = payment[0];
        for (int current : payment) {
            if (current < minPayment) {
                minPayment = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        System.out.println("Задача 3");

        sumPayment = 0;
        for (int current : payment) {
            sumPayment += current;
        }
        double averageValue;
        averageValue = sumPayment / 5;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lenght = reverseFullName.length;
        for (int i = 0; i < lenght / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[lenght - 1 - i];
            reverseFullName[lenght - 1 - i] = temp;
        }
        System.out.print(new String(reverseFullName));
    }
}