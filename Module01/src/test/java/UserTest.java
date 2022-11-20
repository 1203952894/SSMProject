import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.ccola.mapper.UserMapper;
import xyz.ccola.pojo.User;
import xyz.ccola.utils.SQLUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Name: UserTest
 * @ Author: Cola
 * @ Time: 2022/11/19 9:03
 * @ Description: UserTest 测试类
 */
@Slf4j
public class UserTest {

    /**
     * 测试 查询全部用户信息
     */
    @Test
    public void selectAllUsersTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法 selectAllUsersTest 测试通过");
    }

    /**
     * 测试新增用户
     */
    @Test
    public void insertUserTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.insertUser(
                new User(8, "Admin3", 19, 1, null)
        );
        System.out.println("成功添加 " + count + " 名用户");
        log.info("方法: insertUserTest() 测试通过成功添加 " + count + " 名用户");
    }

    /**
     * 测试 删除用户
     */
    @Test
    public void deleteUserTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.deleteUser(3);
        System.out.println("成功删除 " + count + " 名用户");
        log.info("方法: deleteUserTest() 测试通过成功删除 " + count + " 名用户");

    }

    /**
     * 测试 修改用户
     */
    @Test
    public void modifyUserTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.modifyUser(6,
                new User(6, "Admin4", 23, 1, null));
        System.out.println("成功更新 " + count + " 名用户");
        log.info("方法: modifyUserTest() 测试通过成功更新 " + count + " 名用户");
    }

    /**
     * 测试 查询单个用户信息
     */
    @Test
    public void showOneUserInfoTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.showOneUserInfo(1);
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: showOneUserInfoTest() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 查询全部用户的信息
     */
    @Test
    public void showAllUsersInfoTest() throws IOException {

        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.showAllUsersInfo();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: showAllUsersInfoTest() 测试通过,查询到 " + users.size() + " 条数据");

    }

    /**
     * 测试 通过 Id 和 Age 查询用户信息
     */
    @Test
    public void selectUserByIdAndAgeTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserByIdAndAge(1, 21);
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: selectUserByIdAndAgeTest() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 通过 Id 和 UserName 查询用户信息
     */
    @Test
    public void selectUserByIdAndUserNameTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("username", "Cola");
        List<User> users = mapper.selectUserByIdAndUserName(map);
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: selectUserByIdAndUserNameTest() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 查询用户的总记录数
     */
    @Test
    public void getCountTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.getCount();
        System.out.println("共查询到 " + count + " 条记录");
        log.info("方法: getCountTest() 测试通过,查询到 " + count + " 条数据");
    }

    /**
     * 测试 根据 Id 查询用户并存入 Map 集合中
     */
    @Test
    public void selectUserToMapByIdTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectUserToMapById(1);
        System.out.println(map.toString());
        log.info("方法: selectUserToMapByIdTest() 测试通过,查询到 " + map.size() + " 条数据");

    }

    /**
     * 测试 查询用户并存入 Map 集合中
     */
    @Test
    public void selectUserToMapTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = mapper.selectUserToMap();
        System.out.println(map.toString());
        log.info("方法: selectUserToMapTest() 测试通过,查询到 " + map.size() + " 条数据");
    }

    /**
     * 测试 根据 username 模糊查询
     */
    @Test
    public void fuzzyFindTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.fuzzyFind("o");
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: fuzzyFindTest() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 批量删除
     */
    @Test
    public void bulkDeletionTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.bulkDeletion("7,8,11");
        System.out.println("成功删除 " + count + " 条记录");
        log.info("方法: bulkDeletionTest() 测试通过,成功删除 " + count + " 条数据");
    }

    /**
     * 测试 从指定表中获取信息
     */
    @Test
    public void showAllFromDesignateTableTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.showAllFromDesignateTable("table_user");
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: showAllFromDesignateTableTest() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 通过自定义 Map 查询全部用户信息 方式 1 级联方式
     */
    @Test
    public void findAllUserByResultMapWay01Test() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.findAllUserByResultMapWay01();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: findAllUserByResultMapWay01Test() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 通过自定义 Map 查询全部用户信息 方式 2 使用 association 标签
     */
    @Test
    public void findAllUserByResultMapWay02Test() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.findAllUserByResultMapWay02();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: findAllUserByResultMapWay02Test() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 通过自定义 Map 查询全部用户信息 方式 3 分步查询 第一步
     */
    @Test
    public void findAllUserByResultMapWay03Step01Test() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.findAllUserByResultMapWay03Step01();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: findAllUserByResultMapWay03Step01Test() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 根据 vipId 查询用户信息
     */
    @Test
    public void selectUserByvipIdTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUserByvipId(1);
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: findAllUserByResultMapWay03Step01Test() 测试通过,查询到 " + users.size() + " 条数据");
    }

    /**
     * 测试 分页查找全部用户信息
     */
    @Test
    public void selectAllUsersByPageTest() throws IOException {
        log.info("分页插件启动中");
        Page<User> page = PageHelper.startPage(2, 2);
        for (User user : page) {
            System.out.println(user.toString());
        }
        log.info("分页插件启动完成");
        SqlSession sqlSession = SQLUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUsersByPage();
        for (User user : users) {
            System.out.println(user.toString());
        }
        log.info("方法: showAllUsersInfoTest() 测试通过,查询到 " + users.size() + " 条数据");
    }
}
