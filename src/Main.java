public class Main {
    public static void main(String[] args) {
        String word = "абабабобабаба";

        int index1 = 0;
        int index2 = word.toCharArray().length-1;

        while (index1<index2){
            char ch1 = word.charAt(index1);
            char ch2 = word.charAt(index2);

            if (ch1!= ch2){
                System.out.println("end");
                break;
            }
            else {
                System.out.println(index1+" "+index2);
            }

            index1++;
            index2--;
        }

    }
}