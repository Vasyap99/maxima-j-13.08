import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


public class MathOpsTest{
    private final dz13_08.MathOps o=new dz13_08.MathOps();

    @Test
    @DisplayName("msg from sum()")
    public void sum(){
        assertEquals(o.sum(2,4),6); 
    }
    @Test
    @DisplayName("msg from sub()")
    public void sub(){
        assertEquals(o.sub(2,4),-2); 
    }
    @Test
    @DisplayName("msg from mul()")
    public void mul(){
        assertEquals(o.mul(2,4),8); 
    }
    @Test
    @DisplayName("msg from div()")
    public void div(){
        assertEquals(o.div(4,2),2); 
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