package com.guangzhou.pcsold.service.impl;

import com.guangzhou.pcsold.entity.User;
import com.guangzhou.pcsold.dao.mapper.UserMapper;
import com.guangzhou.pcsold.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljs
 * @since 2021-08-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
