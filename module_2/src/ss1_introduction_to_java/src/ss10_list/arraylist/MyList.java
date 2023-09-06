package ss10_list.arraylist;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
    }

    E get(int i) {
        Object element = elements[i];
        return (E)elements[i];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            System.out.println("Nhap so lon hon 0");
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                System.out.println(elements[i]);
            }
        }
        return "";
    }

    void add(int index, Object element) {
        if (index >= 0 && index < elements.length) {
            elements[index] = element;
        } else {
            System.out.println("index khong hop le");
        }
    }
//
//    public E remove(int index) {
//        for (int i = 0; i < elements.length; i++) {
//            if (elements.get(i) == index) {
//
//            }
//        }
//    }

}
