package Lession2;

public class Task6 {
//    Реализовать функцию возведения числа а в степень b. a, b из Z.
//    Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(pow(a,b));
    }
    static double pow (int a, int b){
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        if (b < 0){
            return  1 / res;

        }else  if (b == 0){
            return  1;
        } else{
            return  res;
        }
    }
}
