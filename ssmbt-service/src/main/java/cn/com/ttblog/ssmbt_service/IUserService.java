package cn.com.ttblog.ssmbt_service;

import java.util.List;
import java.util.Map;

import cn.com.ttblog.ssmbt_bean.User;


public interface IUserService {
	public User getUserById(long userId);
	public void addUser(User user);
	public List<User> getUserList(String order, int limit, int offset);
	//带有查询条件
	public List<User> getUserList(String search, String order, int limit,int offset);
	public long getUserListCount();
	public int getNewData();
	public List<Map<String, Object>> getDataSum();
	public void addUM();
	public void addUMtest() throws IllegalArgumentException;
	public void deleteById(Long id);
}