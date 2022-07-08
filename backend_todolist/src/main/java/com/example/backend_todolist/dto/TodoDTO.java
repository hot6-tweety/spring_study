package com.example.backend_todolist.dto;

import org.springframework.stereotype.Component;
/*  [MySQL]
 * 
CREATE TABLE todolist(
id INT AUTO_INCREMENT PRIMARY KEY,
completed BOOLEAN DEFAULT false,
todoname  VARCHAR(100) NOT NULL);

INSERT INTO todolist VALUES(NULL, false, '여행');
COMMIT;
SELECT * FROM todolist;


	[Oracle SQL]
CREATE TABLE todolist(
id number PRIMARY KEY,
completed CHAR(1) DEFAULT '0',
todoname  VARCHAR(100) NOT NULL);

INSERT INTO todolist VALUES(NULL, false, '여행');
COMMIT;
SELECT * FROM todolist;

CREATE SEQUENCE todo_num_sql
START
INCREMENT BY 1
NOCACHE
NOCYCLE;

 */

@Component
public class TodoDTO {
	private int id;
	private boolean completed;
	private String todoname;

	public TodoDTO() {

	}

	public TodoDTO(int id, boolean completed, String todoname) {
		super();
		this.id = id;
		this.completed = completed;
		this.todoname = todoname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getTodoname() {
		return todoname;
	}

	public void setTodoname(String todoname) {
		this.todoname = todoname;
	}
}
