import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn .nextLine();
        int sum = 0;
        if (str.length()<=15){
            for (int i = 0;i<str.length();i++){
            sum = sum+str.charAt(i)-'0'; }
            System.out.println(sum);}
}}
