/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.dataStructures;

/**
 *
 * @author sarsingh
 * @param <T>
 */
public class CustomStack<T> {

    private T[] stack;
    private int size;
    private int top;

    public CustomStack(int size) {
        this.stack = (T[]) new Object[size];
        this.top = 0;
        this.size = size;
    }

    public void push(T obj) {
        if (top >= size) {
            T[] newStack = (T[]) new Object[size];
            for (int i = 1; i < size; i++) {
                newStack[i - 1] = stack[i];
            }
            newStack[top - 1] = obj;
            this.stack = newStack;
        } else {
            stack[top++] = obj;
        }
    }

    public T pop() {
        if (top < 0)
            throw new IndexOutOfBoundsException();
        T obj = stack[top--];
        stack[top + 1] = null;
        return obj;
    }

    // bubble NULLs to top of stack
    public T popAtIndex(int index) {
        if (top < 0)
            throw new IndexOutOfBoundsException();
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException();

        T obj = stack[index];

        for (int i = index; i < size - 1; i++) {
            T temp = stack[i + 1];
            stack[i] = temp;
        }

        stack[size - 1] = null;

        return obj;
    }

    public T getAtIndex(int index) {
        return stack[index];
    }

    public int getSize() {
        return this.size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(stack[i]);
        }
    }
}