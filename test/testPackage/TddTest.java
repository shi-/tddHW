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
    
    private TddArray testArray;
    private String key = "key1";
    private String key2 = "key2";
    private String value = "value1";
    private String value2 = "value2";
    @Before
    public void setUp() {
        testArray = new TddArray();
    }
    
    @After
    public void tearDown() {
        testArray = null;
    }

    public TddTest() {
    }
   
    @Test
    public void createTest(){
        TddArray testArray = new TddArray();
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
    
    @Test(expected = NoSuchKeyException.class)
    public void getTestExc(){
        testArray.put(key,value);
        String getvalue = testArray.get(key2);
    }
    
    @Test
    public void getOrElseTest(){
        testArray.put(key,value);
        String getvalue = testArray.getOrElse(key, "fail");
        assertEquals(getvalue, value);
        
    }
    
    @Test
    public void getOrElseTestNoKey(){
        testArray.put(key,value);
        String getvalue = testArray.getOrElse(key2, "fail");
        assertEquals(getvalue, "fail");
        
    }
    
    @Test
    public void containsKeyTestTrue(){
        testArray.put(key,value);
        assertTrue(testArray.containsKey(key));
    }
    @Test
    public void containsKeyTestFalse(){
        testArray.put(key,value);
        assertFalse(testArray.containsKey(key2));
    }

    @Test
    public void removeTestTrue(){
        testArray.put(key, value);
        assertTrue(testArray.remove(key));
          
    }
    @Test
    public void removeTestFalse(){
        testArray.put(key, value);
        assertFalse(testArray.remove(key2));
        
    }
    
    @Test
    public void sizeTest(){
        testArray.put(key, value);
        testArray.put(key2,value2);
        assertEquals(testArray.size(),2);
    }

}
