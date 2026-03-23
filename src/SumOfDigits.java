
//input:123, output=6

public class SumOfDigits {
    public static void main(String[] args){
        int num = 12045;
        int sum = FindSumOfDigits(num);
        System.out.println(sum);
    }
    public static int FindSumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum+ digit;//5, 9, 9, 11, 11+1
            num=num/10; //1204,120, 12,1,
        };
        return sum;
    };

}
