import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        //calculate average of N numbers
        Scanner input = new Scanner(System.in);
        int num;
        int temp=0;
        float answer=0;
        int count = 0;
        do {
            System.out.println("Input 0 to confirm numbers");
            System.out.print("Input number: ");
            num = input.nextInt();
            temp = temp+num;
            count++;

        }while(num != 0);
        count--;
        answer= temp/count;
        
        System.out.println("The average of these numbers is: "+answer);

    }
    }

