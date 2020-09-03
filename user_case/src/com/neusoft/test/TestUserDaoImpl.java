package com.neusoft.test;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.impl.UserDaoImpl;
import com.neusoft.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class TestUserDaoImpl
{
    @Test
    public void userDaoImplTest(){
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void test2(){
        User user = new User();
        user.setName("dada");
        user.setGender("人妖");
        user.setAddress("泰国");
        user.setQq("23123213");
        user.setAge(323);
        user.setEmail("3242342@qq.com");
        UserDao dao = new UserDaoImpl();
        dao.add(user);
    }
    @Test
    public void test3() throws InvocationTargetException, IllegalAccessException {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "zhansgan");
        map.put("age", "12");

        User user = new User();
        BeanUtils.populate(user, map);

        System.out.println(user);


    }
    @Test
    public void test4(){
        UserDaoImpl dao = new UserDaoImpl();
        User user = dao.findUserByUserNameAndPassword("eric", "123");
        System.out.println(user);
    }

}
