package com.allen.uniapp.server.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Table(name = "`lover`")
public class Lover {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 自身的用户id
     */
    @Column(name = "`self_user_id`")
    private Long selfUserId;

    /**
     * 情侣的用户id
     */
    @Column(name = "`lover_user_id`")
    private Long loverUserId;

    /**
     * 状态 0恋爱 1分手
     */
    @Column(name = "`status`")
    private Boolean status;

    /**
     * 创建时间
     */
    @Column(name = "`created`")
    private Date created;

    /**
     * 更新时间
     */
    @Column(name = "`updated`")
    private Date updated;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String SELF_USER_ID = "selfUserId";

    public static final String DB_SELF_USER_ID = "self_user_id";

    public static final String LOVER_USER_ID = "loverUserId";

    public static final String DB_LOVER_USER_ID = "lover_user_id";

    public static final String STATUS = "status";

    public static final String DB_STATUS = "status";

    public static final String CREATED = "created";

    public static final String DB_CREATED = "created";

    public static final String UPDATED = "updated";

    public static final String DB_UPDATED = "updated";
}