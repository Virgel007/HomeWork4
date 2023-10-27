import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();

    }

    public static void task1() {
        //## 1 задача
        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //    - Подсказка
        //        ```java
        //        //объявление массива из 12-ти элементов, заполненного нулями
        //        int [] weight = new int [12];
        //        ```
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //    - Подсказка
        //        ```java
        //        //объявление целочисленного массива, заполненного 12 элементами
        //        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        //3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
        //с помощью ключевого слова или сразу заполненный элементами.
        //```
        int[] massiveOne = new int[12];
        massiveOne[0] = 1;
        massiveOne[1] = 2;
        massiveOne[2] = 3;

        double[] masiveTwo = new double[]{1.57, 7.654, 9.986};

        boolean[] massivethree = new boolean[5];

        char[] arr3 = new char[]{72, 73, 74, 'a', 'S'}; //символьный массив HIJ (ASCII "American standard code for information interchange" гуглить)
        System.out.println(arr3);
    }

    public static void task2() {

        // ## 2 задача
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //- **Критерии оценки**
        //    - В консоль выведены все элементы первого массива в верном порядке через запятую
        //    - В консоль выведены все элементы второго массива в верном порядке через запятую
        //    - В консоль выведены все элементы третьего массива в верном порядке через запятую
        //    - На одной строчке расположены элементы только одного массива
        int[] massiveOne = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < massiveOne.length; i++) { // цикл выводит все значения массива начиная с 0 и далее
            if (i == massiveOne.length - 1) {
                System.out.println(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
            }

        }

        float[] masiveTwo = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < masiveTwo.length; i++) {
            if (i == masiveTwo.length - 1) {
                System.out.println(masiveTwo[i]);
            } else {
                System.out.print(masiveTwo[i] + ", ");
            }

        }

        boolean[] massivethree = new boolean[5];
        massivethree[0] = true;
        massivethree[3] = false;
        for (int i = 0; i < massivethree.length; i++) {
            if (i == massivethree.length - 1) {
                System.out.println(massivethree[i]);
            } else {
                System.out.print(massivethree[i] + ", ");
            }
        }
    }

    public static void task3() {
        //## 3 задача
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
        //при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //1.57, 7.654, 9.986
        //*произвольные элементы третьего массива*
        //То в третьем задании результат должен быть
        //3, 2, 1
        //9.986, 7.654, 1.57
        //*произвольные элементы третьего массива в обратном порядке*
        int[] massiveOne = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 5; i >= 0; i--) {
            if (i == 0) {
                System.out.println(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
            }

        }

        float[] masiveTwo = {1.57f, 7.654f, 9.986f};
        for (int i = masiveTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(masiveTwo[i]);
            } else {
                System.out.print(masiveTwo[i] + ", ");
            }

        }

        boolean[] massivethree = new boolean[5];
        massivethree[0] = true;
        massivethree[3] = false;
        for (int i = 4; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massivethree[i] + ", ");
            } else {
                System.out.print(massivethree[i]);
            }
        }
    }

    public static void task4() {

        //### 4 задача
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        int[] massiveOne = {16, 4, 8, 5, 23, 21345, 87346, 77, 44, 88};

        for (int i = 0; i < massiveOne.length; i++) { // проверяем весь массив с лева на право от 0 до конца
            if (massiveOne[i] % 2 != 0) { //если в массиве при деление на 2 число не являеться 0 то
                massiveOne[i] = massiveOne[i] + 1; // прибавить к этому  числу 1
                System.out.println(massiveOne[i] + " ! не четные числа к которым прибавили 1");
            } else {
                System.out.println(massiveOne[i] + " ! четные числа к которым не чего не прибавляли");
            }
        }
//        System.out.print(Arrays.toString(massiveOne));
    }
}

