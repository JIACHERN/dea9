package adt;

public interface ListInterface<T> {
    public default boolean add(T addNew){

        return false;
    }
}
