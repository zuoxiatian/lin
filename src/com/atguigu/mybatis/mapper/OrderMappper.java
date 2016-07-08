package com.atguigu.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.Order;

public interface OrderMappper {
	
	List<Order> testIn(Map<String,Object> params);
	
	List<Order> testIf(Map<String,Object> params);
	
	Order get2(@Param("id") Integer id);
	
	Order get(@Param("id") Integer id);
	
}
