package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Mock
    private GradeSystem mockGradeSystem;
    @InjectMocks
    private GradeService gradeService;
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        doReturn(Arrays.asList(80.0,90.0,100.0)).when(mockGradeSystem).gradesFor(1);
        Assertions.assertEquals(90.0,gradeService.calculateAverageGrades(1));
//        double result=mockGradeService.calculateAverageGrades(1);
//        Assertions.assertEquals(90.0, result);
//        verify(mockGradeService,times(1)).calculateAverageGrades();

    }
}
