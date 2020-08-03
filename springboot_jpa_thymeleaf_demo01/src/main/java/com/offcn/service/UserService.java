package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

/**
 * @author 刘晓轩
 * @description 用户业务层接口
 * @date 2020/8/3 14:20
 */
public interface UserService {
    public void add(User user);

    public List<User> findAll();

    public User findOne(Long id);

    public void update(User user);

    public void delete(Long id);
}
