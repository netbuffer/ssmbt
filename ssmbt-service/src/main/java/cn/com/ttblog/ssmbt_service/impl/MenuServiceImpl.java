package cn.com.ttblog.ssmbt_service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.ttblog.ssmbt_bean.Menu;
import cn.com.ttblog.ssmbt_dao.IMenuDao;
import cn.com.ttblog.ssmbt_service.IMenuService;


@Service("menuService")
public class MenuServiceImpl implements IMenuService {
	@Resource
	private IMenuDao menuDao;
	@Override
	public void addMenu(Menu m) {
		menuDao.insert(m);
	}

}