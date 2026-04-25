//public class ReverseWordsInSentence {
//    public static void main(String[] args) {
//        String sentence = "Hello world";
//        String[] words = sentence.split(" ");
//        String wordsReversed = "";
//        for (int i = words.length - 1; i >= 0; i--) {
//            wordsReversed = wordsReversed + words[i] + " ";
//        }
//        System.out.println(wordsReversed.trim());
//    }
//}


public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String sentence = "Hello world";
        String[] words = sentence.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println(reversed.toString().trim());
    }
}