public class MultiplyTwoNumbers {
    public static void main(String[] args){  //program starts here
        int result = multiply(-5,10); //calling method and passing two values, storing result in a variable
        System.out.println(result);     //printing result
    }
    public static int multiply(int a, int b){   //creating a method that returns the multiplication result
        int result =0;
        //Track sign
        boolean isNegative = false;
        if(a<0){
            a = -a; //make a positive
            isNegative = !isNegative; //flipping flag
        };
        if(b<0){
            b= -b; //make b positive
            isNegative = !isNegative;
        };
        while(a >0){
            result = result + b;
            a--;
        }
        //applying sign
        if(isNegative == true){
             return -result;
        }else{
            return result;
        }
    };
}
