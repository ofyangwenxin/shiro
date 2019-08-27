package chapter2.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

public class MyRealm2 implements Realm {
    @Override
    public String getName() {
        return "myrealm2";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        // 仅支持UsernamePasswordToken类型的Token
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();    // 得到用户名
        String password = new String((char[])token.getCredentials());   // 得到密码
        if (!"wang".equals(username)) {
            throw new UnknownAccountException();    // 用户名错误
        }
        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException();  // 密码错误
        }
        // 身份认证成功，返回一个AuthenticationInfo实现
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
