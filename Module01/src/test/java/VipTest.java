import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.ccola.mapper.VipMapper;
import xyz.ccola.pojo.Vip;
import xyz.ccola.utils.SQLUtil;

import java.io.IOException;
import java.util.List;

/**
 * @ Name: VipTest
 * @ Author: Cola
 * @ Time: 2022/11/19 17:08
 * @ Description: VipTest 测试类
 */
@Slf4j
public class VipTest {

    /**
     * 测试 查询全部 Vip 信息
     */
    @Test
    public void selectAllVipsTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        VipMapper mapper = sqlSession.getMapper(VipMapper.class);
        List<Vip> vips = mapper.selectAllVips();
        for (Vip vip : vips) {
            System.out.println(vip.toString());
        }
        log.info("方法: selectAllVipsTest() 测试通过,查询到 " + vips.size() + " 条数据");
    }

    /**
     * 测试 根据 vipId 查询信息
     */
    @Test
    public void selectVipByvipIdTest() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        VipMapper mapper = sqlSession.getMapper(VipMapper.class);
        List<Vip> vips = mapper.selectVipByvipId(2);
        for (Vip vip : vips) {
            System.out.println(vip.toString());
        }
        log.info("方法: selectVipByvipIdTest() 测试通过,查询到 " + vips.size() + " 条数据");
    }

    /**
     * 测试 通过自定义 Map 查询全部  Vip 信息 方式 3 分步查询 第一步
     */
    @Test
    public void findAllVipByResultMapWay03Step01Test() throws IOException {
        SqlSession sqlSession = SQLUtil.getSqlSession();
        VipMapper mapper = sqlSession.getMapper(VipMapper.class);
        List<Vip> vips = mapper.findAllVipByResultMapWay03Step01();
        for (Vip vip : vips) {
            System.out.println(vip.toString());
        }
        log.info("方法: selectVipByvipIdTest() 测试通过,查询到 " + vips.size() + " 条数据");
    }
}
