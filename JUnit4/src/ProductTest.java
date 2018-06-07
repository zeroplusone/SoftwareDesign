import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.*;
public class ProductTest {
    private Product p;
    private String [] inType;    
    private String [] inTitle;
    private double [] inPrice;    
    private double [] expPrice;
    private int size = 3;
    @Before
    public void setUp() throws Exception {
        Data in = new Data("src/incase.txt");
        in.getCol();
        in.getRow();
        Data out = new Data("src/outcase.txt");
    	inType = new String[size];
    	inTitle = new String[size];
    	inPrice = new double[size];
    	expPrice = new double[size];
    	
    	for (int i=0; i<size; i++) {    		
            inType[i] = in.read(i,0);
            inTitle[i] = in.read(i, 1);
            inPrice[i] = Double.parseDouble(in.read(i, 2));
            expPrice[i] = Double.parseDouble(out.read(i, 0));
        }
    }
    @After
    public void tearDown() throws Exception {
        p = null;
    }
    @Test
    public void testGetPrice() {
    	for (int i=0;i<size; i++) {
            p = new Product(inType[i],inTitle[i], inPrice[i]);    	
            assertEquals(expPrice[i], p.getPrice(), 0.0);
            p.getTitle();
            p.getType();
    	}
    }   
    
    @Test
    public void notTest(){
    	// In JUnit 4, the name of test function can start without test. 
    	// You can add annotation. @Test
    	System.out.println("not test");
    }
    
    @Test(expected=FileNotFoundException.class)
    public void testFileNotFound(){
    	Data d = new Data("src/wrongFile.txt");
    }
   
}
