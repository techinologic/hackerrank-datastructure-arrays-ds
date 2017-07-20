import java.util.Scanner;

/**
 * Created by Paopao on 07/19/17.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = n; i > 0; i--) {
            array[i-1] = sc.nextInt();
        }
        for (int num :
                array) {
            System.out.print(num + " ");
        }
    }

}
