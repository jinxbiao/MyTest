package Selenium_Java;

import com.thoughtworks.selenium.DefaultSelenium;

/**
 * @author : zmh
 * @version :1.0
 * @date :2016��3��6�� ����12:28:31
 */
public class runasjavaapplication_selenium1 {
    public static void main(String[] args) {
        //����һ��selenium���󣬵���DefaultSelenium�Ĺ���������������������ֱ��ǣ�host��������ip��ַ��port���˿ںš���������ͣ�url��Ҫ������վ������
        DefaultSelenium selenium = new DefaultSelenium("localhost", 4444,
                "*iexplore C:\\Program Files\\Internet Explorer\\iexplore.exe",
                "http://www.baidu.com/");

        selenium.start();
        selenium.open("http://www.baidu.com");
        selenium.type("id=kw1", "G7������ͼ");
        selenium.click("id=su1");
        System.out.println("Page title is: " + selenium.getTitle());
        selenium.stop();
    }
}