
//an arrary accept numbers and returns sum of elements in an array
//Method 1

//public class Sum_Of_Elements {
//    public static void main(String[] args){
//        int[] num = {1,2,3,4};
//        int sum = 0;
//        for(int i=0; i<=num.length-1; i++){
//            sum= sum+num[i];
//        }
//        System.out.println(sum);
//    }
//}

//Method 2
public class Sum_Of_Elements {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int sum= sumArray(arr);

        System.out.println(sum);
    }
    public static int sumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
       return sum;
    };
}


