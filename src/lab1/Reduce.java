package lab1;

public class Reduce {

    public static void main() {
        System.out.println(reduce(100));

    }
    public static int reduce(int n) {
        // if n == 0: return

        if (n == 0)  {
            return 0;
        } else if (n % 2 == 1) {
            return 1 + reduce(n-1);
        } else  { // if (n % 2 == 0)
            return 1 + reduce(n/2);
        }

    }
}

