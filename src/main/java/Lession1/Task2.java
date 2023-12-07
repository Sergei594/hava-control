package Lession1;
//Дан массив двоичных чисел, например [1,1,0,1,1,1],
//        вывести максимальное количество подряд идущих 1.
public class Task2 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,0,1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr [i] == 1){
                count = count + 1;
                if (count>maxCount + 1) {
                    maxCount = count;
                }

            }
            else {
                count = 0;

            }
        }
        System.out.println(maxCount);
    }

}
