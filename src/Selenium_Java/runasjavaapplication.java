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
 * @date :2016年03月06日 下午3:00:22
 */
public class runasjavaapplication {

    public static void main(String[] args) throws InterruptedException {
        
        //-----------------------------打开火狐浏览器------------------------------------------------
        WebDriver my_dr = new FirefoxDriver();// 打开火狐浏览器  原生支持的浏览器，但是不支持火狐高级的版本
        
        //-----------------------------打开Chrome浏览器---------------------------------------------
        File file_chrome = new File("C:/Program Files/Google/Chrome/Application/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", file_chrome.getAbsolutePath());
        //WebDriver my_dr = new ChromeDriver();// 打开chrome浏览器

        //-----------------------------打开IE浏览器--------------------------------------------------
        File file_ie = new File("C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
        
        //为 Internet Explorer 设置安全性功能,否则会遇到一个安全问题提示："Protected Mode must be set to the same value (enabled or disabled) for all zones"
        //DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        //caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
        //caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        //WebDriver my_dr = new InternetExplorerDriver(caps);// 打开ie浏览器
        
     //   WebDriver my_dr = new InternetExplorerDriver();// 打开ie浏览器

        //---------------------------------------------------------------------------------------
        //打开百度
        my_dr.get("www.baidu.com");

        Thread.sleep(1000);
        //定位到百度的输入框
        my_dr.findElement(By.id("kw")).sendKeys("G7物流地图");
        
        Thread.sleep(1000);
        //点击搜索
        my_dr.findElement(By.id("su")).click();
        
        Thread.sleep(1000);
        //打印页面标题
        System.out.println(my_dr.getTitle());
        //验证页面标题是否符合预期
       // Assert.assertEquals(my_dr.getTitle(), "G7物流地图_百度搜索");
        
        Thread.sleep(1000);
        // 关闭所有webdriver进程，退出
        my_dr.quit();
    }
}