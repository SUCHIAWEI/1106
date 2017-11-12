import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str =scn.nextLine();
        int a = scn.nextInt();
        if (str.length()<=100){
            for (int i = 0;i<str.length();i++){
                char c =(char)(str.charAt(i)+a);
                System.out.print(c);

            }
        }
        System.out.println();
    }
}
