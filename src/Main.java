public class Main {
    public static void main(String[] args) {

        int balance = 73;
        int payment = 1900;
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + payment + bonus;
        System.out.println("Поступил платёж на сумму " + payment + " руб.");
        System.out.println("Ваш текущий баланс: " + newBalance + " руб." + "(бонусные рубли: " + bonus + ")");

        System.out.println("Спасибо, что пользуетесь услугами нашего оператора!");
    }
}