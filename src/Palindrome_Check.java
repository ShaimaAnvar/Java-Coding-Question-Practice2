public class Palindrome_Check {
    public static void main(String[] args){
        String name = "level"; //malayalam, madam
        String reveresdname = "";
        for(int i=name.length()-1; i>=0; i--){
            reveresdname= reveresdname+ name.charAt(i);

        };
        if(name.equals(reveresdname)){
            System.out.println("Palindrome");
        }else{
            System.out.println(" Not Palindrome");
        }
    }
}
