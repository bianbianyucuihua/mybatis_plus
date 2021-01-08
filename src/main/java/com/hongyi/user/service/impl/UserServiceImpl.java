package com.hongyi.user.service.impl;

import com.hongyi.user.entity.User;
import com.hongyi.user.mapper.UserMapper;
import com.hongyi.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhou
 * @since 2020-11-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
