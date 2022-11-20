package xyz.ccola.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.ccola.pojo.Vip;

import java.util.List;

/**
 * @ Name: VipMapper
 * @ Author: Cola
 * @ Time: 2022/11/19 17:06
 * @ Description: VipMapper 接口
 */
public interface VipMapper {
    /**
     * 查询全部 Vip 信息
     */
    List<Vip> selectAllVips();

    /**
     * 根据 vipId 查询信息
     * 通过自定义 Map 查询全部用户信息 方式 3 分步查询 第二步
     *
     * @param vipId Id
     */
    List<Vip> selectVipByvipId(@Param("vipId") Integer vipId);

    /**
     * 通过自定义 Map 查询全部  Vip 信息 方式 3 分步查询 第一步
     *
     * @return Vip 列表
     */
    List<Vip> findAllVipByResultMapWay03Step01();

}
