import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.ccola.mapper.StudentMapper;
import xyz.ccola.pojo.Student;
import xyz.ccola.utils.SQLUtil;

import java.io.IOException;
import java.util.List;

/**
 * @ Name: StudentTest
 * @ Author: Cola
 * @ Time: 2022/11/19 17:19
 * @ Description: StudentTest 测试类
 */
@Slf4j
public class StudentTest {

    /**
     * 测试 获取全部学生信息
     */
    @Test
    public void showInfoTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.showInfo();
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 添加学生
     */
    @Test
    public void insertStudentTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer count = mapper.insertStudent(new Student(null, "Admin", 20));
        System.out.println("成功插入 " + count + " 行数据");
        log.info("成功插入 " + count + " 名学生信息");
    }

    /**
     * 测试 通过 Id 查询学生信息
     */
    @Test
    public void findStudentById() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.findStudentById(1);
        for (Student student : students) {
            System.out.println(student.toString());
            log.info("成功查询到 id 为 " + student.getId() + " 学生的信息");
        }

    }

    /**
     * 测试 通过 Name 修改学生信息
     */
    @Test
    public void updateStudentInfoByName() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Integer count = mapper.updateStudentInfoByName(
                "Admin",
                new Student(5, "Admin3", 23)
        );
        System.out.println("成功更新 " + count + " 行数据");
        log.info("成功更新 " + count + " 名学生信息");
    }

    /**
     * 测试 if 标签的使用
     */
    @Test
    public void ifElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.ifElement(
                1,
                "Cola",
                null
        );
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 where 标签的使用
     */
    @Test
    public void whereElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.whereElement(
                1,
                "Cola",
                null
        );
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 trim 标签的使用
     */
    @Test
    public void trimElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.trimElement(
                1,
                "Cola",
                null
        );
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 choose when otherwise 标签的使用
     */
    @Test
    public void chooseElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.chooseElement(
                null,
                "Cola",
                null
        );
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 forEach 标签的使用
     */
    @Test
    public void forEachElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.forEachElement(new Integer[]{1, 2});
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

    /**
     * 测试 sql 标签的使用
     */
    @Test
    public void sqlElementTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.sqlElement(
                null,
                "Cola",
                null
        );
        for (Student student : students) {
            System.out.println(student.toString());
        }
        log.info("成功获取" + students.size() + "条学生信息(全部)");
    }

}
