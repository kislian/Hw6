public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int j = 10; j >= 1; j--) {
                System.out.println(j);
            }
        System.out.println("Задание 3");
        for (int i = 0; i < 18; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for (int i = 1904; i <=2096; i=i+4) {
            System.out.println(i+" год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <=98; i=i+7) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Задание 7");
        for (int i = 2; i <=512; i=i*2) {
            System.out.print(i+" ");
        }
        System.out.println("Задание 8");
        int total=0;
        int salary=29000;
        for (int i = 1; i <=12; i++) {
            total=total+salary;
            System.out.println("Месяц "+ i+" сумма накоплений равна " +total);
        }
        System.out.println("Задание 9");
        total=0;
        salary=29000;
        for (int i = 1; i <=12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц "+ i+" сумма накоплений равна " +total);
        }
        System.out.println("Задание 10");
        for (int i = 1; i <=10;i++) {
            System.out.println("2*"+i+"="+i*2);
        }
        }
    }