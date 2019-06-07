import java.util.Map;
import java.util.HashMap;



    public class RMath {


        public  int roman_to_arabic(String s){
            Map <Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            char[] roman;
            roman = s.toCharArray();
            int result = 0;
            for (int i = 0; i <= s.length()-1; i++){
                if (s.length()-i > 1)
                {
                    if (map.containsKey(roman[i]) && map.containsKey(roman[i+1]) && map.get(roman[i]) < map.get(roman[i+1])){
                        result-=map.get(roman[i]);
                    }
                    else if (map.containsKey(roman[i])){
                        result += map.get(roman[i]);
                    }
                }
                else if (map.containsKey(roman[i])){
                    result += map.get(roman[i]);
                }
                else {return 0;}
            }
            return result;
        }

        public String arabic_to_roman (int num){
            String result = new String();
            String roman = new String();
            Map <Integer, Character> map = new HashMap<>();
            map.put(1, 'I');
            map.put(5, 'V');
            map.put(10, 'X');
            map.put(50, 'L');
            map.put(100, 'C');
            map.put(500, 'D');
            map.put(1000, 'M');

            int i = 10;
            while (num*10 >= i) {
                switch ((num %i)*10/i) {
                    case 1: { roman = roman + map.get(i/10);
                        break;
                    }
                    case 2: {roman = roman + map.get(i/10) + map.get(i/10);
                        break;
                    }
                    case 3: {roman = roman + map.get(i/10) + map.get(i/10) + map.get(i/10);
                        break;
                    }
                    case 4: {roman = roman + map.get(i/10*5) + map.get(i/10);
                        break;
                    }
                    case 5: {roman = roman + map.get(i/10*5);
                        break;
                    }
                    case 6: {roman = roman + map.get(i/10)+ map.get(i/10*5);
                        break;
                    }
                    case 7: {roman = roman + map.get(i/10) + map.get(i/10)+ map.get(i/10*5);
                        break;
                    }
                    case 8: {roman = roman + map.get(i/10) + map.get(i/10) + map.get(i/10)+ map.get(i/10*5);
                        break;
                    }
                    case 9: {roman = roman + map.get(i) + map.get(i/10);
                        break;
                    }

                }
                num = num - ((num % i));
                i=i*10;
            }
            char [] arr = roman.toCharArray();
            for (int j = roman.length() - 1; j >= 0; j--){
                result = result + arr[j];
            }
            return result;
        }

        public int sum (int a, int b)
        {
            return a+b;
        }
        public String sum (String a, String b){
            String rez = arabic_to_roman(roman_to_arabic(a) + roman_to_arabic(b));
            return rez;
        }
        public int sum (int a, String b){
            return a+roman_to_arabic(b);
        }

        public int subtract (int a, int b)
        {
            return a-b;
        }
        public String subtract (String a, String b){
            String rez = arabic_to_roman(roman_to_arabic(a) - roman_to_arabic(b));
            return rez;
        }
        public int subtract (int a, String b){
            return a-roman_to_arabic(b);
        }

        public int square (int a)
        {
            return a*a;
        }
        public String square (String a){
            String rez = arabic_to_roman(roman_to_arabic(a) * roman_to_arabic(a));
            return rez;
        }

        public int pow (int a, int n) {
            if (n == 0){
                return 0;
            }
            else{
                int rez = a;
                for (int i=1; i<n; i++){
                    rez = rez * a;
                }
                return rez;
            }
        }
        public String pow (String a, int n){
                int num = roman_to_arabic(a);
                if (n == 0){
                    return null;
                }
                else{
                    int rez = num;
                    for (int i=1; i<n; i++){
                        rez = rez * num;
                    }
                    return arabic_to_roman(rez);
                }
            }

        public int product (int a, int b)
        {
            return a*b;
        }
        public String product (String a, String b){
            String rez = arabic_to_roman(roman_to_arabic(a) * roman_to_arabic(b));
            return rez;
        }
        public int product (int a, String b){
            return a*roman_to_arabic(b);
        }

        public Boolean is_greater(String a, String b){
            if (roman_to_arabic(a)>roman_to_arabic(b)){
                return true;
            }
            else {
                return false;
            }
        }
        public Boolean is_greater(int a, String b){
            if (a>roman_to_arabic(b)){
                return true;
            }
            else {
                return false;
            }
        }
        public Boolean is_greater(String a, int b){
            if (roman_to_arabic(a)>b){
                return true;
            }
            else {
                return false;
            }
        }
    }

