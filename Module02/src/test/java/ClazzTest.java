import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.controller.ClazzController;
import xyz.ccola.utils.ApplicationContextUtil;

/**
 * @ Name: ClazzTest
 * @ Author: Cola
 * @ Time: 2022/11/19 23:43
 * @ Description: ClazzTest 测试类
 */
@Slf4j
public class ClazzTest {
    /**
     * 测试 基于 注解 的自动装配之 @Qualifier
     */
    @Test
    public void autowiredXmlByNameTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        ClazzController clazzController01 = (ClazzController) context.getBean("ClazzController01");
        clazzController01.saveClazz();
        log.info("方法：autowiredXmlByNameTest 测试通过");
    }
}
