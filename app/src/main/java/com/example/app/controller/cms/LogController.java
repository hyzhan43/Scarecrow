package com.example.app.controller.cms;

import com.example.core.annotation.GroupRequired;
import com.example.core.annotation.RouteMeta;
import com.example.core.bean.BaseResponse;
import com.example.core.bean.Response;
import com.example.core.bean.args.LogArgs;
import com.example.core.bean.args.PageArgs;
import com.example.core.bean.args.UserLogArgs;
import com.example.core.bean.card.LogCard;
import com.example.core.bean.card.PageCard;
import com.example.core.bean.db.Log;
import com.example.core.controller.BaseController;
import com.example.core.resource.LogResource;
import com.example.core.utils.L;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * author：  HyZhan
 * create：  2019/4/24
 * desc：    TODO
 */
@RestController
@RequestMapping("/cms/log")
public class LogController extends BaseController {

    private LogResource logResource;

    @Autowired
    public LogController(LogResource logResource) {
        this.logResource = logResource;
    }

    @GroupRequired
    @GetMapping("")
    @RouteMeta(auth = "查询所有日志", module = "日志", mount = false)
    public BaseResponse getLogs(LogArgs args) {

        checkPaginate(args);

        PageCard<LogCard> logPageCard = logResource.getLogs(args);

        return Response.success(logPageCard);
    }

    @GroupRequired
    @GetMapping("/search")
    @RouteMeta(auth = "搜索日志", module = "日志", mount = false)
    public BaseResponse getUserLogs(@Valid UserLogArgs args) {

        checkPaginate(args);

        PageCard<LogCard> logPageCard = logResource.getUserLogs(args);

        return Response.success(logPageCard);
    }

    @GroupRequired
    @GetMapping("/users")
    @RouteMeta(auth = "查询日志记录的用户", module = "日志")
    public BaseResponse getUsers(PageArgs args) {

        checkPaginate(args);

        PageCard<String> logPageCar = logResource.getUsers(args);

        return Response.success(logPageCar);
    }
}
