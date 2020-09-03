package com.neusoft.zonghe.text;


import com.neusoft.zonghe.dao.impl.UserDaoImpl;
import com.neusoft.zonghe.domain.User;

import java.sql.SQLException;

public class UserDaoTest
{

    public void test() throws SQLException{
        User loginUser = new User();
        loginUser.setUsename("bigbaby");
        loginUser.setPassword("12345");


        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.login(loginUser);
        System.out.println(user);
    }

}
