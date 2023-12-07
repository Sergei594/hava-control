package Lession4;

import java.util.*;

public class Task3 {
//    Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String>list = new LinkedList<>();
    list.add("Hello");
    list.add("my");
    list.add("name");
    list.add("sergei");
    boolean flag = true;
    while (flag){
        String temp = scanner.nextLine();
        switch (temp){
            case "print":
                ListIterator<String> iterator = list.listIterator();
//                for (int i = list.size() - 1; i >= 0; i--) {
//                    System.out.print(list.get(i)+",");
//
//                }
                while (iterator.hasPrevious()){
                    System.out.print(iterator.previous()+", ");
                }
                System.out.println();

                break;
            case "revert":
                if(list.isEmpty()){
                    System.out.println("В списке нет элементов добавте новый");

                }else {
                    list.remove(list.size()- 1);

                }
                break;
            case "q":
                flag = false;
                break;

            default:
                list.add(temp);
        }
    }
}
}
