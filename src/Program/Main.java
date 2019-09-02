package Program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++ ) {
            Integer n = input.nextInt();
            if (calcPlus(n) < calcMinus(n)) {
                System.out.println("Case #" + i + ":" + calcPlus(n));
            } else {
                System.out.println("Case #" + i + ":" + calcMinus(n));
            }
        }


    }

    public static int calcPlus(Integer n) {
        int count = 0;
         for (int i = 0; i < String.valueOf(n).length(); i++) {
             do{
                 if (n.toString().charAt(i) % 2 != 0) {
                     n++;
                     count ++;
                 }
             }while (n.toString().charAt(i) % 2 != 0);
         }
        return count;
    }

    public static int calcMinus(Integer n) {

        int count = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            do{
                if (n.toString().charAt(i) % 2 != 0) {
                    n--;
                    count ++;
                }
            }while (n.toString().charAt(i) % 2 != 0);
        }
        return count;

    }


}
