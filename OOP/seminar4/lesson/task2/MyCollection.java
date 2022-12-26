package OOP.seminar4.lesson.task2;

import java.util.Arrays;

public class MyCollection<T> {
    private T[] array;

    public MyCollection(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(T value, int index) {
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    public void add(T newValue) {
        T[] newArray = (T[]) new Object[this.size() + 1];
        for (int i = 0; i < size(); i++) {
            newArray[i] = array[i];
        }
        newArray[size()] = newValue;
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
