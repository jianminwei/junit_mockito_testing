package jianmin.mockito.than_return;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ThenReturnExampleTest {
    /**
     * This will test multiple return values.
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Java Code Geeks").thenReturn("Mockito");
        String result = i.next() + " " + i.next();
        assertEquals("Java Code Geeks Mockito", result);
    }
    /**
     * This test demonstrates how to return values based on the input
     */
    @Test
    public void test2() {
        Comparable c= mock(Comparable.class);
        when(c.compareTo("Java Code Geeks")).thenReturn(100);
        when(c.compareTo("Mockito")).thenReturn(200);
        assertEquals(200,c.compareTo("Mockito"));
    }
    /**
     * This test demonstrates how to return values independent of the input value
     */
    @Test
    public void test3() {Comparable c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(0);
        assertEquals(0 ,c.compareTo(9));
    }

}
