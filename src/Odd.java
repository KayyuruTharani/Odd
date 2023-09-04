public class Odd {
    public static void main(String[] args) {
        printOdd(5);
        //System.out.println("                  ");
    }
    static int printOdd(int n) {
        if (n == 1) {
            System.out.println(n);
            return 0;
        }

        if (n % 2 != 0)
        {   System.out.println(n);
            printOdd(n - 2);

        }
        if (n % 2 == 0) {
            printOdd(n - 1);
        }
        return 1;

    }
}