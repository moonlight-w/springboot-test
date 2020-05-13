package com.moon.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.moon.entity.Permit;
import tk.mybatis.mapper.common.Mapper;

public interface PermitMapper extends Mapper<Permit> {
	// 根据userAccount查出可操作的apis
	public List<String> selectApisByUserAccount(@Param("account") String account);
}