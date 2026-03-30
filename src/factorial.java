//public class factorial {
//    public static void main(String[] args){
//        int a = 6;
//        int fact = 1;          // start with a variable
//        for(int i=1; i<=a; i++){  //loop from 1 to n
//            fact = fact*i;       //multiply each number with fact and update fact
//        }
//        System.out.println(fact);
//    }
//}
//using recursion
public class factorial{
    public static void main(String [] args){
        int a = 5;
        int fact = factorialOfNum(a);
        System.out.println(fact);
    }
    public static int factorialOfNum(int a){
        if (a < 0) {                     //adding condition to handle negative inputs
            System.out.println("Invalid input");
            return -1;                   // retun -1 to indicate it is invalid case
        }
        if(a==0 || a==1){
            return 1;
        }else{
            return a * factorialOfNum(a-1);
        }
    };
}