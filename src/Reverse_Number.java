public class Reverse_Number {
    public static void main(String[] args){
        int num = 521;
        int reversednum= 0;
        while(num!=0){
            int digit= num%10; //1, 2, 5 modulo operator gives remainder. 5%10 is 5
            reversednum= reversednum *10+digit; //1, 12, 125
            num= num/10; //52, 5
        }
        System.out.println(reversednum);

    }
}
