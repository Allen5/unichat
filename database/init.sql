
/**
 * @description: 初始化unichat 数据库结构
 * @author: 三爷
 * @date: 2021.01.03
 */

-- 创建数据库
create database unichat;

-- 创建该数据库的用户
create user 'unichat-dev'@'%' identified by '7OhprOklJIV4Z0Ln';
-- 创建用户权限
grant all privileges on unichat.* to 'unichat-dev'@'%';
flush privileges;

-- 创建表结构

-- 创建用户表
drop table if exists `user`;
create table `user` (
    id bigint(20) primary key auto_increment,
    mobile varchar(11) not null comment '用户手机号',
    password varchar(32) not null comment '密码',
    gender tinyint(1) not null default 0 comment '性别 0未知 1男 2女',
    avatar varchar(255) not null default '' comment '头像',
    nick varchar(16) not null default '' comment '昵称',
    birthday datetime not null default '' comment '生日',
    is_single boolean not null default false comment '是否单身',
    introduce varchar(255) not null default '' comment '自我介绍',
    created datetime not null default now() comment '注册时间',
    updated datetime not null comment '更新时间',
    `status` tinyint(1) not null default 0 comment '账号状态 0正常 1封禁'
);
-- 添加唯一索引
alter table `user` add unique index unique_mobile (`mobile`);
-- 添加状态索引
alter table `user` add index idx_status (`status`);
-- 添加性别索引
alter table `user` add index idx_gender (`gender`);

-- 创建情侣表
drop table if exists `lover`;
create table `lover` (
    id bigint(20) primary key auto_increment,
    self_user_id bigint(20) not null comment '自身的用户id',
    lover_user_id bigint(20) not null comment '情侣的用户id',
    `status` tinyint(1) not null comment '状态 0恋爱 1分手',
    created datetime not null default now() comment '创建时间',
    updated datetime not null comment '更新时间'
);
-- 添加索引
alter table `lover` add index idx_self_lover (`self_user_id`, `lover_user_id`);
alter table `lover` add index idx_status (`status`);

-- 创建消息表
drop table if exists `message`;
create table `message` (
    id bigint(20) primary key auto_increment,
    lover_id bigint(20) not null comment '情侣id',
    from_user_id bigint(20) not null comment '发送者用户id',
    to_user_id bigint(20) not null comment '接收者用户id',
    `type` tinyint(4) not null default 0 comment '消息类型 0文本消息 1语音消息 2图片消息 3表情消息 99自定义卡片消息',
    content varchar(256) not null default '' comment '消息内容',
    created datetime not null default now() comment '消息入库时间',
    updated datetime not null comment '消息更新时间. 包含消息已读，消息撤回',
    `status` tinyint(1) not null default 0 comment '消息状态 0正常 1撤回'
);
-- 添加索引
alter table `message` add index idx_lover_id (`lover_id`);
alter table `message` add index idx_from_user (`from_user_id`);
alter table `message` add index idx_to_user (`to_user_id`);
alter table `message` add index idx_type (`type`);