package CourseJava.tasks.task8;

public class MyArrayList<T> implements MyList<T> {

    private int size = 0;
    private Object[] myArrayLists;
    private final int CAPACITY = 10;

    public MyArrayList() {
        myArrayLists = (T[]) new Object[CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) myArrayLists = (T[]) new Object[CAPACITY];
        else myArrayLists = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) > 0;
    }

    @Override
    public boolean add(T value) {
        if (size >= myArrayLists.length) {
            lengthenMyArrList();
        }
        myArrayLists[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        if (size + 1 >= myArrayLists.length) {
            lengthenMyArrList();
        }
        if (index < 0) {
            return false;
        }
        if (index > size) {
            index = size;
        }
        for (int i = 0; i >= index; i--) {
            myArrayLists[i + 1] = myArrayLists[i];
        }
        myArrayLists[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        boolean isRemove = false;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (myArrayLists[i].equals(value)) {
                count = i;
                isRemove = true;
                break;
            }
        }
        for (int i = count; i < size; i++) {
            myArrayLists[i] = myArrayLists[i + 1];
        }
        size--;
        return isRemove;
    }

    @Override
    public boolean addAll(MyList<? extends T> value) {
        Object[] newMyArrayList = new Object[size + value.size()];
        for (int i = 0; i < size; i++) {
            newMyArrayList[i] = myArrayLists[i];
        }
        for (int i = 0; i < value.size(); i++) {
            newMyArrayList[i + size] = value.get(i);
        }
        size = size + value.size();
        myArrayLists = newMyArrayList;
        return true;
    }

    @Override
    public T get(int index) {
        return (T) myArrayLists[index];
    }

    @Override
    public T remove(int index) {
        T number = (T) myArrayLists[index];
        for (int i = index; i < size; i++) {
            myArrayLists[i] = myArrayLists[i + 1];
        }
        size--;
        return number;
    }

    @Override
    public T set(int index, T value) {
        T number = (T) myArrayLists[index];
        myArrayLists[index] = value;
        return number;
    }

    @Override
    public int indexOf(Object value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (myArrayLists[i].equals(value)) {
                index = i;
                break;
            }
        }
        return index;
    }

    private void lengthenMyArrList() {
        Object[] newMyArrList = new Object[(int) Math.floor(CAPACITY * 1.5)];
        for (int i = 0; i < myArrayLists.length; i++) {
            newMyArrList[i] = myArrayLists[i];
        }
        myArrayLists = newMyArrList;
    }
}
