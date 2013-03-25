package com.tongtu.base;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
public abstract class BaseTest {
    public ApplicationContext ctx;
    public static Logger logger= LogManager.getLogger("normalInfo");

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logger.info("=============开始测试============");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logger.info("=============结束测试============");
    }

    protected String[] getConfigLocations() {
        return new String[]{
                "classpath:spring-config/spring-config.xml",
                "classpath:spring-config/spring-jpa.xml",
                "classpath:spring-config/spring-datasource.xml",
                "classpath:spring-config/spring-ehcache.xml"
        };
    }

    protected abstract Class setBaseClass();

    protected void loadConfig() {
        String[] locations = this.getConfigLocations();
        ctx = new ClassPathXmlApplicationContext(locations);
    }
}
