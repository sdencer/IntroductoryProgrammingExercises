package com.jinli.Test;

import com.jinli.Code.Diamond;
import com.jinli.Code.Triangle;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by jinli on 8/2/16.
 */

//todo
public class TestCode {
    @Test
    public void triangleTest(){
        Triangle triangle = new Triangle();

        assertEquals("*", triangle.test1());
        assertEquals("********", triangle.test2(8));
        assertEquals("*\n*\n*\n", triangle.test3(3));
        assertEquals("*\n**\n***\n",triangle.test4(3));
    }

    @Test
    public void diamondTest(){
        Diamond diamond = new Diamond();

        assertEquals("  *\n ***\n*****\n", diamond.test1(3));
        assertEquals("  *\n ***\n*****\n ***\n  *\n", diamond.test2(3));
        assertEquals("  *\n ***\nSdencer\n ***\n  *\n", diamond.test3(3));
    }

}
