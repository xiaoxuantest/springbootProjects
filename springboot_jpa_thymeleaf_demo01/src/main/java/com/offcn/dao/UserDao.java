package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 刘晓轩
 * @description 用户持久层
 * @date 2020/8/3 14:19
 */
public interface UserDao extends JpaRepository<User,Long> {
}
