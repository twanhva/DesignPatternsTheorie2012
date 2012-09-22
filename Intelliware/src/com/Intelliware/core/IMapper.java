package com.Intelliware.core;

/**
 *
 * @author Twan
 */
public interface IMapper<K> {
    
    public IMapper<K> bindKey(K key, IAction action);
    public void performAction(K key) throws InvalidKeyException;
    
}
