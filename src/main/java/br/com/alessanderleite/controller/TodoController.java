package br.com.alessanderleite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.TodoClient;
import br.com.alessanderleite.model.TodoModel;

@RestController
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	TodoClient todoClient;
	
	@GetMapping()
	public List<TodoModel> getTodos() {
		return todoClient.getTodos();
	}
}
