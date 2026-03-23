public class Largest_Number {
    public static void main(String[] args){
        int[] a = {11, 3,-2,4,-6,5,10};
        int max = a[0];
//        for(int i=0; i<=a.length-1;i++){
//           if(a[i] > max){
//               max = a[i];
//           }
//        }

        //using enhanced for loop
        for(int num: a){
            if(num > max){
                max= num;
            }
        }
        System.out.println(max);
    }

}
