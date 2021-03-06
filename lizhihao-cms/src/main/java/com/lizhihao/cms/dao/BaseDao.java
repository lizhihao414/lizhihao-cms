package com.lizhihao.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import com.lizhihao.cms.pojo.User;


public interface BaseDao<T> {
	List<T> select(T t);	
	
	User selectById(Integer id);
	
	int insert(T t);
	
	int update(T t);
	
	int delete(@Param("ids")String ids);
}
