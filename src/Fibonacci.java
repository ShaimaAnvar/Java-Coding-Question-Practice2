public class Fibonacci {                            //every program must be inside a class
    public static void main(String[] args){             //entry point of the program, public-accessible everywhere
        //static-no need to create object, void-returns nothing, string[] args- used for command line input
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int n = 10; //nummber of terms to print
        int first =0;
        int second =1;  //initializa first two fibanocci numbers

        for(int i=1; i <=n; i++){       //loop runs 10 times
            System.out.print(first+ " "); // we always print first, not next
            int next = first+second;
            first = second;
            second= next;
        }
    }
}
