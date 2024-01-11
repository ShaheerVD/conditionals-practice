import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //find factorial of a number
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        int i = 1;
        int ans=1;
        while(i<= number){
            ans = i*ans;
            i++;
        }
        System.out.println(ans);

    }
}