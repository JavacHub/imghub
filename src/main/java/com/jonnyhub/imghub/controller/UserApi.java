package com.jonnyhub.imghub.controller;

import java.util.List;

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
     * @return {@link BaseResult <UserVO>}
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResult<Boolean> userRegister(UserVO user) {
        ServiceResult<Boolean> result = usersService.register(user);
        return buildingBaseResult(result);
    }

    /**
     * 用户登录
     *
     * @return {@link BaseResult<Boolean>}
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public BaseResult<Boolean> userLogin(UserVO user) {
        ServiceResult<Boolean> login = usersService.login(user);
        return buildingBaseResult(login);
    }

    /**
     * 更新用户信息
     *
     * @return {@link BaseResult <UserVO>}
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResult<UserVO> userInfoUpdate(UserVO user) {
        ServiceResult<UserVO> update = usersService.updateUser(user);
        return buildingBaseResult(update);
    }

    /**
     * 根据 id/uid/userName/phoneNum/email 之一获取用户详情
     *
     * @return {@link BaseResult <UserVO>}
     */
    @RequestMapping(value = "/detail", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResult<UserVO> getUser(UserVO user) {
        ServiceResult<UserVO> detail = usersService.selectUser(user.getId(), user.getUid(), user.getUserName(), user.getPhoneNum(),
                user.getEmail());
        return buildingBaseResult(detail);
    }

    /**
     * 获取所有用户列表
     *
     * @return {@link BaseResult <List<UserVO>>}
     */
    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    public BaseResult<List<UserVO>> getAllList() {
        ServiceResult<List<UserVO>> detail = usersService.selectAllUserList();
        return buildingBaseResult(detail);
    }

    /**
     * 根据 任意属性进行查询 用户
     *
     * @return {@link BaseResult <List<UserVO>>}
     */
    @RequestMapping(value = "/queryByCondition", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResult<List<UserVO>> getAllList(UserVO user) {
        ServiceResult<List<UserVO>> listServiceResult = usersService.selectByCondition(user);
        return buildingBaseResult(listServiceResult);
    }
}
