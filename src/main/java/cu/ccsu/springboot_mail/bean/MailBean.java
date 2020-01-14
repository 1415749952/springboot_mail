package cu.ccsu.springboot_mail.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lance(ZYH)
 * @function  发送邮件-封装接受者信息
 * @date 2018-07-07 13:11
 */
@Data
public class MailBean implements Serializable {
    /**
     * 邮件接收人
     */
    private String recipient;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;

}
