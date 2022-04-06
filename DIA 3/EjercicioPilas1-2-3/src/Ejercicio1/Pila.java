package Ejercicio1;

import java.util.EmptyStackException;

public class Pila {
    private int arr[];
    private int size;
    private int index = 0;

    public Pila(int size){
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("La pila esta llena!");
        }
        arr[index] = element;
        index++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arr[--index];
    }

    public boolean isFull(){
        if(index == this.size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return true;
    }

    public int size(){
        return index;
    }

}
