package com.allen.uniapp.server.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Table(name = "`user`")
public class User {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户手机号
     */
    @Column(name = "`mobile`")
    private String mobile;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 性别 0未知 1男 2女
     */
    @Column(name = "`gender`")
    private Boolean gender;

    /**
     * 头像
     */
    @Column(name = "`avatar`")
    private String avatar;

    /**
     * 昵称
     */
    @Column(name = "`nick`")
    private String nick;

    /**
     * 生日
     */
    @Column(name = "`birthday`")
    private Date birthday;

    /**
     * 是否单身
     */
    @Column(name = "`is_single`")
    private Boolean isSingle;

    /**
     * 自我介绍
     */
    @Column(name = "`introduce`")
    private String introduce;

    /**
     * 注册时间
     */
    @Column(name = "`created`")
    private Date created;

    /**
     * 更新时间
     */
    @Column(name = "`updated`")
    private Date updated;

    /**
     * 账号状态 0正常 1封禁
     */
    @Column(name = "`status`")
    private Boolean status;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String MOBILE = "mobile";

    public static final String DB_MOBILE = "mobile";

    public static final String PASSWORD = "password";

    public static final String DB_PASSWORD = "password";

    public static final String GENDER = "gender";

    public static final String DB_GENDER = "gender";

    public static final String AVATAR = "avatar";

    public static final String DB_AVATAR = "avatar";

    public static final String NICK = "nick";

    public static final String DB_NICK = "nick";

    public static final String BIRTHDAY = "birthday";

    public static final String DB_BIRTHDAY = "birthday";

    public static final String IS_SINGLE = "isSingle";

    public static final String DB_IS_SINGLE = "is_single";

    public static final String INTRODUCE = "introduce";

    public static final String DB_INTRODUCE = "introduce";

    public static final String CREATED = "created";

    public static final String DB_CREATED = "created";

    public static final String UPDATED = "updated";

    public static final String DB_UPDATED = "updated";

    public static final String STATUS = "status";

    public static final String DB_STATUS = "status";
}