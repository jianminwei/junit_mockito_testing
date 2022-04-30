package jianmin.mockito.mockito_site;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
public class Mockito_05_lambda {

    @Test
    void testIt() {
        //mock creation
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.add("two");

        verify(mockedList, times(2)).add(argThat((String s) -> s.length() < 5));
    }
}
