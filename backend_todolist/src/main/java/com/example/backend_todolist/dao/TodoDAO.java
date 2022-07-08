package com.example.backend_todolist.dao;

import org.springframework.stereotype.Repository;

import com.example.backend_todolist.dto.TodoDTO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Repository
@Mapper
public interface TodoDAO {

	
	public List<TodoDTO> getTodoList() throws Exception;
	
	
	public int insertTodoList(TodoDTO dto) throws  Exception;
	
	public int updateTodoList(int id) throws  Exception;
	
	public int deleteTodoList(int id) throws Exception;
	
	
}


