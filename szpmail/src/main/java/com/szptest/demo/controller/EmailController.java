package com.szptest.demo.controller;

import com.szptest.demo.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/email")
    @ResponseBody
    public String sendEmail() {

        // 发送邮件
        emailService.sendSimpleMail("1412420939@qq.com", "1412420939@qq.com", "主题：简单邮件", "测试邮件内容");

        return "success";
    }
}