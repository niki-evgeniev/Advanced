package Workshop;

import java.util.function.Consumer;

public class SmartArray {
    private final static int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;


    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    private int[] resize() {
        int[] newArray = new int[capacity * 2];

        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
            capacity++;
        }
        data = newArray;
        return data;
    }

    public void add(int element) {
        if (size == data.length) {
            resize();
            this.data[this.size++] = element;
        } else {
            this.data[this.size++] = element;
        }
    }

    public void get(int index) {
        checkIndex(index);
        //return data[index];
    }

    public void remove(int index) {
        checkIndex(index);
        int removedIndex = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        shrink();
        data[size - 1] = 0;
        this.size--;
        //return removedIndex;
    }

    private int[] shrink() {
        int reduceFactor = 2;
        int[] newArray = new int[size];
        if (capacity / reduceFactor >= size) {
            for (int i = 0; i < size; i++) {
                newArray[i] = data[i];
            }
            this.data = newArray;
            return this.data;
        }
        return this.data;
    }

    public void add(int index, int element) {
        checkIndex(index);
        int lastElement = this.data[size - 1];
        for (int i = size - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        add(lastElement);
    }

    public boolean contains(int element) {
        for (int i = 0; i < size - 1; i++) {
            if (element == data[i]) {
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + this.size);
        }
    }

}
