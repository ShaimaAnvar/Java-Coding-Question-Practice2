import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // creating scanner object to read user input
        System.out.println("Enter a number:"); // asking user to enter input
        int num = sc.nextInt();
;        if(num % 2 == 0){
            System.out.println(num+ " is an Even Number");
        }else{
            System.out.println(num + " is an Odd Number");
        }
        sc.close();
    }
}
