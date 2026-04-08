//public class PrimeNumberCheck {
//    public static void main(String[] args){
//        int num = 12;
//
//        if (num <= 1) {
//            System.out.println("Not prime");
//            return;
//        }
//
//        for(int i = 2; i <= num / 2; i++){
//            if (num % i == 0){
//                System.out.println("Not prime");
//                return; // stop execution here
//            }
//        }
//
//        System.out.println("Prime");
//    }
//}

//---------------Using boolean -----------------
public class PrimeNumberCheck {
    public static void main(String[] args){
        int val = 19;
        boolean isPrime = true;

        if (val <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= val / 2; i++){
                if(val % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}