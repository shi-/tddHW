package testPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddhw.*;

/**
 *
 * @author kasia
 */
public class TddTest {
    
    private static final int size = 10;
    private TddArray testArray;
    private String key = "key1";
    private String value = "value1";
    private String value2 = "value2";
    @Before
    public void setUp() {
        testArray = new TddArray(size);
    }
    
    @After
    public void tearDown() {
        testArray = null;
    }

    public TddTest() {
    }
   
    @Test
    public void createTest(){
        TddArray testArray = new TddArray(size);
    }
    
    @Test
    public void putTest(){
        testArray.put(key,value);   
    }
    
    @Test
    public void putTestSameKey(){
        testArray.put(key,value2);
        int x = testArray.keys.indexOf(key);
        String val = testArray.values.get(x);
        assertEquals(val,value2);
    }
    
    @Test
    public void getTest(){
        testArray.put(key,value);
        String getvalue = testArray.get(key);
        assertEquals(getvalue,value);
    }
    
    
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
