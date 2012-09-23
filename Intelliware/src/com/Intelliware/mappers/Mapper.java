package com.Intelliware.mappers;

import com.Intelliware.core.IAction;
import com.Intelliware.core.IMapper;
import com.Intelliware.core.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Twan
 */
public class Mapper<O, K> implements IMapper<K> {
    
    protected O object;
    private Map<K, IAction> mapStategy;

    public Mapper(O object) {
        this(object, new HashMap<K, IAction>());
    }
    
    public Mapper(O object, Map<K, IAction> mapStategy) {
        this.object = object;
        this.mapStategy = mapStategy;
    }
    
    public void setObject(O object) {
        this.object = object;
    }
    
    public O getObject() {
        return object;
    }
    
    public void setMapStrategy(Map<K, IAction> mapStrategy) {
        this.mapStategy = mapStrategy;
    }
    
    @Override
    public IMapper<K> bindKey(K key, IAction action) {
        mapStategy.put(key, action);
        return this;
    }

    @Override
    public void performAction(K key) throws InvalidKeyException {
        if(mapStategy.containsKey(key)) {
            mapStategy.get(key).performAction();
        } else {
            throw new InvalidKeyException("The key " + key + " is not available for this device");
        }
    }
    
}
