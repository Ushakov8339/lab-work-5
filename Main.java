class Main{
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке dev");
        findMaxInArray(new int[]{3, 7, 2, 9, 1});
        sayHello();
        
        System.out.println("Это добавлено в ветке main");
        calculateSum(2,2);
        printNumbers(4);
        checkEvenOdd(6);
    }
    
    public static void findMaxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("Максимальный элемент в массиве: " + max);
    }
    
    public static void sayHello() {
        System.out.print("Привет из ветки dev!");
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