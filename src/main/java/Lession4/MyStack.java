package Lession4;

public class MyStack {
    private String[] arr = new String[10];
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(String item){
        arr[size++] = item;

    }

    String peek(){
        return  arr[size - 1];
    }

    String pop(){
        return  arr[--size];
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        if (!empty()){
            stringBuilder.append(arr[0]);
            for (int i = size - 2; i > 0 ; i--) {
                stringBuilder.append(", ");
                stringBuilder.append(arr[i]);

            }
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
    }

}
