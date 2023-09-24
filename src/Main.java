import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер этажа: ");
        int floor = sc.nextInt();
        System.out.println("Введите факториал: ");
        int n = sc.nextInt();
        System.out.println("Введите число фибоначи: ");
        int f = sc.nextInt();
        System.out.println("Введите число для возведения в степень: ");
        int value = sc.nextInt();
        System.out.println("Введите степень: ");
        int powValue = sc.nextInt();



        Elevator(floor) ;
        System.out.println(Factorial(n) + " факториал числа: " + n);
        System.out.println(fib(f) + " фибоначи числа: " + f);
        System.out.println(pow(value, powValue) + " = " + value + " в степени " + powValue);


    }

    static void Elevator(int floor) {
        if (floor == 0) {
            System.out.println("Вы в подвале " );
            return;
        }
        System.out.println("вы на " + floor + " этаже");
        Elevator(floor - 1);

    }



    private static int Factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return 1;
        }
        result = n * Factorial(n - 1);
        return result;

    }
    static int fib(int f){

        if (f < 2)
            return f;

            return fib(f - 1) + fib(f - 2);
        }
    public static int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }

    }



