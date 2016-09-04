package cn.com.ttblog.ssmbt_bean;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement
public class UserListModel {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}