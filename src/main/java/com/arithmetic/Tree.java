package com.arithmetic;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Tree
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/29 22:25
 * @Version 1.0
 */
@Getter
@Setter
public class Tree<T> {


    /**
     * 节点ID
     */
    private String id;
    /**
     * 图标
     */
    private String icon;
    /**
     * url
     */
    private String url;
    /**
     * 显示节点文本
     */
    private String text;
    /**
     * 节点状态，open closed
     */
    private Map<String, Object> state;
    /**
     * 节点是否被选中 true false
     */
    private boolean checked = false;
    /**
     * 节点属性
     */
    private Map<String, Object> attributes;

    /**
     * 节点的子节点
     */
    private List<Tree<T>> children = new ArrayList<Tree<T>>();


    /**
     * 用户
     */
    private List<User> userList;
    

    /**
     * 父ID
     */
    private String parentId;


    /**
     * 父Name
     */
    private String parentName;

    /**
     * 是否有父节点
     */
    private boolean hasParent = false;
    /**
     * 是否有子节点
     */
    private boolean hasChildren = false;

    /**
     * 所属角色Ids
     */
    private String roleIds;

    /**
     * 菜单类型
     *
     * @return
     */
    private String menuType;

    private Long organShowCode;

    private String organShowName;
}
