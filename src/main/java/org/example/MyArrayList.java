package org.example;

import java.util.Arrays;

public class MyArrayList<T> {

    private int size;
    private Object[] list;

    public MyArrayList(int size) {
        list = new Object[size];
    }

    public void add(T element) {
        if (size >= list.length / 2) {
            increaseListSize();
        }
        list[size++] = element;
    }

    public T get(int index) {
        if (index < size) {
            return getData(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public T remove(int index) {
        if (index < size) {
            T elementAtToBeRemovedIndex = getData(index);
            int tmp = index;
            while (tmp < size) {
                list[tmp] = list[tmp + 1];
                list[tmp + 1] = null;
                tmp++;
            }
            size--;
            return elementAtToBeRemovedIndex;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @SuppressWarnings("unchecked")
    private T getData(int index) {
        return (T) list[index];
    }

    private void increaseListSize() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    int getSize() {
        return size;
    }

}
