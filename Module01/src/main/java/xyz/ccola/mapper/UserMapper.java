package xyz.ccola.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import xyz.ccola.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ Name: UserMapper
 * @ Author: Cola
 * @ Time: 2022/11/19 17:18
 * @ Description: UserMapper 接口
 */
public interface UserMapper {

    /**
     * 查询全部用户信息
     *
     * @return 用户列表
     */
    List<User> selectAllUsers();

    /**
     * 新增用户
     *
     * @param user 用户
     * @return 受影响的行数
     */
    Integer insertUser(User user);

    /**
     * 删除用户
     *
     * @param id 用户 id
     * @return 受影响的行数
     */
    Integer deleteUser(@Param("id") Integer id);

    /**
     * 修改用户
     *
     * @param id 用户 id
     * @return 受影响的行数
     */
    Integer modifyUser(@Param("id") Integer id, @Param("user") User user);

    /**
     * 查询单个用户信息
     *
     * @param id 用户 id
     * @return 用户
     */
    List<User> showOneUserInfo(@Param("id") Integer id);

    /**
     * 查询全部用户的信息
     *
     * @return 用户列表
     */
    List<User> showAllUsersInfo();

    /**
     * 通过 Id 和 Age 查询用户信息
     *
     * @param id  用户 Id
     * @param age 用户 Age
     * @return 用户
     */
    List<User> selectUserByIdAndAge(Integer id, Integer age);

    /**
     * 通过 Id 和 UserName 查询用户信息
     *
     * @param map 参数列表
     * @return 用户
     */
    List<User> selectUserByIdAndUserName(Map<String, String> map);


    /**
     * 查询用户的总记录数
     *
     * @return 总记录数
     */
    Integer getCount();


    /**
     * 根据 Id 查询用户并存入 Map 集合中
     *
     * @param id 用户 Id
     * @return Map
     */
    @MapKey("username")
    Map<String, Object> selectUserToMapById(@Param("id") Integer id);


    /**
     * 查询用户并存入 Map 集合中
     *
     * @return Map
     */
    @MapKey("username")
    Map<String, Object> selectUserToMap();


    /**
     * 根据 username 模糊查询
     *
     * @param like 模糊查询条件
     * @return 用户
     */
    List<User> fuzzyFind(@Param("like") String like);

    /**
     * 批量删除
     *
     * @param ids Id
     * @return 受影响的行数
     */
    Integer bulkDeletion(@Param("ids") String ids);

    /**
     * 从指定表中获取信息
     *
     * @param tableName 表名
     * @return POJO
     */
    List<User> showAllFromDesignateTable(@Param("tableName") String tableName);

    /**
     * 通过自定义 Map 查询全部用户信息 方式 1 级联方式
     *
     * @return 用户列表
     */
    List<User> findAllUserByResultMapWay01();

    /**
     * 通过自定义 Map 查询全部用户信息 方式 2 使用 association 标签
     *
     * @return 用户列表
     */
    List<User> findAllUserByResultMapWay02();

    /**
     * 通过自定义 Map 查询全部用户信息 方式 3 分步查询 第一步
     *
     * @return 用户列表
     */
    List<User> findAllUserByResultMapWay03Step01();

    /**
     * 根据 vipId 查询用户信息
     * 通过自定义 Map 查询全部Vip信息 方式 3 分步查询 第二步
     *
     * @param vipId Id
     * @return 用户列表
     */
    List<User> selectUserByvipId(@Param("vipId") Integer vipId);

    /**
     * 分页查找全部用户信息
     *
     * @return 用户列表
     */
    List<User> selectAllUsersByPage();

}
