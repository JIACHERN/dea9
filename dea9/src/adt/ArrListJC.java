/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import entity.Questions;

/**
 *
 * @author Peanut Chern
 */
public class ArrListJC<T> implements ListInterfaceJC<T> {

    private int length;
    private T[] array;
    private int lastIndex;
    private Questions[] questions;
    

    public ArrListJC(int capacity){
        length = 0;
        array = (T[]) new  Object[capacity];
    }
    
    //Check the true or false the diamond is added
    public boolean add(int position, T newEntry) {
        boolean addSuccessful = true;

        if ((position >= 1) && (position <= length + 1)) {
            if (!arrayIsNotFull()) {
                newAddEntry(position);
                array[position - 1] = newEntry;
                length++;
            }
        } else {
            addSuccessful = false;
        }
        return addSuccessful;
    }

    private boolean arrayIsNotFull() {
        return length == array.length;
    }

    private void newAddEntry(int newIndex) {
        //start from 1 but system start from 0 so need to minus 1
        int newDiamondIndex = newIndex - 1;
        int lastAddIndex = length - 1;

        for (int addIndex = lastAddIndex; addIndex >= newDiamondIndex; addIndex++) {
            array[addIndex - 1] = array[addIndex];
        }
    }

    //Assign level 1,2,3
    public boolean addLevel(T newEntry) {
        array[length] = newEntry;
        length++;
        return true;
    }

    private void newLevelEntry(int addIndex) {
        addIndex = 0;
        int lastIndex = 3;

        for (addIndex = 0; addIndex <= lastIndex; addIndex++) {
            array[addIndex - 1] = array[addIndex];
        }
    }

    public boolean contains(T anEntry) {
        boolean ifFound = false;
        
        for(int index = 0; !ifFound && (index < length); index++){
            if(anEntry.equals((array[index]))){
                ifFound = true;
            }
        }
        
        return ifFound;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    
    
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;

        if ((givenPosition >= 1) && (givenPosition <= length)) {
            array[givenPosition - 1] = newEntry;
        } else {
            isSuccessful = false;
        }

        return isSuccessful;
    }
    
}





