package com.example.hyzhan.controller.cms;

import com.example.hyzhan.annotation.RouteMeta;
import com.example.hyzhan.bean.BaseResponse;
import com.example.hyzhan.bean.Response;
import com.example.hyzhan.bean.model.RouteMetaModel;
import com.example.hyzhan.utils.RouteUtil;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author：  HyZhan
 * create：  2019/4/6
 * desc：    TODO
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    /**
     * @api {get} /admin/authority 获取所有可分配权限
     * @apiGroup admin
     * @apiVersion 1.0.0
     * @apiSuccessExample {json} 返回样例：
     * {"code":0,"msg":"获取成功","data":[{"auth":"查询所有用户","module":"管理员","mount":false},{"auth":"删除用户","module":"管理员","mount":false},{"auth":"修改用户密码","module":"管理员","mount":false}]}
     */
    @GetMapping("/authority")
    public BaseResponse authority() {
        List<RouteMetaModel> routes = RouteUtil.getRoutes();
        return Response.success(routes);
    }

    @GetMapping("/users")
    @RouteMeta(auth = "查询所有用户", module = "管理员", mount = false)
    public void getAdminUsers() {

    }

    @PutMapping("/password/{id}")
    @RouteMeta(auth = "修改用户密码", module = "管理员", mount = false)
    public void ChangePassword(@PathVariable Integer id) {
    }

    @DeleteMapping("/{id}")
    @RouteMeta(auth = "删除用户", module = "管理员", mount = false)
    public void deleteUser(@PathVariable Integer id) {

    }
}
