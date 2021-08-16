package com.service;

import java.util.List;

import com.entity.*;
import java.util.*;
public interface IWorkingService {


	// 查所有
	List<working> selectAllWorking();
	
	// 查单个
	working selectWorkingById(Integer id);
	
	// 新增
	int insertWorking(working w);
}
