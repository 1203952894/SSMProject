package xyz.ccola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ Name: Vip
 * @ Author: Cola
 * @ Time: 2022/11/19 16:53
 * @ Description: Vip 类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vip {
    private Integer vipId;
    private String vipName;


    /**
     * 一对多映射为 List 集合
     */
    private List<User> users;
}
