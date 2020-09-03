package com.neusoft.zonghe.test;

import com.neusoft.zonghe.dao.impl.UserDaoImpl;
import com.neusoft.zonghe.domain.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoTest
{
    @Test
    public void test() throws SQLException
    {
        User loginUser = new User();
        loginUser.setUsername("bigbaby");
        loginUser.setPassword("123456");

        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }
}
