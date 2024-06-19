package jjon;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class BoardService {
	
	private final BoardMapper boardMapper;
	private final BoardDto boardDto;
	
	public BoardService(BoardMapper boardMapper, BoardDto boardDto) {
		this.boardMapper = boardMapper;
		this.boardDto = boardDto;
	}
	
	public List<BoardDto> getList() {
		List<BoardDto> list = boardMapper.getList(boardDto);
		return list;
	}
	
	public boolean boardInsert() {
		boolean result = boardMapper.boardInsert(boardDto);
		
		return result;
		
		
	}

}
