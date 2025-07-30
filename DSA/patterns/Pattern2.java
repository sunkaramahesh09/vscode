package DSA.patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
