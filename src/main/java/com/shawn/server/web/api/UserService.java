package com.shawn.server.web.api;

import com.shawn.server.entity.pojo.User;

public interface UserService {

	public User login(String username, String password);

	public User getUser(Integer userId);

}
