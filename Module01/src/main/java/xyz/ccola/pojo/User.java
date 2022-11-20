package xyz.ccola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Name: User
 * @ Author: Cola
 * @ Time: 2022/11/19 8:55
 * @ Description: User 类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private Integer vipId;

    /**
     * 多对一映射为 POJO 实体类
     */
    private Vip vip;
}
