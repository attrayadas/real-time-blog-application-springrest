package com.attraya.blog.service;

import com.attraya.blog.payload.LoginDto;
import com.attraya.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
