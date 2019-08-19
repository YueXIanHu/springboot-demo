package com.huzh.springbootmail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @ClassName MailController
 * @Description TODO
 * @Date 2019/8/14 9:29
 * @Author huzh
 * @Version 1.0
 */
@RestController
public class MailController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${main.formMail.sender}")
    private String sender;
    @Value("${main.formMail.receiver}")
    private String receiver;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private TemplateEngine templateEngine;

    /**
     * @return java.lang.String
     * @Description 发送文本邮件
     * @date 2019/8/14 9:44
     * @author huzh
     **/
    @RequestMapping("/sendMail")
    public String sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sender);
        message.setTo(receiver);
        //邮件主题
        message.setSubject("文本邮件测试");
        //邮件内容
        message.setText("hello mail");

        try {
            javaMailSender.send(message);
            logger.info("简单邮件已经发送。");
        } catch (MailException e) {
            logger.error("发送简单邮件时发生异常！", e);
        }
        return "success";
    }

    /**
     * @return java.lang.String
     * @Description 发送html邮件
     * @date 2019/8/14 11:52
     * @author huzh
     **/
    @RequestMapping("/sendHtmlMail")
    public String sendHtmlMail() {
        String content = "<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("html邮件测试");
            helper.setText(content, true);

            javaMailSender.send(message);
            logger.info("html邮件发送成功");
        } catch (MessagingException e) {
            logger.error("发送html邮件时发生异常！", e);
        }
        return "success";
    }

    /**
     * @return java.lang.String
     * @Description 发送html模板邮件
     * @date 2019/8/14 14:51
     * @author huzh
     **/
    @RequestMapping("/sendHtmlTemplateMail")
    public String sendHtmlTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "ab0f14820b8d");
        String content = templateEngine.process("emailTemplate", context);

        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("html模板邮件测试");
            helper.setText(content, true);

            javaMailSender.send(message);
            logger.info("html邮件发送成功");
        } catch (MessagingException e) {
            logger.error("发送html邮件时发生异常！", e);
        }
        return "success";
    }

    /**
     * @return java.lang.String
     * @Description 发送附件邮件
     * @date 2019/8/14 12:31
     * @author huzh
     **/
    @RequestMapping("/sendFilesMail")
    public String sendFilesMail() {
        String filePath = "C:\\Users\\Administrator\\Downloads\\11.doc";
        MimeMessage message = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("附件邮件测试");
            helper.setText("附带附件", true);

            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
            helper.addAttachment(fileName, file);

            javaMailSender.send(message);
            logger.info("带附件的邮件已经发送。");
        } catch (MessagingException e) {
            logger.error("发送带附件的邮件时发生异常！", e);
        }

        return "success";
    }

    /**
     * @return java.lang.String
     * @Description 发送图片邮件
     * @date 2019/8/14 12:33
     * @author huzh
     **/
    @RequestMapping("/sendImgMail")
    public String sendImgMail() {
        String Id = "test_mail";
        String content = "<html><body>这是有图片的邮件：<img src=\'cid:" + Id + "\'></body></html>";
        String imgPath = "C:\\Users\\Administrator\\Downloads\\222.jpg";

        MimeMessage message = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(receiver);
            helper.setSubject("图片邮件测试");
            helper.setText(content, true);

            FileSystemResource res = new FileSystemResource(new File(imgPath));
            helper.addInline(Id, res);

            javaMailSender.send(message);
            logger.info("嵌入静态资源的邮件已经发送。");
        } catch (MessagingException e) {
            logger.error("发送嵌入静态资源的邮件时发生异常！", e);
        }
        return "success";
    }
}
