package com.dao;

import com.entity.*;
import java.util.*;

public interface IWorkingDao {

	// ������
	List<working> selectAllWorking();
	
	// �鵥��
	working selectWorkingById(Integer id);
	
	// ����
	int insertWorking(working w);
	
}
