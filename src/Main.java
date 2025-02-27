public class Main {
    public static void main(String[] args) {
        int startingScore = 100; // начальный счет
        int amout = 1200; // сумма пополнения

        int bonus;
        if (amout > 1001) {
            bonus = amout / 100;
        } else {
            bonus = 0;
        }
        int totalamout = amout + bonus;
        System.out.println("Итоговая сумма счета: " + totalamout);
        System.out.println("Итоговая сумма бонусов: " + bonus);

    }
}