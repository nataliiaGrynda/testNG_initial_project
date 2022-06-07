package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {


  public SignInPage(WebDriver driver){
    PageFactory.initElements(driver, this);
  }
  @FindBy(xpath = "//h1[text()='Sign in']")
  public WebElement signInHeadingFirst;

  @FindBy(xpath = "//p[@class='sds-page-section__title--sub signup-block']")
  public WebElement newToCarHeadingSecond;

  @FindBy(xpath = "//label[text()='Email']")
  public WebElement emailLabel;

  @FindBy(xpath = "//input[@id=\"email\"]")
  public WebElement emailInputBox;

  @FindBy(xpath = "//label[text()='Password']")
  public WebElement passwordLabel;

  @FindBy(xpath = "//input[@id='password']")
  public WebElement passwordInputBox;

  @FindBy(xpath = "//p[text()='Minimum of eight characters']")
  public WebElement minimumOfEightCharacterHeading;

  @FindBy(xpath = "//a[text()='Forgot password?']")
  public WebElement forgotPasswordHeading;

  @FindBy(xpath = "//div[@class='sds-disclaimer ']")
  public WebElement privacyStatementHeading;

  @FindBy(xpath = "//button[@class='sds-button']")
  public WebElement submitButton;

  @FindBy(xpath = "//h3[text()='Connect with social']")
  public WebElement socialMediaHeading;

  @FindBy(xpath = "//a[@class='sds-button facebook-button']")
  public WebElement socialLinkFacebook;

  @FindBy(xpath = "//a[@class='sds-button google-button']")
  public WebElement socialLinkGoogle;

  @FindBy(xpath = "//a[@class='sds-button apple-button']")
  public WebElement signInWithAppleButton;

  @FindBy(className = "sds-notification__content")
  public WebElement errorMessage;

  @FindBy(xpath = "//button[@type='submit']")
  public WebElement signInButton;
}
