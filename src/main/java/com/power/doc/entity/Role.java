package com.power.doc.entity;


import java.util.List;

public class Role extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 角色名 以ROLE_开头
     */
    private String name;


    /**
     * 是否为注册默认角色
     */
    private Boolean defaultRole;

    /**
     * 拥有权限
     */
    private List<Permission> permissions;
}
