package com.example.backend_todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend_todolist.dao.TodoDAO;
import com.example.backend_todolist.dto.TodoDTO;

@Service
public class TodoServiceImp implements TodoService {
	
	@Autowired
	private TodoDAO todoDAO;

	public TodoServiceImp() {

	}

	@Override
	public List<TodoDTO> search() throws Exception {
		return todoDAO.getTodoList();
	}
	
	public int insert(TodoDTO dto) throws Exception{
		return todoDAO.insertTodoList(dto);
	}
	
	@Override
	public int update(int id) throws Exception {		
		return todoDAO.updateTodoList(id);
	}
	
	public int delete(int id) throws Exception{
		return todoDAO.deleteTodoList(id);
	}
}
