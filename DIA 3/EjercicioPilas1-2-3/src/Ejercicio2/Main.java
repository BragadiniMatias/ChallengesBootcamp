package Ejercicio2;

public class Main {


    static int sumAll(int A[], int N)
    {
        if (N <= 0)
            return 0;
        return (sumAll(A, N - 1) + A[N - 1]);
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sumAll(arr, arr.length));
    }
}
