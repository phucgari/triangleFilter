import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleFilterTest {
    TriangleFilter filter=new TriangleFilter();
    @Test
    void test2_2_0(){
        String result=filter.triangleFilter(2,2,0);
        Assertions.assertEquals("Not a Triangle",result);
    }
    @Test
    void test3_4_6(){
        String result=filter.triangleFilter(3,4,6);
        Assertions.assertEquals("Normal Triangle",result);
    }
    @Test
    void testMinus1_2_1(){
        String result=filter.triangleFilter(-1,2,1);
        Assertions.assertEquals("Not a Triangle",result);
    }
    @Test
    void testMinus8_2_3(){
        String result=filter.triangleFilter(8 ,2,3);
        Assertions.assertEquals("Not a Triangle",result);
    }
    @Test
    void test2_1_1(){
        String result=filter.triangleFilter(2,1,1);
        Assertions.assertEquals("Isosceles Triangle",result);
    }
    @Test
    void test1_1_2(){
        String result=filter.triangleFilter(1,1,2);
        Assertions.assertEquals("Isosceles Triangle",result);
    }
    @Test
    void test1_1_1(){
        String result=filter.triangleFilter(1,1,1);
        Assertions.assertEquals("Equilateral Triangle",result);
    }
}