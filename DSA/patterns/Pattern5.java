package DSA.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i=0;i<=num;i++){
            for(int j=num-i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
