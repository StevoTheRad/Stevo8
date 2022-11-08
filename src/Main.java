public class Main {

    public static void main(String[] args) {
        int count = 300;
        int refill = 2000;
        int sum = count + refill;
        int a = sum/100 + sum;
        if (sum > 1000) {
            System.out.println(a);
        } else {
            System.out.println(sum);
    }
}
}