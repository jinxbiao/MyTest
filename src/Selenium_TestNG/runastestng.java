package Selenium_TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

/**
 * @author : zmh
 * @version :1.0
 * @date :2016年3月6日 下午12:28:31
 */

public class runastestng {
    
    WebDriver mydr;// 申明全局变量。。。。。
    
  @Test
  public void testng001() throws InterruptedException {
    //-----------------------------打开IE浏览器--------------------------------------------------
      File file_ie = new File("C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
      System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
        
      //为 Internet Explorer 设置安全性功能,否则会遇到一个安全问题提示："Protected Mode must be set to the same value (enabled or disabled) for all zones"
      DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
      caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
      caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      WebDriver my_dr = new InternetExplorerDriver(caps);// 打开ie浏览器
      //打开百度
      my_dr.get("www.baidu.com");

      Thread.sleep(2000);
      //定位到百度的输入框
      my_dr.findElement(By.id("kw")).sendKeys("G7物流地图");
      Thread.sleep(1000);
      //点击搜索
      my_dr.findElement(By.id("su")).click();
        
      Thread.sleep(1000);
      //打印页面标题
      System.out.println(my_dr.getTitle());
      //验证页面标题是否符合预期
      Assert.assertEquals(my_dr.getTitle(), "G7物流地图_百度搜索");
      Thread.sleep(5000);
            
  }
  @BeforeMethod
  public void beforeMethod() {
      //switchTo相关可以写在这里
  }

  @AfterMethod
  public void afterMethod() {
    // 切换到主窗口、模擬刷新頁面
  }

  @BeforeClass
  public void beforeClass() {
    //登陆相关可以写在这里
  }

  @AfterClass
  public void afterClass() {
     //浏览器关闭可以写在这里
  }

}