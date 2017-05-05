package com.hellokoding.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hellokoding.dao.NewTableRepository;
import com.hellokoding.model.NewTable;

@Service
@Component
public class NewTableService {
	private final NewTableRepository newTableRepository;
	
	@Autowired
	public NewTableService(NewTableRepository newTableRepository) {
		this.newTableRepository = newTableRepository;
	}
	
	public NewTable getOne(int id){
		return newTableRepository.findOne(id);
	}
	
	public void save(NewTable newTable){
		newTableRepository.save(newTable);
	}
}
