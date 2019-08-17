package br.com.alessanderleite;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alessanderleite.model.TodoModel;

@FeignClient(name = "TodoClient", url="https://jsonplaceholder.typicode.com")
public interface TodoClient {
	
	@GetMapping(value = "/todos", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<TodoModel> getTodos();
}
