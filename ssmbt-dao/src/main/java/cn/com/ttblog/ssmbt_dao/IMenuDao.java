package cn.com.ttblog.ssmbt_dao;

import cn.com.ttblog.ssmbt_bean.Menu;

public interface IMenuDao {
    Menu getMenuById(Long l);
    void insert(Menu m);
}