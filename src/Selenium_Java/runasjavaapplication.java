package Selenium_Java;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;


/**
 * @author : zmh
 * @version :1.0
 * @date :2016��03��06�� ����3:00:22
 */
public class runasjavaapplication {

    public static void main(String[] args) throws InterruptedException {
        
        //-----------------------------�򿪻�������------------------------------------------------
        WebDriver my_dr = new FirefoxDriver();// �򿪻�������  ԭ��֧�ֵ�����������ǲ�֧�ֻ���߼��İ汾
        
        //-----------------------------��Chrome�����---------------------------------------------
        File file_chrome = new File("C:/Program Files/Google/Chrome/Application/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", file_chrome.getAbsolutePath());
        //WebDriver my_dr = new ChromeDriver();// ��chrome�����

        //-----------------------------��IE�����--------------------------------------------------
        File file_ie = new File("C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
        
        //Ϊ Internet Explorer ���ð�ȫ�Թ���,���������һ����ȫ������ʾ��"Protected Mode must be set to the same value (enabled or disabled) for all zones"
        //DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        //caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
        //caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        //WebDriver my_dr = new InternetExplorerDriver(caps);// ��ie�����
        
     //   WebDriver my_dr = new InternetExplorerDriver();// ��ie�����

        //---------------------------------------------------------------------------------------
        //�򿪰ٶ�
        my_dr.get("www.baidu.com");

        Thread.sleep(1000);
        //��λ���ٶȵ������
        my_dr.findElement(By.id("kw")).sendKeys("G7������ͼ");
        
        Thread.sleep(1000);
        //�������
        my_dr.findElement(By.id("su")).click();
        
        Thread.sleep(1000);
        //��ӡҳ�����
        System.out.println(my_dr.getTitle());
        //��֤ҳ������Ƿ����Ԥ��
       // Assert.assertEquals(my_dr.getTitle(), "G7������ͼ_�ٶ�����");
        
        Thread.sleep(1000);
        // �ر�����webdriver���̣��˳�
        my_dr.quit();
    }
}