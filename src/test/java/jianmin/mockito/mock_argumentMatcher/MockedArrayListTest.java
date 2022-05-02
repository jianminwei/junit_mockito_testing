package jianmin.mockito.mock_argumentMatcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockedArrayListTest {

    static boolean isValid(Object t) {
        return true;
    }

    @Test
    void testAnyParams() {

        ArrayList<String> mockedArrayList = mock(ArrayList.class);

        when(mockedArrayList.get(anyInt())).thenReturn("a mocked element");

        assertEquals("a mocked element", mockedArrayList.get(0));
        assertEquals("a mocked element", mockedArrayList.get(1));
        assertEquals("a mocked element", mockedArrayList.get(999));

        when(mockedArrayList.contains(anyString())).thenReturn(true);

        assertTrue(mockedArrayList.contains("anything"));
        assertTrue(mockedArrayList.contains("foo"));
        assertTrue(mockedArrayList.contains("bar"));

        //when(mockedArrayList.contains(anyObject())).thenReturn(true);
    }

}