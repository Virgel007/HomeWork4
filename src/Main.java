public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();

    }

    public static void task1() {
//        int[] weights = {90, 93, 95, 97, 99, 102, 106, 109, 107, 105,};
//        weights[0] = 90;
//        int januaryWeight = weights[0];
//        System.out.println(januaryWeight);
//        System.out.println(weights[0]);
//        System.out.println(weights[4]);
//        int janary = 0;
//        System.out.println(weights[janary]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
//    }

}

    // ## 1 задача
    // Объявите три массива:
    // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
    //    - Подсказка
    //        ```java
    //        //объявление массива из 12-ти элементов, заполненного нулями
    //        int [] weight = new int [12];
    //        ```
    // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
    //    - Подсказка
    //        ```java
    //        //объявление целочисленного массива, заполненного 12 элементами
    //        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
    //        ```
    // 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
    // с помощью ключевого слова или сразу заполненный элементами.
    public static void task2() {
//        float[] number = new float[3];
//        number[0] = 1.57f;
//        number[1] = 7.654f;
//        number[2] = 9.986f;
//        System.out.println(number[0] + " " + number[1] + " " + number[2]);
//        int[] number = new int[3];
        int[] number = {157, 7654, 9986};
//        number[0] = 157;
//        number[1] = 7_654;
//        number[2] = 9_986;
        float a = number[0] / 100f;
        float b = number[1] / 1000f;
        float c = number[2] / 1000f;
        System.out.println(a + " " + b + " " + c);
    }
}