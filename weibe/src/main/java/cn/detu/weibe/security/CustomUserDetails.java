package cn.detu.weibe.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
@Getter
public class CustomUserDetails extends User {
    private final Integer id;
    private final String nickname;

    public CustomUserDetails(Integer id, String userVONickname, String nickname, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id=id;
        this.nickname=nickname;
    }
}
