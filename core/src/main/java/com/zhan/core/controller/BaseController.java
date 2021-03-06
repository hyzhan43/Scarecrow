package com.zhan.core.controller;

import com.zhan.core.bean.args.PageArgs;
import com.zhan.core.error.BaseException;
import com.zhan.core.error.code.ErrorCode;

/**
 * author：  HyZhan
 * create：  2019/4/14
 * desc：    TODO
 */
public class BaseController {

    /**
     * 校验页码
     */
    protected void checkPaginate(PageArgs args) {
        Integer page = args.getPage();
        Integer pageSize = args.getPageSize();

        if (page < 0 || pageSize <= 0) {
            throw new BaseException(ErrorCode.PARAMETER);
        }
    }

    protected void checkParamIsNullOrEmpty(Object param, ErrorCode errorCode) {
        if (param == null || "".equals(param.toString().trim())) {
            throw new BaseException(errorCode);
        }
    }

    protected boolean checkParamIsNullOrEmpty(Object param) {
        return param == null || "".equals(param.toString().trim());
    }
}
