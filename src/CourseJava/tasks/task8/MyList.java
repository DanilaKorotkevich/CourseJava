package CourseJava.tasks.task8;

public interface MyList<T> {

    int size();
    int indexOf(Object value);
    T get(int index);
    T set(int index, T value);
    T remove(int index);
    boolean isEmpty();
    boolean contains(Object value);
    boolean add(T value);
    boolean add(int index, T value);
    boolean remove(Object value);
    boolean addAll(MyList<? extends T> value);

}
