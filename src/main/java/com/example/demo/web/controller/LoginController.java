package com.example.demo.web.controller;

import com.example.demo.manager.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Q_先森 on 2017/12/7.
 */
@Controller
public class LoginController {

    @GetMapping("/index")
    public String index(HttpServletRequest request, Model model) throws IOException {

        return "login";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model) throws IOException {
        String url = "login";

        String username = request.getParameter("username");
        String passeord = request.getParameter("passeord");

        String backpassword = UserManager.getIncetance().findUserByName(username);
        if(backpassword != null && backpassword.equals(passeord)){
            request.getSession().setAttribute("","");
            url = "success";
        }

        return url;
    }
}
