package ss10_list.arraylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            System.out.println("Nhap do dai lon hon 0");
        }
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                System.out.println("index " + i + ": " + elements[i]);
            }
        }
        return "";
    }

     E  add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index >= 0 && elements[index] != null) {
            int count = 1 ;
            for (int i = index + 1; i < elements.length; i++) {
                    elements[elements.length-count] = elements[elements.length-(count+1)];
                    count++;
            }
            elements[index] = element;
            size++;
        } else if (index >= 0 && index < elements.length) {
            elements[index] = element;
            size++;
        }
         return element;
     }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        E element = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
