package jjon;

import java.util.List;

import org.springframework.stereotype.Service;

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
	
	public boolean boardInsert(BoardDto boardDto) {
		boolean result = boardMapper.boardInsert(boardDto);
		return result;
	}
	public boolean boardDelete(BoardDto boardDto) {
		boolean result = boardMapper.boardDelete(boardDto);
		return result;
	}
	
	public void boardUpdate(BoardDto boardDto) {
		boardMapper.boardUpdate(boardDto);
	}

}
