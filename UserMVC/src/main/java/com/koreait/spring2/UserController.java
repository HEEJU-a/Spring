package com.koreait.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public String join(UserVO param) {
        service.join(param);
        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value="err",defaultValue = "0") int err, Model model){

        switch (err){
            case 1:
                model.addAttribute("errMsg","아이디를 확인해주세요.");
                break;
            case 2:
                model.addAttribute("errMsg", "비밀번호를 확인해주세요.");
                break;
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(UserVO param){
        return "redirect:" + service.login(param);
    }
}
