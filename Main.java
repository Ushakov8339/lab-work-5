class Main{
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        calculateSum(2,2);
    }
    public static void calculateSum(int a, int b) {
        int result = a + b;
        System.out.print("Сумма: " + result);
    }
}
