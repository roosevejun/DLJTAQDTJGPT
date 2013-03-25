package com.tongtu.base.controller;

import com.tongtu.base.bean.WebResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-15上午11:16
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */
public class BaseController {

    protected WebResult result;
    protected Logger businessLogger;
    protected BaseController() {
        businessLogger= LogManager.getLogger("business");
        result = new WebResult();
    }

    public void generateSuccessResult(String message, Object data) {
        this.result.setCode("0001");
        this.result.setResultInfo(message, data);
    }

    public void generateSuccessResult(String message) {
        this.result.setCode("0001");
        this.result.setResultInfo(message);
    }

    public void generateFailResult(String message, Object data) {
        this.result.setCode("0000");
        this.result.setResultInfo(message, data);
    }

    public void generateFailResult(String message) {
        this.result.setCode("0000");
        this.result.setResultInfo(message);
    }

    public void generateExceptionResult(Exception ex) {
        this.result.setCode("11111");
        this.result.setResultInfo("发生异常请况!!!!");
        this.result.setData(ex.getMessage());
    }
}
