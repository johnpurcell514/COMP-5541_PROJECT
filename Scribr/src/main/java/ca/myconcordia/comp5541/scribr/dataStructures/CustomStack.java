/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.myconcordia.comp5541.scribr.dataStructures;

import java.lang.reflect.Array;

/**
 *
 * @author sarsingh
 * @param <T>
 */
public class CustomStack<T> {

    private T[] stack;
    private int size;
    private int top;
    private Class<T> tclass;

    public CustomStack(int size, Class<T> tclass) {
        //this.stack = (T[]) new Object[size];
        this.tclass = tclass;
        this.top = 0;
        this.size = size;
        this.stack = (T[]) Array.newInstance(tclass, size);
    }

    public void push(T obj) {
        if (top >= size) {
            T[] newStack = (T[]) Array.newInstance(tclass, size);
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

    // left shift all elements and bubble NULLs to top of stack
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
    
    public T[] getStack() {
        return this.stack;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("STACK=[");
        for(int i = 0; i < size; i++){
            if(i != size-1){
                sb.append(stack[i]);
                sb.append(", ");
            } else {
                sb.append(stack[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}