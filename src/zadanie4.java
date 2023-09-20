import java.util.HashMap;
import java.util.Map;

public class zadanie4 {

    public static int romanToInt(String s) {

        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int rez =0;

        for (int i = 0; i < s.length(); i++) {

            if(i < s.length()-1 && (numbers.get(s.charAt(i)) < numbers.get(s.charAt(i+1)) )){
                rez -=numbers.get(s.charAt(i));
            }
            else {
                rez += numbers.get(s.charAt(i));
            }

        }

        return rez;
    }


    public static void main(String[] args) {


        System.out.println(romanToInt("MCMXCIV"));
    }
}
