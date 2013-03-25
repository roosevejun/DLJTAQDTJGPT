package com.tongtu.controller.main;

import com.tongtu.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-18上午11:10
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
@Controller
public class MainController extends BaseController {
    @RequestMapping(method = RequestMethod.GET, value = "welcome.do")
    public ModelAndView mainIndex() {
        ModelAndView mav = new ModelAndView();
        businessLogger.info("欢迎页面");
        mav.setViewName("main/main");
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "top.do")
    public ModelAndView top() {
        ModelAndView mav = new ModelAndView();
        businessLogger.info("头页面");
        mav.setViewName("main/top");
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "left.do")
    public ModelAndView left() {
        ModelAndView mav = new ModelAndView();
        businessLogger.info("头页面");
        mav.setViewName("main/left");
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "copyright.do")
    public ModelAndView copyright() {
        ModelAndView mav = new ModelAndView();
        businessLogger.info("底页面");
        mav.setViewName("main/copyright");
        return mav;
    }
}
