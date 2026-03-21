public class Reverse_String {
    public static void main(String[] args){
        String name = "Hello";
        String Reversed = "";
        for(int i=name.length()-1; i>=0; i--){
            Reversed= Reversed+ name.charAt(i);   //to extract character, we need to use charAt(i)
    }
        System.out.println(Reversed);

    }
}
