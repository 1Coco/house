package com.service.impl;

import java.util.*;

import com.entity.*;
import com.dao.*;
import com.dao.impl.*;
import com.service.*;
public class WorkingService implements IWorkingService{

	private IWorkingDao workingdao=new WorkingDao();
	@Override
	public List<working> selectAllWorking() {
		return workingdao.selectAllWorking();
	}

	@Override
	public working selectWorkingById(Integer id) {
		return workingdao.selectWorkingById(id);
	}

	@Override
	public int insertWorking(working w) {
		
		return workingdao.insertWorking(w);
	}

}
