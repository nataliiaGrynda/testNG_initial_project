package scripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.Waiter;

public class CarsTest extends Base {
/*
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
And user should be able to see heading1 as "Sign in"
And user should be able to see paragraph under “Sign in” header as “New to
Cars.com? Sign up. Are you a dealer?”
And user should be able to see Email input box with “Email” label and enabled
And user should be able to see Password input box with “Password” label and
enabled
And user should be able to see warning under Password input box as “Minimum of eight characters”
And user should be able to a link as “Forgot password?” under the Password input
box
And user should be able see “By signing in to your profile, you agree to our  Privacy
Statement  and  Terms of Service.” Text
And user should be able to “Sign in” button with its text and be displayed and
enabled
 */

  @Test
  public void homePageSignInButton() {
    driver.get("https://www.cars.com/");
    homePage.signInLink.click();
    Waiter.waitUntilTheElementIsVisible(Driver.getDriver(), signInPage.signInHeadingFirst, 10);
    Assert.assertTrue(signInPage.signInHeadingFirst.isDisplayed());
    Assert.assertTrue(signInPage.newToCarHeadingSecond.isDisplayed());
    Assert.assertTrue(signInPage.emailLabel.isDisplayed());
    Assert.assertTrue(signInPage.emailInputBox.isDisplayed() && signInPage.emailInputBox.isEnabled());
    Assert.assertTrue(signInPage.passwordLabel.isDisplayed());
    Assert.assertTrue(signInPage.passwordInputBox.isDisplayed() && signInPage.passwordInputBox.isEnabled());
    Assert.assertTrue(signInPage.minimumOfEightCharacterHeading.isDisplayed());
    Assert.assertTrue(signInPage.forgotPasswordHeading.isDisplayed());
    Assert.assertTrue(signInPage.privacyStatementHeading.isDisplayed());
    Assert.assertTrue(signInPage.submitButton.isDisplayed() && signInPage.submitButton.isEnabled());
    Assert.assertTrue(signInPage.submitButton.getText().equals("Sign in"));
  }
  /*
  Test Case 2: Validate Cars.com Sign in page social media section
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
And user should be able to see headings as "Connect with social"
And user should be able to “Sign in with Facebook” link with its text and be
displayed and enabled
And user should be able to “Sign in with Google” link with its text and be displayed
and enabled
And user should be able to “Sign in with Apple” link with its text and be displayed
and enabled
   */
  @Test
   public void signInPageSocialMedia(){
    driver.get("https://www.cars.com/");
   // Assert.assertTrue(homePage.signInLink.isDisplayed());
    homePage.signInLink.click();
    Assert.assertTrue(signInPage.socialMediaHeading.isDisplayed()&& signInPage.socialMediaHeading.getText().equals("Connect with social"));
    Assert.assertTrue(signInPage.socialLinkFacebook.isDisplayed() && signInPage.socialLinkFacebook.isEnabled() &&
     signInPage.socialLinkFacebook.getText().equals("Sign in with Facebook"));
    Assert.assertTrue(signInPage.socialLinkGoogle.isDisplayed() && signInPage.socialLinkGoogle.isEnabled() &&
    signInPage.socialLinkGoogle.getText().equals("Sign in with Google"));
    Assert.assertTrue(signInPage.signInWithAppleButton.isDisplayed() && signInPage.signInWithAppleButton.isEnabled() &&
     signInPage.signInWithAppleButton.getText().equals("Sign in with Apple"));

  }
/*
Test Case 3: Validate user cannot sign in to Cars.com with invalid
credentials
Given user navigates to “https://www.cars.com/”
When user clicks on top right “Sign In” link
Then user should be navigated to “Sign in” page
When user enters johndoe@gmail.com to the Email input box
And user enters abcd1234 to the Password input box
And user clicks on the “Sign in” button
Then user should not be logged in and displayed an error message on the top of the
form as below
“We were unable to sign you in.
 */

  @Test
  public void userCannotSignInWithInvalidCredentials(){
    driver.get("https://www.cars.com/");
    homePage.signInLink.click();
   signInPage.emailInputBox.sendKeys("johndoe@gmail.com" + Keys.ENTER);
   signInPage.passwordInputBox.sendKeys("abcd1234" + Keys.ENTER);
   signInPage.signInButton.click();
   Assert.assertTrue(signInPage.errorMessage.isDisplayed() && signInPage.errorMessage.getText().equals("We were unable to sign you in.\n"+
      "Your email or password was not recognized. Try again soon."));

  }


}



