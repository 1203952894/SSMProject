import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.controller.TeacherController;
import xyz.ccola.utils.ApplicationContextUtil;

/**
 * @ Name: VipTest
 * @ Author: Cola
 * @ Time: 2022/11/19 23:04
 * @ Description: VipTest 测试类
 */
@Slf4j
public class TeacherTest {
    /**
     * 测试 基于 XML 的自动装配之 ByName
     */
    @Test
    public void autowiredXmlByNameTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        TeacherController teacherController01 = (TeacherController) context.getBean("TeacherController01");
        teacherController01.saveTeacher();
        log.info("方法：autowiredXmlByNameTest 测试通过");
    }
}
