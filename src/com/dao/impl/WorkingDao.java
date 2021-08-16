package com.dao.impl;

import java.util.*;

import com.entity.*;
import com.dao.*;

import java.sql.*;
public class WorkingDao extends BaseDao implements IWorkingDao {

	
	public List<working> selectAllWorking() {
		init();
		List<working> list=new ArrayList();
		try {
			String sql=" SELECT * FROM working ORDER BY createDate  ";
			ResultSet rs=getRs(sql);
			while(rs.next()){
				working w=new working ();
				w.setId(rs.getInt("id"));
				w.setTitle(rs.getString("title"));
				w.setContent(rs.getString("content"));
				w.setCreateDate(rs.getString("createDate"));
				w.setType(rs.getInt("type"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return list;
	}

	@Override
	public working selectWorkingById(Integer id) {
		init();
		working w=new working();
		try {
			String sql=" SELECT * FROM working WHERE id=? ";
			ResultSet rs=getRs(sql, id);
			if(rs.next()){
				w.setId(rs.getInt("id"));
				w.setTitle(rs.getString("title"));
				w.setContent(rs.getString("content"));
				w.setCreateDate(rs.getString("createDate"));
				w.setType(rs.getInt("type"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return w;
	}

	@Override
	public int insertWorking(working w) {
		init();
		int num=0;
		try {
			String sql=" INSERT INTO working VALUES(DEFAULT,?,?,?,?) ";
			num=getNum(sql,w.getTitle(),w.getContent(),w.getCreateDate(),w.getType());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return num;
	}

}
