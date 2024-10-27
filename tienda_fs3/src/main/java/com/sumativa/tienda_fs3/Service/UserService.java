package com.sumativa.tienda_fs3.Service;

import org.springframework.http.HttpHeaders;
import com.sumativa.tienda_fs3.dto.JwtResponseDto;
import com.sumativa.tienda_fs3.dto.LoginDto;
import com.sumativa.tienda_fs3.dto.RegisterDto;
import com.sumativa.tienda_fs3.dto.UserDto;

public interface UserService {
    
    public UserDto register(RegisterDto registerDto);

    public JwtResponseDto login(LoginDto loginDto);

    UserDto getLoguedUser(HttpHeaders headers);
}
