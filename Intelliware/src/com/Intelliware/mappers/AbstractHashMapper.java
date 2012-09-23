package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.core.InvalidKeyException;
import java.util.HashMap;

/**
 *
 * @author Twan
 */
public abstract class AbstractHashMapper<O, K> implements IMapper<K> {
    
    protected O object;
    private HashMap<K, IAction> mapping = new HashMap<>();

    public AbstractHashMapper(O object) {
        this.object = object;
    }
    
    public void setObject(O object) {
        this.object = object;
    }
    
    public O getObject() {
        return object;
    }
    
    @Override
    public IMapper<K> bindKey(K key, IAction action) {
        mapping.put(key, action);
        return this;
    }

    @Override
    public void performAction(K key) throws InvalidKeyException {
        if(mapping.containsKey(key)) {
            mapping.get(key).performAction();
        } else {
            throw new InvalidKeyException("The key " + key + " is not available for this device");
        }
    }
    
}
