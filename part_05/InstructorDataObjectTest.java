package part_05;


import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.Arrays;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class InstructorDataObjectTest {

    @Mock
    private InstructorDataObject instructorDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetClassesByInstructor() {
        // Given
        String instructorId = "instructor123";
        List<Class> expectedClasses = Arrays.asList(
                new Class("Math", "Fall 2023"),
                new Class("English", "Fall 2023")
        );
        when(instructorDataObject.getClassesByInstructor(instructorId)).thenReturn(expectedClasses);

        // When
        List<Class> actualClasses = clientBusinessObjectImpl.getClassesByInstructor(instructorId);

        // Then
        verify(instructorDataObject).getClassesByInstructor(instructorId);
        assertEquals(expectedClasses, actualClasses);
    }
}

public class ClassDataObjectTest {

    @Mock
    private ClassDataObject classDataObject;

    @InjectMocks
    private ClientBusinessObjectImpl clientBusinessObjectImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetStudentsInClass() {
        // Given
        String classId = "class123";
        List<Student> expectedStudents = Arrays.asList(
                new Student("John Doe", "class123"),
                new Student("Jane Smith", "class123")
        );
        when(classDataObject.getStudentsInClass(classId)).thenReturn(expectedStudents);

        // When
        List<Student> actualStudents = clientBusinessObjectImpl.getStudentsInClass(classId);

        // Then
        verify(classDataObject).getStudentsInClass(classId);
        assertEquals(expectedStudents, actualStudents);
    }
}

