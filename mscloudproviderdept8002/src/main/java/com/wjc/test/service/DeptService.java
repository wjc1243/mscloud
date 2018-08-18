package com.wjc.test.service;

import java.util.List;

import com.wjc.test.dao.DeptDao;
import com.wjc.test.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService{
	@Autowired
	private DeptDao dao;

	public boolean add(Dept dept){
		return dao.addDept(dept);
	}

	public Dept get(Long id){
		return dao.findById(id);
	}

	public List<Dept> list(){
		return dao.findAll();
	}
}
