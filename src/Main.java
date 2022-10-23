import java.util.Arrays;

public class Main {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        //1

        int [] payments = arr;
        int total = 0;
        for (int i = 0; i < payments.length; i++) {
            total = total + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        System.out.println();

        //2

        int minPayment = payments[0];
        int maxPayment = payments[0];
        for (int i = 1; i < payments.length; i++) {
            if (payments[i] < minPayment){
                minPayment = payments[i];
            }
            if (payments[i] > maxPayment) {
                maxPayment = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей");
        System.out.println();

        //3

        double sum = total;
        System.out.println("Средняя сумма трат за месяц составила " + sum / 30 + " рублей.");
        System.out.println();

        //4

        char[] reverseFullName= {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int length = reverseFullName.length - 1; length >= 0; length--) {
            System.out.print(reverseFullName[length]);
        }
        System.out.println();
        System.out.println();

        //5

        int[][] matrix = new int[3][3];
        int a = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][a] = 1;
            a = a - 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //6

        int[] arrFail = {5, 4, 3, 2, 1};
        int[] arrTrue = new int[arrFail.length];
        int b = 0;
        System.out.println(Arrays.toString(arrFail));
        for (int i = arrTrue.length - 1; i >= 0; i--) {
            arrTrue[i] = arrFail[b];
            b++;
        }
        System.out.println(Arrays.toString(arrTrue));
        System.out.println();

        //7

        int[] arr1 = {5, 4, 3, 2, 1};
        int count = arr1.length;
        for (int i = 0; i < arr1.length / 2; i++) {
            count = count - 1;
            int c = arr1[count];
            arr1[count] = arr1[i];
            arr1[i] = c;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        //8

        int[] arrDigital = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arrDigital);
        boolean flag = true;
        for (int i = 0; (i < arrDigital.length - 1) && flag; i++) {
            for (int j = i + 1; (j < arrDigital.length) && flag; j++) {
                if (arrDigital[i] + arrDigital[j] == -2) {
                    flag = false;
                    System.out.println(arrDigital[i] + " " + arrDigital[j]);
                }
            }
        }
        System.out.println();

        //9

        for (int i = 0; i < arrDigital.length; i++) {
            for (int j = i + 1; j < arrDigital.length; j++) {
                if (arrDigital[i] + arrDigital[j] == -2) {
                    System.out.println(arrDigital[i] + " " + arrDigital[j]);
                }
            }
        }
    }
}