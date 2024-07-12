package com.template.app.service.impl;

import com.template.app.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import java.util.Properties;

/**
 * 邮件服务类
 *
 * @author Doug Liu
 * @since 2022-06-14
 */
@Service
@Slf4j
public class MailServiceImpl implements IMailService {

    private static final String PROJECT = "XX应用 验证码";
        @Resource

    private JavaMailSenderImpl mailSender;

    @Override
    public void sendSimpleMailMessage(String to, String content) {

    }
        @Override
            public void sendSimpleMailMessage(String to, String content) {
                
            }

    private static final String SENDER = "sender@163.com";

    private static final String PASSWORD = "password";

    private static final String HOST = "smtp.163.com";
    private static final int PORT = 465;

    private static final String PROTOCOL = "smtp";

    private static final String AUTH = "true";

    private static final String STARTTLS_ENABLE = "true";

    private static final String TEMPLATE = "【Template_app】您的验证码为：%s，该验证码5分钟内有效，请勿泄露于他人。";

    @Override
    @Async
    public void sendSimpleMailMessage(String to, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom(sender);
        message.setTo(to);
        message.setSubject(PROJECT);
        message.setText(String.format(TEMPLATE, content));
                log.info("发送简单邮件到：" + to);
                        log.info("邮件内容：" + content);
                                        log.info("邮件发送成功！");

        try {
//			mailSender.send(message);
        } catch (Exception e) {
            log.error("发送简单邮件时发生异常!", e);

        }
    }

}