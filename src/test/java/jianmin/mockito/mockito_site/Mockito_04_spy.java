package jianmin.mockito.mockito_site;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

//You can create spies of real objects. When you use the spy then the real methods are called (unless a method was stubbed).
//        Real spies should be used carefully and occasionally, for example when dealing with legacy code.
//
//        Spying on real objects can be associated with "partial mocking" concept. Before the release 1.8, Mockito spies were not real partial mocks.
//        The reason was we thought partial mock is a code smell. At some point we found legitimate use cases for partial mocks (3rd party interfaces,
//        interim refactoring of legacy code).

public class Mockito_04_spy {

    @Test
    public void testIt() {
        List list = new LinkedList();
        List spy = spy(list);

        //optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);

        //using the spy calls *real* methods
        spy.add("one");
        spy.add("two");

        //prints "one" - the first element of a list
        System.out.println(spy.get(0));

        //size() method was stubbed - 100 is printed
        System.out.println(spy.size());

        //optionally, you can verify
        verify(spy).add("one");
        verify(spy).add("two");
    }
}
