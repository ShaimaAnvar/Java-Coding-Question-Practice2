import java.util.Arrays;
public class CheckAngramStrings {
    public static void main(String[] args){
        String first = "silent";
        String second = "listen";
        char[] arr1= first.toCharArray();
        char[] arr2 = second.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
