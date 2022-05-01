package jianmin.mockito.mock_interface;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class GreetingTest {

    @Mock  Greeting greeting = mock(Greeting.class);

    @Test
    void sayHelloTest() {
        when(greeting.sayHello()).thenReturn("Good morning");
        assertEquals("Good morning", greeting.sayHello());
    }
}