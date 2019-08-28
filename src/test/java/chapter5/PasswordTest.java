package chapter5;

import common.BaseTest;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.junit.Test;

public class PasswordTest extends BaseTest {

    @Test(expected = ExcessiveAttemptsException.class)
    public void testRetryLimitHashedCredentialsMatcherWithMyRealm() {
        for (int i = 1; i <= 5; i++) {
            try {
                login("classpath:shiro-retryLimitHashedCredentialsMatcher.ini", "liu", "234");
            } catch (Exception e) {
            }
        }
        login("classpath:shiro-retryLimitHashedCredentialsMatcher.ini", "liu", "234");
    }

}
