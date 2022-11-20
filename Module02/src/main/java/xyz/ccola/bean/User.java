package xyz.ccola.bean;

/**
 * @ Name: User
 * @ Author: Cola
 * @ Time: 2022/11/19 20:50
 * @ Description: User 类
 */

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;

    public User() {
        System.out.println("生命周期 1：调用无参构造器");
    }

    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("生命周期 2：为属性赋值（依赖注入）");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 初始化方法
     */
    public void initMethod() {
        System.out.println("生命周期 4：初始化方法");
    }

    /**
     * 销毁方法
     */
    public void destroyMethod() {
        System.out.println("生命周期 7：销毁方法");
    }
}
