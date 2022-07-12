package com.syntax.class26;

public interface Webdriver {

    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements Webdriver{
    @Override
    public void openBrowser() {
        System.out.println("Webdriver help us open a browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close browser helps us close browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize window helps us maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("findElement helps us find an element");
    }
}
class firefoxDriver implements Webdriver{
    @Override
    public void openBrowser() {
        System.out.println("firefoxDriver opens website");
    }

    @Override
    public void closeBrowser() {
        System.out.println("firefoxDriver opens any browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("firefoxDriver opens search websites");
    }

    @Override
    public void findElement() {
        System.out.println("firefoxDriver search browsers");
    }
}
class Test{
    public static void main(String[] args) {
        Webdriver [] driver={new ChromeDriver(), new firefoxDriver()};
        for(Webdriver dr:driver){
            dr.openBrowser();
            dr.closeBrowser();
            dr.maximizeWindow();
            dr.closeBrowser();
        }

    }
}