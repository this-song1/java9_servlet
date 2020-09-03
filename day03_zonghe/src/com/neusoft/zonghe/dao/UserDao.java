package com.neusoft.zonghe.dao;

import com.neusoft.zonghe.domain.User;

import java.sql.SQLException;

public interface UserDao
{
    public User login(User loginUser) throws SQLException;
}
