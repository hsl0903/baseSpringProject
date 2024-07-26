package com.template.app.controller.user;

import com.template.app.dto.LoginDTO;
import com.template.app.dto.UserDTO;
import com.template.app.dto.UserRegisterVO;
import com.template.app.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户信息 前端控制器
 * </p>
 *
 * @author Doug Liu
 * @since 2022-12-20
 */
@Api(tags = {"文档示例"})
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
@Slf4j

public class UserController {

    private final IUserService userService;

    @PostMapping("/updateUser")
    @ApiOperation(value = "POST实体请求示例，更新用户")
    public void updateUser(@RequestBody UserRegisterVO userRegisterVO) {
        log.info("请求方法开始-->方法名:【updateUser】-->参数:userRegisterVO = {}", userRegisterVO.toString());
//        userRegisterVO.setId(ContextUtil.getContext().getId());
        userService.updateUser(userRegisterVO);

    }
    
    
    @PostMapping("/register")
    @ApiOperation(value = "POST实体请求示例，创建用户")
    public LoginDTO register(@RequestBody UserRegisterVO userRegisterVO) {
        log.info("请求方法开始-->方法名:【register】-->参数:userRegisterVO = {}", userRegisterVO.toString());
//        userRegisterVO.setId(ContextUtil.getContext().getId());
        return userService.register(userRegisterVO);
    }

    @GetMapping("/getUserInfo")
    @ApiOperation(value = "GET普通传参示例，获取用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", dataTypeClass = Long.class, required = true)
    })
    public UserDTO getUserInfo(@RequestParam Long userId) {
        log.info("请求方法开始-->方法名:【getUserInfo】-->参数:userId = {}", userId);
        return userService.getUserDetail(userId);
    }
    
    @GetMapping("/checkNickname")
    @ApiOperation(value = "GET普通传参示例，校验用户昵称")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "nickname", value = "昵称", dataTypeClass = String.class, required = true)
    })
    public ResponseEntity<String> checkNickname(@RequestParam String nickname) 
    {
        boolean result = userService.checkNickname(nickname);
        if (result) {
            return ResponseEntity.ok("昵称可用");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("昵称已存在");
        }
    }

    @GetMapping("/checkPhone")
    @ApiOperation(value = "GET普通传参示例，校验用户手机号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", dataTypeClass = String.class, required = true)
    })
    public void checkPhone(@RequestParam String phone) {
        userService.checkPhone(phone);
    }

    @GetMapping("/checkEmail")
    @ApiOperation(value = "GET普通传参示例，校验用户邮箱")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", dataTypeClass = String.class, required = true)
    })
    public void checkEmail(@RequestParam String email) {
        userService.checkEmail(email);
    }

    @GetMapping("/getUser")
    @ApiOperation(value = "GET请求示例，获取用户")
    public UserDTO getUserInfo() {
//        log.info("请求方法开始-->方法名:【getUserInfo】-->参数:userId = {}", ContextUtil.getContext().getId());
//        return userService.getUserDetail(ContextUtil.getContext().getId());
        return new UserDTO();
    }
}
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
impor                                                                           t static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private UserController userController;
    private MockMvc mockMvc;

    @Test
    public void testCheckNicknameAvailable() throws Exception {
        mockMvc.perform(get("/checkNickname?nickname=test")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().string("昵称可用"));
    }

    @Test
    public void testCheckNicknameUnavailable() throws Exception {
        mockMvc.perform(post("/checkNickname")
                .param("nickname", "admin")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isBadRequest())
                  .andExpect(content().string("昵称已存在"));
                .andExpect(content().string("昵称已存在"));
    }
}
