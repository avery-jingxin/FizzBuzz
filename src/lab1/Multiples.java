package lab1;

//Write a main method that prints how many multiples of 3 or 5 there are below 1000. Add this file to your project, commit, and push. Check your repo on GitHub to confirm your changes were pushed successfully.
public class Multiples {
    static void main() {

        int count = 0;
        int i = 1;

        while (i < 1000)   {
            if (i%3==0 || i%5==0)
                count++;
            i++;

        }
        System.out.println(count);

    }


}
