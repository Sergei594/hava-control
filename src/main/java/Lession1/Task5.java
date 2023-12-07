package Lession1;

public class Task5 {
//    Во фразе "Добро пожаловать на курс по Java"
//    переставить слова в обратном порядке.

    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0 ; i--) {
            res += words[i];
            res += " ";

        }
        System.out.println(res.trim());
    }
}
