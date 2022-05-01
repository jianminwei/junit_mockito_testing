package learning_mockito.check_arguments;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BarTest {
    @Mock private Foo fooMock;
    @InjectMocks  private Bar underTest;
    @Captor  private ArgumentCaptor<String> stringCaptor;

    @Test
    public void should_test_smth() {
        underTest.doSmth();

        verify(fooMock).bla(stringCaptor.capture());

        //both tests below are same.
        assertThat(stringCaptor.getValue(), is("val"));
        assertEquals("val", stringCaptor.getValue());

        //verify the method is called
        verify(fooMock).bla("val");
    }
}