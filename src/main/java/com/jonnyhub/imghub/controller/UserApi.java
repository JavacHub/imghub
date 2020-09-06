package com.jonnyhub.imghub.controller;

import com.jonnyhub.imghub.common.result.BaseResult;
import com.jonnyhub.imghub.common.result.ServiceResult;
import com.jonnyhub.imghub.service.UsersService;
import com.jonnyhub.imghub.vo.UserVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/user")
public class UserApi extends BaseApi {

    final UsersService usersService;

    public UserApi(UsersService usersService) {this.usersService = usersService;}

    /**
     * 用户注册
     *
     * @return {@link BaseResult <Integer>}
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResult<UserVO> userRegister(UserVO user) {
        ServiceResult<UserVO> result = usersService.register(user);
        return buildingBaseResult(result);

    }

    /**
     * 用户登录
     *
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public BaseResult<Boolean> userLogin(UserVO user) {
        ServiceResult<Boolean> login = usersService.login(user);
        return buildingBaseResult(login);
    }
}
