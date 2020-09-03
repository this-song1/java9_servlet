package com.neusoft.zonghe.dao.impl;

import com.neusoft.zonghe.dao.UserDao;
import com.neusoft.zonghe.domain.User;
import com.neusoft.zonghe.util.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class UserDaoImpl implements UserDao
{
    private  Connection conn =null;
    private PreparedStatement pstmt =null;
    private ResultSet rs =null;
    private User user =null;

    @Override
    public User login(User loginUser) throws SQLException
    {
        String sql = "select * from userlogin where username = ? and password = ?";

        try{
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,loginUser.getUsename() );
            pstmt.setString(2, loginUser.getPassword());
            rs = pstmt.executeQuery();
            while (rs.next()){
                user = new User();
                user.setUsename(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pstmt, conn);
        }



        return user;
    }
}
