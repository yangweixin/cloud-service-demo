package top.oyoung.cloudservicedemo.entity;

/**
 * @Author: Yang Weixin
 * @Description:
 * @DateTime: 2018/5/23 下午12:05
 */
public class UserEntity {

    private String username;
    private String agent;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "username='" + username + '\'' +
                ", agent='" + agent + '\'' +
                '}';
    }
}
