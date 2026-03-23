public class Smallest_Number {
    public static void main(String[] args){
        int[] nums = {4,7,8,1,3,9,-1,12};
        int min = nums[0];
        for(int num: nums){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min); //keyboard shortcut sout+tab

    }
}
