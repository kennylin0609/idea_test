package com.bjsxt.mapper;


import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/12/12
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();


}
