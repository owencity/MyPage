package jjon;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping("/")
@RestController
public class BoardController {
	
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/all")
	public List<Board> boardList() {
		List<Board> list = boardService.getList();
		return list;
	}
	
	@PostMapping("/new")
	public void boardInsert(Board vo ) {
		boardService.boardInsert(vo);
		
	}
	
	@DeleteMapping("/{id}") 
	public void boardDelete(@PathVariable("id") int id) {
		boardService.boardDelte(id);
	}
	
	@PutMapping("/update") 
	public void boardUpdate(@RequestBody Board vo) {
		boardService.boardUpdate(vo);
	}
	@GetMapping("/{id}")
	public Board boardContent(@PathVariable("id") int id) {
		Board vo = boardService.boardContent(id);
	}
	
	@PutMapping("/count/{id}")
	public Board boardCount(@PathVariable("id") int id) {
		boardService.boardCount(id);
		Board vo = boardService.boardCount(id);
		return vo;
	}

}
