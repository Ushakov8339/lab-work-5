class Main{
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке dev");
        findMaxInArray(new int[]{3, 7, 2, 9, 1});
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
}