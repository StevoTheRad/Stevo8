public class Main {

    public static void main(String[] args) {
        int moneyAmount = 300;
        int refill = 2000;
        int sum = moneyAmount + refill;
        int rublesFor100 = sum / 100;
        if (sum > 1000) {
            System.out.println("Количество средств на счету (RUB) - " + sum + "; Сумма ваших бонусов(RUB) - " + rublesFor100);
        } else {
            System.out.println("Количество средств на счету (RUB) - " + sum + "; В настоящий момент у вас нет бонусов :(");
        }
    }
}