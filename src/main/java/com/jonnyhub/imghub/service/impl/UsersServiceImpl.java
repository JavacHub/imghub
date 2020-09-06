package com.jonnyhub.imghub.service.impl;

import java.util.Date;

import com.jonnyhub.imghub.common.result.ServiceResult;
import com.jonnyhub.imghub.common.result.enums.ResultCodeEnum;
import com.jonnyhub.imghub.entity.User;
import com.jonnyhub.imghub.mapper.UserMapper;
import com.jonnyhub.imghub.service.UsersService;
import com.jonnyhub.imghub.utils.BeanConvertor;
import com.jonnyhub.imghub.vo.UserVO;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    protected final UserMapper userMapper;

    public UsersServiceImpl(UserMapper userMapper) {this.userMapper = userMapper;}

    @Override
    public ServiceResult<Boolean> login(UserVO userVO) {
        // 参数校验
        if (userVO == null || StringUtils.isAnyBlank(userVO.getUid(), userVO.getUserName(), userVO.getPasswd(), userVO.getEmail())
                || userVO.getPhoneNum() == null) {
            return new ServiceResult<>(false, ResultCodeEnum.PARAM_IS_NULL);
        }
        UserVO selectUserVO = selectByUid(userVO.getUid()).getData();
        boolean loginCheck = false;
        loginCheck = userVO.getPhoneNum().equals(selectUserVO.getPhoneNum());
        loginCheck = loginCheck && StringUtils.equals(userVO.getUid(), selectUserVO.getUid())
                && StringUtils.equalsIgnoreCase(userVO.getNickName(), selectUserVO.getNickName())
                && StringUtils.equals(userVO.getUid(), selectUserVO.getUid())
                && StringUtils.equals(userVO.getPasswd(), selectUserVO.getPasswd())
                && StringUtils.equalsIgnoreCase(userVO.getEmail(), selectUserVO.getEmail());
        // 更新最后登录时间
        selectUserVO.setLastLogin(new Date());
        updateUser(selectUserVO);
        return new ServiceResult<>(loginCheck, ResultCodeEnum.SUCCESS);
    }

    @Override
    public ServiceResult<UserVO> register(UserVO userVO) {
        if (userVO == null || StringUtils.isAnyBlank(userVO.getUid(), userVO.getUserName(), userVO.getPasswd(), userVO.getEmail(),
                userVO.getRegUa(),
                userVO.getRegIp())
                || userVO.getPhoneNum() == null || userVO.getPermission() == null) {
            return new ServiceResult<>(ResultCodeEnum.PARAM_IS_NULL);
        }
        userVO.setGender(0);
        userVO.setStatus(0);
        userVO.setPermission(0);
        userVO.setLastLogin(new Date());
        userVO.setUploadLimit(20);
        userVO.setUploadTotal(0L);
        userVO.setGmtCreate(new Date());
        int insert = userMapper.insert(BeanConvertor.convertBean(userVO, User.class));
        return insert > 0 ? new ServiceResult<>(selectById((long) insert).getData()) : new ServiceResult<>(ResultCodeEnum.INSERT_DB_FAILED);
    }

    @Override
    public ServiceResult<UserVO> updateUser(UserVO userVO) {
        if (userVO == null || userVO.getId() == null) {
            return new ServiceResult<>(ResultCodeEnum.PARAM_IS_NULL);
        }
        int updateByCondition = userMapper.updateByCondition(BeanConvertor.convertBean(userVO, User.class));
        return updateByCondition > 0 ? selectById(userVO.getId()) : new ServiceResult<>(ResultCodeEnum.UPDATE_DB_FAILED);
    }

    @Override
    public ServiceResult<UserVO> selectById(Long id) {
        User user = userMapper.selectByPrimaryKey(id, null, null, null, null);
        UserVO userVO = BeanConvertor.convertBean(user, UserVO.class);
        return new ServiceResult<>(userVO, ResultCodeEnum.SUCCESS);
    }

    @Override
    public ServiceResult<UserVO> selectByUid(String uid) {
        User user = userMapper.selectByPrimaryKey(null, uid, null, null, null);
        UserVO userVO = BeanConvertor.convertBean(user, UserVO.class);
        return new ServiceResult<>(userVO, ResultCodeEnum.SUCCESS);
    }

    @Override
    public ServiceResult<UserVO> selectByUserName(String userName) {
        User user = userMapper.selectByPrimaryKey(null, null, userName, null, null);
        UserVO userVO = BeanConvertor.convertBean(user, UserVO.class);
        return new ServiceResult<>(userVO, ResultCodeEnum.SUCCESS);
    }

    @Override
    public ServiceResult<UserVO> selectByPhoneNum(Long phoneNum) {
        User user = userMapper.selectByPrimaryKey(null, null, null, phoneNum, null);
        UserVO userVO = BeanConvertor.convertBean(user, UserVO.class);
        return new ServiceResult<>(userVO, ResultCodeEnum.SUCCESS);
    }

    @Override
    public ServiceResult<UserVO> selectByEmail(String email) {
        User user = userMapper.selectByPrimaryKey(null, null, null, null, email);
        UserVO userVO = BeanConvertor.convertBean(user, UserVO.class);
        return new ServiceResult<>(userVO, ResultCodeEnum.SUCCESS);
    }

}
