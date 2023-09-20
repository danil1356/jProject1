public class zadanie3 {
    public static boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        int first = 0;
        int second = number.length()-1;
        boolean rez = true;


        while (first<second){
            char chFirst = number.charAt(first);
            char chSecond = number.charAt(second);
            if (chFirst != chSecond){
                rez = false;
                break;
            }


            first++;
            second--;
        }

        return rez;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1212121));
    }
}
