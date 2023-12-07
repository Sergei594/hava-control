package Lession2;

public class Task01 {
    //Дано четное число N (>0)и символы с1 и с2.
//    написать метод который вернет сторку длинны N
//    которая состоит из чередующихся символов с1 и с2 начиная с 1 Ответ с1с2с1...с2 всего N символов

    public static void main(String[] args) {
        int n = 8;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(concat(c1 , c2 ,n));

    }
     static String concat(char c1, char c2, int n){
      StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < n / 2; i++) {
             stringBuilder.append(c1);
             stringBuilder.append(c2);
             

         }
         return  stringBuilder.toString();
     }


 }
