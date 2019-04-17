define({ "api": [
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./src/main/resources/doc/main.js",
    "group": "E__Tools_Java_WorkSpace_Scarecrow_src_main_resources_doc_main_js",
    "groupTitle": "E__Tools_Java_WorkSpace_Scarecrow_src_main_resources_doc_main_js",
    "name": ""
  },
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./target/classes/doc/main.js",
    "group": "E__Tools_Java_WorkSpace_Scarecrow_target_classes_doc_main_js",
    "groupTitle": "E__Tools_Java_WorkSpace_Scarecrow_target_classes_doc_main_js",
    "name": ""
  },
  {
    "type": "get",
    "url": "/admin/authority",
    "title": "获取所有可分配权限",
    "group": "admin",
    "version": "1.0.0",
    "success": {
      "examples": [
        {
          "title": "返回样例：",
          "content": "{\"code\":0,\"msg\":\"获取成功\",\"data\":[{\"auth\":\"查询所有用户\",\"module\":\"管理员\",\"mount\":false},{\"auth\":\"删除用户\",\"module\":\"管理员\",\"mount\":false},{\"auth\":\"修改用户密码\",\"module\":\"管理员\",\"mount\":false}]}",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/example/hyzhan/controller/cms/AdminController.java",
    "groupTitle": "admin",
    "name": "GetAdminAuthority"
  },
  {
    "type": "get",
    "url": "/admin/users",
    "title": "获取所有用户",
    "group": "admin",
    "version": "1.0.0",
    "success": {
      "examples": [
        {
          "title": "返回样例：",
          "content": "{\"code\":0,\"msg\":\"获取成功\",\"data\":{\"curPage\":0,\"pageCount\":1,\"size\":10,\"total\":2,\"collection\":[{\"id\":1,\"nickname\":\"asd\",\"active\":1,\"email\":\"asd\",\"groupId\":1,\"groupName\":\"张三\",\"admin\":1},{\"id\":2,\"nickname\":\"ww\",\"active\":1,\"email\":\"ww\",\"groupId\":2,\"groupName\":\"aa\",\"admin\":1}]}}",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/example/hyzhan/controller/cms/AdminController.java",
    "groupTitle": "admin",
    "name": "GetAdminUsers"
  }
] });
