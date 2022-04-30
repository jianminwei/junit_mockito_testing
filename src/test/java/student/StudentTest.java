package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {

    //This is beautiful. Mochkito simply mock a StudentService object!!
    StudentService studentService = Mockito.mock(StudentService.class);

    //Now we can use the mocked studentService just as a concrete object.
    Student student = new Student(studentService);

    @Test
    @DisplayName("Test average student score service")
    void testAverage(){
        //This is beautiful. Mockito can mock the behavior of the mocked object.
        Mockito.when(studentService.getTotalMarks()).thenReturn(500);
        Mockito.when(studentService.getTotalStudents()).thenReturn(10);
        Assertions.assertEquals(50, student.getAverageMarks());
    }
}
