package com.Intelliware.core;

import java.util.HashMap;

/**
 *
 * @author Twan
 */
public class HashMapper implements IMapper<Integer> {
    
    private HashMap<Integer, IAction> mapping = new HashMap<>();

    @Override
    public IMapper<Integer> bindKey(Integer key, IAction action) {
        mapping.put(key, action);
        return this;
    }

    @Override
    public void performAction(Integer key) throws InvalidKeyException {
        if(mapping.containsKey(key)) {
            mapping.get(key).performAction();
        } else {
            throw new InvalidKeyException("The key " + key + " is not available for this device");
        }
    }
    
}
