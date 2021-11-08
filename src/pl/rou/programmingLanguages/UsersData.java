package pl.rou.programmingLanguages;
import java.util.HashMap;
public class UsersData {
    HashMap <String, String> loginInfo = new HashMap<String, String>();
    UsersData(){
        loginInfo.put("xyz","zaq1@WSX");
        loginInfo.put("PWR","student");
        loginInfo.put("informatyka","java");
        loginInfo.put("123","abcd");
        loginInfo.put("login","haslo");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}