package com.atguigu.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.Customer;

public interface CustomerMapper {
	
	Customer get3(@Param("id") Integer id);
	
	Customer get2(@Param("id") Integer id);
	
	Customer get(@Param("id") Integer id);
}
