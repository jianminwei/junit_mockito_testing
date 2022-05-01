package jianmin.mockito.captor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MockitoCaptorExample   {
    @Mock  Stack<String> stack;
    @Captor  ArgumentCaptor<String> argumentCaptor;

//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void test()  {
        stack.add("Java Code Geeks");
        Mockito.verify(stack).add(argumentCaptor.capture());
        assertEquals("Java Code Geeks", argumentCaptor.getValue());
    }
}