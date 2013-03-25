package com.tongtu.controller;

import com.tongtu.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-15上午11:19
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
@Controller
public class IndexController extends BaseController {
    @RequestMapping(method = RequestMethod.GET, value = "home.do")
    public ModelAndView loginIndex() {
        ModelAndView mav = new ModelAndView();
        businessLogger.info("登陆页面");
        System.out.println("登陆页面");
        result.setCode("00001");
        result.setMessage("测试问题");
        mav.addObject(result);
        mav.setViewName("login/login");
        return mav;
    }
}
