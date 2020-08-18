/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author Peanut Chern
 */
public interface ListInterfaceJC <T> {
    
    //Add new entry of diamond to the end of the list
    public boolean add(int position, T newEntry);
    
    //Add new entry of level to the end of list
    public boolean addLevel(T newEntry);
    
    public boolean replace(int givenPosition, T newEntry);
    
    public boolean contains(T anEntry);
    
    public boolean isEmpty();

}
