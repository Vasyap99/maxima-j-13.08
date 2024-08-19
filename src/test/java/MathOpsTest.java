import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MathOpsTest{
    private final dz13_08.MathOps o=new dz13_08.MathOps();

    @ParameterizedTest(name="values: {0},{1},{2}")
    @CsvSource(value={"2,4,6","7,-1,6","4,0,4","-55,1,-54"})
    @DisplayName("msg from sum()")
    public void sum(int a,int b,int c){
        //System.out.println(""+a+":"+b+":"+c); 
        assertEquals(o.sum(a,b),c); 
    }

    @ParameterizedTest(name="values: {0},{1},{2}")
    @CsvSource(value={"2,4,-2","7,-1,8","4,0,4","-55,1,-56"})
    @DisplayName("msg from sub()")
    public void sub(int a,int b,int c){
        //System.out.println(""+a+":"+b+":"+c); 
        assertEquals(o.sub(a,b),c); 
    }

    @ParameterizedTest(name="values: {0},{1},{2}")
    @CsvSource(value={"2,4,8","7,-1,-7","4,1,4"})
    @DisplayName("msg from mul()")
    public void mul(int a,int b,int c){
        //System.out.println(""+a+":"+b+":"+c); 
        assertEquals(o.mul(a,b),c); 
    }

    @ParameterizedTest(name="values: {0},{1},{2}")
    @CsvSource(value={"7,2,3","7,-1,-7","4,2,2"})
    @DisplayName("msg from div()")
    public void div(int a,int b,int c){
        assertEquals(o.div(a,b),c); 
    }

    @Test
    @DisplayName("msg from pow()")
    public void exp(){
        assertEquals(o.exp(4,2),16); 
    }

    @Nested
    @DisplayName("throw tests:")
    class MathOps_throwTest{
        @Test
        @DisplayName("msg from mul_t()")
        public void mul_throwsException(){
            assertThrows(IllegalArgumentException.class,()->o.mul(2,0)); 
        }
        @Test
        @DisplayName("msg from div_t()")
        public void div_throwsException(){
            assertThrows(IllegalArgumentException.class,()->o.div(2,0)); 
        }
    }
}
