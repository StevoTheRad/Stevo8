public class Main {

    public static void main(String[] args) {
        int count = 300;
        int refill = 2000;
        int sum = count + refill;
        int a = sum/100;
        if (sum > 1000) {
            System.out.println("Количество средств на счету (RUB) - " + sum + "; Сумма ваших бонусов(RUB) - " + a);
        } else {
            System.out.println( "Количество средств на счету (RUB) - " + sum + "; В настоящий момент у вас нет бонусов :(");
    }
}
}