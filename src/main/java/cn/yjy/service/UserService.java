package cn.yjy.service;

import cn.yjy.entity.MyUser;

import java.util.List;

public interface UserService {
    public List<MyUser> selectUserByUname(MyUser user);
}
