package by.belstu.it.korshun.basejava;
import static java.lang.Math.*;

/** @author Nikita Korshun
 * @version 0.1
 *
 * */

public class JavaTest {
    static int sint;
    final int i_var1 = 1;
    public final int i_var2 = 2;
    public static final int i_var3 = 3;

    public static void main() {
        /** @return void
         * */
        int ia = 2;
        char ca = 'D';
        short sa = 15;
        byte ba = 6;
        long la = 156;
        boolean boola = true;
        String S = "Text";
        double D = 3.14;

        System.out.println("String + int: " + S + ia);
        System.out.println("String + char: " + S + ca);
        System.out.println("String + double: " + S + D);

        byte b_byte = (byte)(ba + ia);
        System.out.println("Byte + int: " + b_byte);

        int i_int = (int)(D + la);
        System.out.println("Double + long: " + i_int);

        long l_long = (long)(ia) + (long)2147483647;
        System.out.println("Int + 2147483647: " + l_long);

        System.out.println("Статическая переменная: " + sint);

        boolean b_var1 = boola && boola;
        System.out.println("boolean && boolean: " + b_var1);

        boolean b_var2 = boola ^ boola;
        System.out.println("boolean ^ boolean: " + b_var2);

//        boolean b_var3 = boola + boola; Ошибка

        long l_var1 = 9223372036854775807L;
        long l_var2 = 0x7fff_ffff_fffL; // 8796093022207

        char ch_var1 = 'a';
        char ch_var2 = '\u0061';
        char ch_var3 = 97;
        System.out.println("Данные: " + ch_var1 + ", " + ch_var1 +  ", " + ch_var1 +  ", Сумма: " + (ch_var1 + ch_var2 + ch_var3));

        System.out.println("Результат 3.45 % 2.4: " + 3.45 % 2.4);
        System.out.println("Результат 1.0 / 0.0: " + 1.0 / 0.0);
        System.out.println("Результат 0.0 / 0.0: " + 0.0 / 0.0);
        System.out.println("Результат log(-345): " + Math.log(-345));

        System.out.println("Результат Float.intBitsToFloat(0x7F800000): " + Float.intBitsToFloat(0x7F800000));

        System.out.println("Результат Float.intBitsToFloat(0xFF800000): " + Float.intBitsToFloat(0xFF800000));

        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);

        double d_var1 = Math.round(Math.PI);
        double d_var2 = Math.round(Math.E);

        System.out.println("Math.PI (округленый): " + d_var1);
        System.out.println("Math.E (округленый): " + d_var2);

        System.out.println("Math.min(p,e): " + Math.min(d_var1,d_var2));

        System.out.println("Случайное число [0,1]: " + Math.random());

        Boolean b_obj = new Boolean(true);
        Character ch_obj = new Character('c');
        Integer i_obj = new Integer(100);
        Byte bool_obj = new Byte((byte)4);
        Short s_obj = new Short((short)15);
        Long l_obj = new Long(1000000000000000L);
        Double d_obj = new Double(3.1415213312313);

        System.out.println("Integer: " + i_obj);
        System.out.println("100 >>> 2: " + (i_obj >>> 2));
        System.out.println("100 <<< 1: " + (-i_obj >>> 1));

        System.out.println("MIN_VALUE long: " + Long.MIN_VALUE);
        System.out.println("MAX_VALUE long: " + Long.MAX_VALUE);

        System.out.println("MIN_VALUE double: " + Double.MIN_VALUE);
        System.out.println("MIN_VALUE double: " + Double.MAX_VALUE);

        Integer pack = 15;
        int unpack = pack;

        Byte b_pack = 3;
        byte b_unpack = b_pack;

        System.out.println("parseInt: " + Integer.parseInt("47"));
        System.out.println("toHexString: " + Integer.toHexString(19));
        System.out.println("compare: " + Integer.compare(3,15));
        System.out.println("toString: " + Integer.toString(77));
        System.out.println("bitCount: " + Integer.bitCount(93));
        System.out.println("isNaN: " + d_obj.isNaN());

        String s34 = "2345";
        int i_var1 = Integer.parseInt(s34);

        Integer i_var2 = new Integer(s34);

        Integer i_var3 = Integer.valueOf(s34);

        System.out.println("parseInt: " + i_var1);
        System.out.println("Конструктор: " + i_var2);
        System.out.println("valueOf: " + i_var3);

        byte[] b_arr = s34.getBytes();
        System.out.println("Перевод строки в байты: " + b_arr);

        String s35 = new String(b_arr);
        System.out.println("Перевод байтов в строку: " + s35);

        String s36 = "true";
        boolean b1 = Boolean.parseBoolean(s36);
        boolean b2 = Boolean.valueOf(s36);
        System.out.println("Строка в boolean: " + b1 + " " + b2);

        String s1 = "Hello World";
        String s2 = "Hello World";

        System.out.println("string == string: " + (s1 == s2));
        System.out.println("string.equals(string): " + (s1.equals(s2)));
        System.out.println("string.compareTo(string): " + (s1.compareTo(s2)));

        s2 = null;

        System.out.println("string == string (null): " + (s1 == s2));
        System.out.println("string.equals(string) (null): " + (s1.equals(s2)));
//        System.out.println("string.compareTo(string) (null): " + (s1.compareTo(s2))); Ошибка

        String[] words = s1.split(" ");
        for(String word : words) {
            System.out.println(word);
        }

        System.out.println("Contains: " + s1.contains("j"));
        System.out.println("hashCode: " + s1.hashCode());
        System.out.println("IndexOf: " + s1.indexOf('W'));
        System.out.println("Length: " + s1.length());
        System.out.println("Replace: " + s1.replace('e', 'a'));


        char [][] c1;
        char [] c2[];
        char c3[][];

        c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];

        System.out.println("c1.length: " + c1.length);
        System.out.println("c1[0].length: " + c1[0].length);
        System.out.println("c1[1].length: " + c1[1].length);
        System.out.println("c1[2].length: " + c1[2].length);

        c2 = new char[2][2];
        c2[0][0] = 'a';
        c2[0][1] = 'b';
        c2[1][0] = 'c';
        c2[1][1] = 'd';

        c3 = new char[2][2];
        c3[0][0] = 'a';
        c3[0][1] = 'b';
        c3[1][0] = 'c';
        c3[1][1] = 'd';

        boolean comRez = c2 == c3;
        c2 = c3;
        System.out.println("Result: " + comRez);

        for(char[] symb : c2) {
            System.out.println(symb);
        }

//        System.out.println(c2[3][3]); Исключение ArrayIndexOutOfBoundsException


        WrapperString w_obj = new WrapperString("Hello World");
        w_obj.replace('o','a');
        System.out.println(w_obj.toString());

        WrapperString wrapperString1 = new WrapperString("Hello") {
            @Override
            public void replace(char oldchar, char newchar) {
                super.replace(oldchar, newchar);
            }

            public void delete(char newchar) {
                super.replace(newchar, ' ');
            }
        };


    }
}
