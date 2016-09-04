package cn.com.ttblog.ssmbt_dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.com.ttblog.ssmbt_bean.User;

public interface IUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	long getUserListCount();

	int getNewData();

	List<Map<String, Object>> getDataSum();
	
	List<User> getUsersByIds(List<Long> ids);
	
	List<User> selectWhen(@Param("id")Integer id);

	void deleteById(Long id);
}