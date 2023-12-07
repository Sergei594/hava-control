package Lession4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
//    Реализовать консольное приложение, которое:
//    Принимает от пользователя строку вида
//    text~num
//    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.V
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> list = new LinkedList<>();
    while (true) {
        String n = scanner.nextLine();
        String[] arr = n.split("~");
        String text = arr[0];
        int num =Integer.parseInt(arr[1]);
        if (text.equals("print")){
            System.out.println(list.get(num));
            list.remove(num);
            break;
        }else {
            list.add(num, text);
            System.out.println(list);
        }



    }
    System.out.println(list);


}
}
