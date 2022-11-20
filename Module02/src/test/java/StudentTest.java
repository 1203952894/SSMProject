import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.controller.StudentController;
import xyz.ccola.utils.ApplicationContextUtil;

/**
 * @ Name: StudentTest
 * @ Author: Cola
 * @ Time: 2022/11/19 23:14
 * @ Description: StudentTest 测试类
 */
@Slf4j
public class StudentTest {
    /**
     * 测试 基于 注解 的自动装配之 @Autowired
     */
    @Test
    public void autowiredXmlByNameTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        StudentController studentController01 = (StudentController) context.getBean("StudentController01");
        studentController01.saveStudent();
        log.info("方法：autowiredXmlByNameTest 测试通过");
    }
}
