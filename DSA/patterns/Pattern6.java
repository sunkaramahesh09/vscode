package DSA.patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i=0;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
