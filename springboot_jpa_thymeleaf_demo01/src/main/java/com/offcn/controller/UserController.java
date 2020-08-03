package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 刘晓轩
 * @description 用户控制层
 * @date 2020/8/3 14:26
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @param model
     * @return
     */
    @GetMapping("/")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("page",userList);
        return "user/list";
    }

    /**
     * 前往添加用户界面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }


    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/add")
    public String add(User user){
        userService.add(user);
        return "redirect:/";
    }

    /**
     * 前往修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toEdit/{id}")
    public String toEdit(@PathVariable("id") Long id,Model model){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    /**
     *  修改单个用户
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/";
    }

    /**
     *  删除单个用户
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id")Long id){
        userService.delete(id);
        return "redirect:/";
    }
}
