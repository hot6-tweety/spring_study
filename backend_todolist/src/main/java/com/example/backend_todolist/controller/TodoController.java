package com.example.backend_todolist.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_todolist.dto.TodoDTO;
import com.example.backend_todolist.service.TodoService;

// https://www.youtube.com/watch?v=nrxzK_ky3uc&list=PLvdZg8T1CFZuMZh5PzNUAhDprr0ksjkNp
// https://github.com/wonderful-coding-life/sample.springboot.mybatis

// https://www.youtube.com/watch?v=hHRLN9j1kqI
// https://github.com/allssu/todolist-spring-backend
// https://github.com/allssu/todolist-react-frontend

//@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:3000") //해당 리액트 포트 번호.
@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	public TodoController() {
	
	}
	
	@GetMapping("/todo/all")	
	public List<TodoDTO> getList() throws Exception{
		System.out.println("all");
		return todoService.search();
	}
	
	
	@PostMapping("/todo")
	public void postTodo(@RequestBody TodoDTO dto) throws Exception{
		System.out.println(dto.getTodoname());
		todoService.insert(dto);
	}
	
	@PutMapping("/todo/{id}")
	public void putTodo(@PathVariable("id") int id) throws Exception{
		System.out.println(id);
		todoService.update(id);
	}
	
	
	public void deleteTodo(@PathVariable("id") int id) throws Exception{
		System.out.println(id);
		todoService.delete(id);
	}	
}
