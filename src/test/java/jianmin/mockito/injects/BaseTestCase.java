package jianmin.mockito.injects;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

//This is to initialize Mockito mocks before the tests, here is the code of the class.
public class BaseTestCase {
    @BeforeEach
    void init_mocks() {
        MockitoAnnotations.openMocks(this);
    }
}
