package lab1;

class Multiples {

    public static void main() {

        System.out.println(multiples(1000, 3, 5));

    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        int i = 1;

        while (i < n)   {
            if (i%a==0 || i%b==0)
                count++;
            i++;

        }
        return count;
    }


}


