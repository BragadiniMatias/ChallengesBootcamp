package Ejercicio3;

public class Main {
    public static void main(String[] args) {
    Integer[] arrayInt = {10, 4, 5, 6, 5, 3 ,100};
        reverseArray(arrayInt);

    }

    public static void reverseArray(Integer[] arr){
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i] + "  ");
    }
}

