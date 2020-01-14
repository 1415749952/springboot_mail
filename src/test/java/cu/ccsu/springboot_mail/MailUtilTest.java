package cu.ccsu.springboot_mail;

import cu.ccsu.springboot_mail.bean.MailBean;
import cu.ccsu.springboot_mail.util.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MailUtilTest
{

    @Autowired
    private MailUtil mailUtil;

    @Test
    public void sendSimpleMail() throws Exception {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("1428337140@qq.com");
        mailBean.setSubject("审批状态");
        mailBean.setContent("已经审批");

        mailUtil.sendSimpleMail(mailBean);
    }

    @Test
    public void sendHTMLMail() throws Exception {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("1428337140@qq.com");
        mailBean.setSubject("测试SpringBootMailHTML");
//        mailBean.setContent("测试SpringBootMail ");

        mailUtil.sendHTMLMail(mailBean);
    }

    @Test
    public void sendAttachmentMail() throws Exception {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("1428337140@qq.com");
        mailBean.setSubject("测试SpringBoot发送附件");
        mailBean.setContent("测试SpringBoot发送附件，正文部分");

        mailUtil.sendAttachmentMail(mailBean);

    }

    @Test
    public void sendInlineMail() throws Exception {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("1428337140@qq.com");
        mailBean.setSubject("审批状态");
        mailBean.setContent("已经审批");
        mailUtil.sendInlineMail(mailBean);
    }

    @Test
    public void sendTemplateMail() throws Exception {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient("liuweiwei@uindata.com");
        mailBean.setSubject("FreeMarker邮件");
        mailBean.setContent("村行政村支持下");
        mailUtil.sendTemplateMail(mailBean);
    }


}