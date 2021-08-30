package com.guangzhou.pcsold.service.impl;

import com.guangzhou.pcsold.entity.Orders;
import com.guangzhou.pcsold.dao.mapper.OrdersMapper;
import com.guangzhou.pcsold.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
