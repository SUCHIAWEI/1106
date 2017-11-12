import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum= 0;
        for (int i = 2;i<=a;i++){
        if (a % i==0){ sum=sum+1; } }
        if (sum == 1){ System.out.println("YES"); }
                 else { System.out.println("NO"); }
    }}



