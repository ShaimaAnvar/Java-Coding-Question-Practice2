import java.util.Set;
import java.util.LinkedHashSet;
public class RemoveDuplicatesInArray {
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 2, 3, 1, 0, 7, 2};
        Set<Integer> unique = new LinkedHashSet<>();
        for(int num : nums){
            unique.add(num);
        }
        System.out.println(unique);
    }
}
