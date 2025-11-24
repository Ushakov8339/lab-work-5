class Main{
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        calculateSum(2,2);
    }
    public static void calculateSum(int a, int b) {
        int result = a + b;
        System.out.print("Сумма: " + result);
    }
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Число: " + i);
        }
    }
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.print(number + " - четное");
        } else {
            System.out.print(number + " - нечетное");
        }
    }
}
