package Lession2;

public class Task03 {//Напишите метод, который принимает на вход строку (String)
//    и определяет является ли строка палиндромом (возвращает boolean значение).
//    Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
public static void main(String[] args) {
    String string = "аргентина манит негра";
    System.out.println(polindrom(string));

}
static boolean polindrom(String s){

    s = s.replace(" ","");
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.reverse();
    return stringBuilder.toString().equalsIgnoreCase(s);
}
}
