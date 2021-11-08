package pl.rou.programmingLanguages;
import java.util.HashMap;
public class UsersData {
    HashMap <String, String> loginInfo = new HashMap<String, String>();
    UsersData(){
        loginInfo.put("Randarola","zaq1@WSX");
        loginInfo.put("PWR","student");
        loginInfo.put("informatyka","java");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
