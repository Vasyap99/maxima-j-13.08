import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import java.util.List;


import org.junit.jupiter.params.provider.Arguments;

public class MathOpsTest{
    private final dz13_08.MathOps o=new dz13_08.MathOps();

    @BeforeAll
    public static void init() {
        System.out.println("Начинается тестирование");
    }

    @AfterAll
    public static void end() {
        System.out.println("Тестирование закончилось");
    }

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


    static Stream<Object> args1() {
        return Stream.of(
            Arguments.of(7, 2,3),
            Arguments.of(-5, 2,-2),
            Arguments.of(9, 4,2)
        );
    }
    static Stream<Integer> args2() {
        return Stream.of(-7,2,-3);
    }

    @ParameterizedTest(name="values: {0},{1},{2}")
    @MethodSource("args1")
    @DisplayName("msg from div()")
    public void div(Integer a,Integer b,Integer c){
        System.out.println("div: "+a+":"+b+":"+c); 
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
