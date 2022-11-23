import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import xyz.ccola.bean.Vip;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @ Name: VipTest
 * @ Author: Cola
 * @ Time: 2022/11/21 19:47
 * @ Description: VipTest
 */

@Slf4j
public class VipTest {

    /**
     * 测试 数据库连接
     */
    @Test
    public void druidDataBaseConnectionTest() throws SQLException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-jdbc.xml");
        DataSource dataSource = (DataSource) context.getBean("druidDataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        log.info("方法：druidDataBaseConnectionTest 测试通过");
    }


    /**
     * 测试 查询一条数据为一个实体类对象
     */
    @Test
    public void selectEmpByIdTest() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("JdbcTemplate");
        String sql = "select * from table_vip where vip_id = ?";
        Vip vip = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>
                (Vip.class), 1);
        System.out.println(vip);
        log.info("方法：selectEmpByIdTest 测试通过");
    }


    /**
     * 测试 查询多条数据为一个list集合
     */
    @Test
    public void SelectEmpTest() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("JdbcTemplate");
        String sql = "select * from table_vip ";
        List<Vip> vip = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>
                (Vip.class));
        System.out.println(vip.toString());
        log.info("方法：SelectEmpTest 测试通过");
    }

    /**
     * 测试 查询单行单列的值
     */
    @Test
    public void selectCountTest() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("JdbcTemplate");
        String sql = "select count(vip_id) from table_vip ";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
        log.info("方法：selectCountTest 测试通过");
    }


}
