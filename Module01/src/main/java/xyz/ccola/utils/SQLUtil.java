package xyz.ccola.utils;

import lombok.Cleanup;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @ Name: SQLUtil
 * @ Author: Cola
 * @ Time: 2022/11/19 9:05
 * @ Description: SQL 工具类
 */
public class SQLUtil {

    /**
     * 获取 SqlSession
     *
     * @return SqlSession
     */
    public static SqlSession getSqlSession() throws IOException {

        /*
        以流的方式 读取 mybatis-config.xml 核心配置文件
         */
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        /*
        创建一个 SqlSessionFactoryBuilder
         */
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        /*
        以 mybatis-config.xml 配置的字节流的方式获取 sqlSessionFactory 对象
         */
        SqlSessionFactory sqlSessionFactory = builder.build(stream);

        /*
        创建 sqlSession 对象，并开启自动提交，回滚事务
         */
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        return Objects.requireNonNull(sqlSession);

    }
}
