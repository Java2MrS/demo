package com.dhcc.controller;

import com.dhcc.entity.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *  demo
 *  com.dhcc.controller
 *  @author:ShenTai
 *  @date: 2017/9/8  16:35
 */
@RestController
@RequestMapping("/users")
public class UserController {
    // 创建线程安全的Map
    static Map<Long, UserBean> users = Collections.synchronizedMap(new HashMap<Long, UserBean>());
    
    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<UserBean> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserBean> r = new ArrayList<UserBean>(users.values());
        System.out.println("r = " + r);
        return r;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute UserBean user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        System.out.println("user = " + user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public UserBean getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        System.out.println("id = " + id);
        return users.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute UserBean user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        UserBean u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        System.out.println("u = " + u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        System.out.println("id = " + id);
        return "success";
    }
}
