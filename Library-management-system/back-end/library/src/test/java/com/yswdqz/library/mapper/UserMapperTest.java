package com.yswdqz.library.mapper;

import com.yswdqz.library.model.Administrator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.reflect.generics.tree.VoidDescriptor;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void read() {
        Administrator s = userMapper.loginByAdmin("Mik1e", "M85634");

        System.out.println(s);
    }
}