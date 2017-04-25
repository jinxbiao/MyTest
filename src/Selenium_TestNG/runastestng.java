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
 * @date :2016��3��6�� ����12:28:31
 */

public class runastestng {
    
    WebDriver mydr;// ����ȫ�ֱ�������������
    
  @Test
  public void testng001() throws InterruptedException {
    //-----------------------------��IE�����--------------------------------------------------
      File file_ie = new File("C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
      System.setProperty("webdriver.ie.driver", file_ie.getAbsolutePath());
        
      //Ϊ Internet Explorer ���ð�ȫ�Թ���,���������һ����ȫ������ʾ��"Protected Mode must be set to the same value (enabled or disabled) for all zones"
      DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
      caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
      caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      WebDriver my_dr = new InternetExplorerDriver(caps);// ��ie�����
      //�򿪰ٶ�
      my_dr.get("www.baidu.com");

      Thread.sleep(2000);
      //��λ���ٶȵ������
      my_dr.findElement(By.id("kw")).sendKeys("G7������ͼ");
      Thread.sleep(1000);
      //�������
      my_dr.findElement(By.id("su")).click();
        
      Thread.sleep(1000);
      //��ӡҳ�����
      System.out.println(my_dr.getTitle());
      //��֤ҳ������Ƿ����Ԥ��
      Assert.assertEquals(my_dr.getTitle(), "G7������ͼ_�ٶ�����");
      Thread.sleep(5000);
            
  }
  @BeforeMethod
  public void beforeMethod() {
      //switchTo��ؿ���д������
  }

  @AfterMethod
  public void afterMethod() {
    // �л��������ڡ�ģ�Mˢ�����
  }

  @BeforeClass
  public void beforeClass() {
    //��½��ؿ���д������
  }

  @AfterClass
  public void afterClass() {
     //������رտ���д������
  }

}