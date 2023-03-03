package Workshop;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Stack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] stack;
    private int size;
    private int capacity;

    public Stack() {
        this.capacity = INITIAL_CAPACITY;
        this.stack = new int[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if (size == capacity) {
            resize();
            this.stack[size++] = element;
        } else {
            this.stack[size++] = element;
        }
    }

    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        //
        int lastElement = stack[size - 1];
        this.size--;
        decreaseSize();
        return lastElement;

    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.stack[i]);
        }
    }

    private int[] resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < stack.length; i++) {
            newArray[i] = stack[i];
            capacity++;
        }
        stack = newArray;
        return stack;
    }

    private void decreaseSize() {
        int reduceFactor = 2;
        int[] newArray = new int[size];
        if (capacity / reduceFactor >= size) {
            for (int i = 0; i < size; i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
        }
    }

}
