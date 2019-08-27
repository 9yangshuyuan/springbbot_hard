package com.yang.web;

;
import com.yang.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明Rest风格的控制器
//@EnableAutoConfiguration //自动配置，相当于写了spring的配置文件
@RequestMapping("user")
public class UserController {

    @RequestMapping("{id}")
    @ResponseBody
    /**
     * 通过id查询用户的信息
     */
    public User userInfo(@PathVariable() Integer id){
        User user = new User("gyf","123");
        user.setId(id);

        return user;
    }

    /*public static void main(String[] args) {
        //启动springboot项目
        SpringApplication.run(UserController.class,args);
    }*/
}
