package xyz.ccola.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.ccola.pojo.Student;

import java.util.List;

/**
 * @ Name: StudentMapper
 * @ Author: Cola
 * @ Time: 2022/11/19 17:18
 * @ Description: StudentMapper 接口
 */
public interface StudentMapper {

    /**
     * 查询所有学生的全部信息
     *
     * @return 学生集合
     */
    List<Student> showInfo();

    /**
     * 增加学生
     *
     * @param student 学生
     * @return 受影响的行数
     */
    Integer insertStudent(Student student);

    /**
     * 根据 id 查询指定学生信息
     *
     * @param id 学生 id
     * @return 受影响的行数
     */
    List<Student> findStudentById(@Param("id") Integer id);

    /**
     * 根据 name 修改学生信息
     *
     * @param findName 学生姓名
     * @param student  更新后的信息
     * @return 受影响的行数
     */
    Integer updateStudentInfoByName(@Param("findName") String findName,
                                    @Param("student") Student student);

    /**
     * if 标签的使用
     *
     * @return 学生列表
     */
    List<Student> ifElement(@Param("id") Integer id,
                            @Param("name") String name,
                            @Param("age") Integer age);

    /**
     * where 标签的使用
     *
     * @return 学生列表
     */
    List<Student> whereElement(@Param("id") Integer id,
                               @Param("name") String name,
                               @Param("age") Integer age);

    /**
     * trim 标签的使用
     *
     * @return 学生列表
     */
    List<Student> trimElement(@Param("id") Integer id,
                              @Param("name") String name,
                              @Param("age") Integer age);

    /**
     * choose when otherwise 标签的使用
     *
     * @return 学生列表
     */
    List<Student> chooseElement(@Param("id") Integer id,
                                @Param("name") String name,
                                @Param("age") Integer age);

    /**
     * forEach 标签的使用
     *
     * @param ids ids
     * @return 用户列表
     */
    List<Student> forEachElement(@Param("ids") Integer[] ids);

    /**
     * sql 标签的使用
     *
     * @return 学生列表
     */
    List<Student> sqlElement(@Param("id") Integer id,
                             @Param("name") String name,
                             @Param("age") Integer age);
}
