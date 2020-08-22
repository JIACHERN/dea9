package adt;

public class arrList<Q> implements arrListInterface<Q> {

    public Q[] array;
    private int length;
    private static final int DEFAULT_CAPACITY = 15;

    public arrList(){
        this(DEFAULT_CAPACITY);
    }

    public arrList(int capacity){
        length=0;
        array = (Q[]) new Object[capacity];
    }

    //assigned question, option and store the answer
    public boolean add(Q newEntry) {
        array[length] = newEntry;
        length++;
        return true;
    }

    //get entry
    public Q getEntry(int givenPosition){
        Q result = null;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            result = array[givenPosition - 1];
        }

        return result;
    }

    private boolean arrayIsNotFull(){
        return length == array.length;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public boolean isFull() {
        return false;
    }

    public String toString(int position){
        String str = "";
        //for (int index = 0; index < length; ++index) {
            str += array[position] + "\n";
        //}
        return str;
    }
}
