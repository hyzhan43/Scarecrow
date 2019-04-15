package com.example.hyzhan.bean.db.cms;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * author：  HyZhan
 * create：  2019/4/10
 * desc：    log 表
 */
@Entity
@Data
@Table(name = "lin_log")
public class Log {

    @Id
    private Integer id;

    /**
     * 日志信息
     */
    @Column
    private String message;

    @Column(nullable = false)
    private Integer userId;

    @Column(length = 20)
    private String username;

    /**
     * 请求的 http返回码
     */
    @Column
    private Integer statusCode;

    /**
     * 请求方法
     */
    @Column(length = 20)
    private String method;

    /**
     *  请求路径
     */
    @Column(length = 50)
    private String path;

    /**
     *  访问那个权限
     */
    @Column(length = 100)
    private String authority;

    /**
     *  日志创建时间
     */
    @Column
    @CreatedDate
    private Date createTime;
}