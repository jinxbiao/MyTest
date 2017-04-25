package Selenium_Java;

import com.thoughtworks.selenium.DefaultSelenium;

/**
 * @author : zmh
 * @version :1.0
 * @date :2016年3月6日 下午12:28:31
 */
public class runasjavaapplication_selenium1 {
    public static void main(String[] args) {
        //创建一个selenium对象，调用DefaultSelenium的构造器，传入参数，参数分别是：host：机器的ip地址、port：端口号、浏览器类型，url：要测试网站的链接
        DefaultSelenium selenium = new DefaultSelenium("localhost", 4444,
                "*iexplore C:\\Program Files\\Internet Explorer\\iexplore.exe",
                "http://www.baidu.com/");

        selenium.start();
        selenium.open("http://www.baidu.com");
        selenium.type("id=kw1", "G7物流地图");
        selenium.click("id=su1");
        System.out.println("Page title is: " + selenium.getTitle());
        selenium.stop();
    }
}