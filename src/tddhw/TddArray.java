/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddhw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasia
 * @param <String>
 */
public class TddArray {

    private int size;
    public List<String> keys;
    public List<String> values;
    
    public TddArray(int x){
        size = x;   
        keys = new ArrayList<String>();
        values = new ArrayList<String>();
    
}
    public void put(String key, String value){
        
        if (keys.contains(key)){
            int x = keys.indexOf(key);
            values.set(x, value);
        }
        else{
        keys.add(key);
        values.add(value);
        }
    }

    
    
}
