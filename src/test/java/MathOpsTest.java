import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MathOpsTest{
    private final dz13_08.MathOps o=new dz13_08.MathOps();

    @Test
    public void sum(){
        assertEquals(o.sum(2,4),6); 
        System.out.println("msg from sum()");
    }
    @Test
    public void sub(){
        assertEquals(o.sub(2,4),-2); 
        System.out.println("msg from sub()");
    }
    @Test
    public void mul(){
        assertEquals(o.mul(2,4),8); 
        System.out.println("msg from mul()");
    }
    @Test
    public void div(){
        assertEquals(o.div(4,2),2); 
        System.out.println("msg from div()");
    }

    @Test
    public void mul_throwsException(){
        assertThrows(IllegalArgumentException.class,()->o.mul(2,0)); 
        System.out.println("msg from mul_t()");
    }
    @Test
    public void div_throwsException(){
        assertThrows(IllegalArgumentException.class,()->o.div(2,0)); 
        System.out.println("msg from div_t()");
    }

}