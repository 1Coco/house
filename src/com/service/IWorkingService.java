package com.service;

import java.util.List;

import com.entity.*;
import java.util.*;
public interface IWorkingService {


	// ������
	List<working> selectAllWorking();
	
	// �鵥��
	working selectWorkingById(Integer id);
	
	// ����
	int insertWorking(working w);
}
