public class Arithmetic {

    public static int num1 = 4;
    public static int num2 = 7;

    public Arithmetic (int num1, int num2) {
        
    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел = " + amount());
        System.out.println("Произведение чисел = " + multiplication());
        System.out.println("Максимальное из двух чисел = " + maxNum());
        System.out.println("Минимальное из двух чисел = " + minNum());
    }

    public static int amount () {
        int num3 = 0;
        if (num1 > 0 & num2 > 0){
            num3 = num1 + num2;
        }
        return num3;
    }

    public static int multiplication () {
        int num4 = 0;
        if (num1 > 0 & num2 > 0){
            num4 = num1 * num2;
        }
        return num4;
    }

    public static int maxNum () {
        int num5 = 0;
        if (num1 > num2){
            num5 = num1;
        } else {
            num5 = num2;
        }
        return num5;
    }

    public static int minNum () {
        int num6 = 0;
        if (num1 > num2){
            num6 = num2;
        } else {
            num6 = num1;
        }
        return num6;
    }
}