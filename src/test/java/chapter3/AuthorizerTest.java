package chapter3;

import org.junit.Assert;
import org.junit.Test;

public class AuthorizerTest extends BaseTest {

    @Test
    public void testIsPermitted() {
        login("classpath:shiro-authorizer.ini", "zhang", "123");
        // 判断拥有权限:user:create
        Assert.assertTrue(subject().isPermitted("user1:update"));
        Assert.assertTrue(subject().isPermitted("user2:update"));
        // 通过二进制位的方式表示权限
        Assert.assertTrue(subject().isPermitted("+user1+2"));
        Assert.assertTrue(subject().isPermitted("+user1+8"));
        Assert.assertTrue(subject().isPermitted("+user2+10"));
        Assert.assertFalse(subject().isPermitted("+user1+4"));
        Assert.assertTrue(subject().isPermitted("menu:view"));
    }
}
