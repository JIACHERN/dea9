package adt;

public interface arrListInterface<Q> {

    public boolean add(Q newEntry);

    public Q getEntry(int givenPosition);

    public int getLength();

    public boolean isFull();

    public boolean isEmpty();

    public String toString(int position);

}
