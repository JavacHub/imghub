package com.jonnyhub.imghub.service;

import com.jonnyhub.imghub.common.result.ServiceResult;
import com.jonnyhub.imghub.vo.UserVO;

public interface UsersService {

    ServiceResult<Boolean> login(UserVO userVO);

    ServiceResult<UserVO> register(UserVO userVO);

    ServiceResult<UserVO> updateUser(UserVO userVO);

    ServiceResult<UserVO> selectById(Long id);

    ServiceResult<UserVO> selectByUid(String uid);

    ServiceResult<UserVO> selectByUserName(String userName);

    ServiceResult<UserVO> selectByPhoneNum(Long phoneNum);

    ServiceResult<UserVO> selectByEmail(String email);
}
