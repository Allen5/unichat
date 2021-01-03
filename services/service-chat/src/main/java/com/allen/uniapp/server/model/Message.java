package com.allen.uniapp.server.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Table(name = "`message`")
public class Message {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 情侣id
     */
    @Column(name = "`lover_id`")
    private Long loverId;

    /**
     * 发送者用户id
     */
    @Column(name = "`from_user_id`")
    private Long fromUserId;

    /**
     * 接收者用户id
     */
    @Column(name = "`to_user_id`")
    private Long toUserId;

    /**
     * 消息类型 0文本消息 1语音消息 2图片消息 3表情消息 99自定义卡片消息
     */
    @Column(name = "`type`")
    private Byte type;

    /**
     * 消息内容
     */
    @Column(name = "`content`")
    private String content;

    /**
     * 消息入库时间
     */
    @Column(name = "`created`")
    private Date created;

    /**
     * 消息更新时间. 包含消息已读，消息撤回
     */
    @Column(name = "`updated`")
    private Date updated;

    /**
     * 消息状态 0正常 1撤回
     */
    @Column(name = "`status`")
    private Boolean status;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String LOVER_ID = "loverId";

    public static final String DB_LOVER_ID = "lover_id";

    public static final String FROM_USER_ID = "fromUserId";

    public static final String DB_FROM_USER_ID = "from_user_id";

    public static final String TO_USER_ID = "toUserId";

    public static final String DB_TO_USER_ID = "to_user_id";

    public static final String TYPE = "type";

    public static final String DB_TYPE = "type";

    public static final String CONTENT = "content";

    public static final String DB_CONTENT = "content";

    public static final String CREATED = "created";

    public static final String DB_CREATED = "created";

    public static final String UPDATED = "updated";

    public static final String DB_UPDATED = "updated";

    public static final String STATUS = "status";

    public static final String DB_STATUS = "status";
}