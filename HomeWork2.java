import java.util.*;
public class HomeWork2 {

    public static void main(String[] args) {
        //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String word_1 = "Я учу Java!";
        String word_2 = "Я учу Python!";
        System.out.println(word_1.equals(word_2));


        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
        // (вхождение в обратном порядке).
        StringBuilder string_1 = new StringBuilder();
        string_1.append("абракадабра");
        StringBuilder string_2 = new StringBuilder();
        string_2.append("абракадабра");
        System.out.println(string_1.reverse().toString().equals(string_2.reverse().toString()));

        //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
        // Используем метод StringBuilder.append().
        StringBuilder newIntStringBuilder = new StringBuilder();

        Integer a = 3;
        Integer b = 56;

        newIntStringBuilder.append(a).append("+").append(b).append("=").append(a+b).append("\n");
        newIntStringBuilder.append(a).append("-").append(b).append("=").append(a-b).append("\n");
        newIntStringBuilder.append(a).append("*").append(b).append("=").append(a*b).append("\n");

        System.out.println(newIntStringBuilder.toString());

        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        StringBuilder newIntStringBuilder_1 =  newIntStringBuilder;

        newIntStringBuilder.deleteCharAt(4);
        newIntStringBuilder.deleteCharAt(11);
        newIntStringBuilder.deleteCharAt(19);
        System.out.println("Исходные данные:\n" + newIntStringBuilder);
        newIntStringBuilder.insert(4, " равно ");
        newIntStringBuilder.insert(18, " равно ");
        newIntStringBuilder.insert(33, " равно ");
        System.out.println("Измененные данные:\n" + newIntStringBuilder);

        // *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()

        newIntStringBuilder.replace(4, 10, " Равно ");
        newIntStringBuilder.replace(19, 25, " Равно ");
        newIntStringBuilder.replace(35, 42, " Равно ");
        System.out.println(newIntStringBuilder);

        // **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        long begin_1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10_001; i++) {
            s += "=";

        }
        System.out.println(System.currentTimeMillis() - begin_1);

        long begin_2 = System.currentTimeMillis();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 10_001; i++) {
            string.append("=");
        }
        System.out.println(System.currentTimeMillis() - begin_2);


    }

}
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
class Revers_string {
    public static String reverse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Heloo Word!!!";
        System.out.println("Исходная строка: " + str);

        str = reverse(str);

        System.out.println("Перевернутая строка: " + str);
    }

}
