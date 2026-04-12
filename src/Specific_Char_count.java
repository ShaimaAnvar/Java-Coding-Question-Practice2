public class Specific_Char_count {
    public static void main(String[] args){
        String name = "welcome";
        char target = 'e';
        int count =0;

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)== target){
                count++;
            }
        }
        System.out.println(count);
    }
}
