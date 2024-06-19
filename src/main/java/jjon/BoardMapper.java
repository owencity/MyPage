package jjon;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	public List<BoardDto> getList(BoardDto boardDto);
	public boolean boardInsert(BoardDto boardDto);
	public void boardDelete(BoardDto boardDTo);
	public void boardUpdate(BoardDto boardDto);
	public int boardSearch(int id);
	public int boardCount(int count);

	
	

}
