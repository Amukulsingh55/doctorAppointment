package com.doctor.model;


import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
private String authority;
//constructor parameterised
public Authority(String authority){
    this.authority=authority;
}
    @Override
    public String getAuthority() {
        return this.authority;

    }
}
