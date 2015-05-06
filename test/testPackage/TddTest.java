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
    
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
