package com.tongtu;

import com.tongtu.beans.ItemLwgsgc;
import com.tongtu.repository.LWGSGCRepository;

import com.tongtu.base.BaseTest;
import org.apache.log4j.LogManager;
import org.junit.Before;
import org.junit.Test;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 12-12-18上午9:39
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public class DaoTest extends BaseTest {
    @Override
    protected Class setBaseClass() {
        return this.getClass();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Before
    public void setUp() throws Exception {
        loadConfig();
    }

    /**
     * testLog4j
     */
    @Test
    public void testLog4j() {
        LogManager.getLogger("normalError").error("测试Log4j!!!");
        System.out.println("测试Log4j");
        logger.info("=============结束测试============");
        LWGSGCRepository lwgsgcRepository = ctx.getBean(LWGSGCRepository.class);
       for(ItemLwgsgc lwgsgc: lwgsgcRepository.findAll()){
           LogManager.getLogger("normalError").error(lwgsgc.getCROWID());
       }
    }
}
