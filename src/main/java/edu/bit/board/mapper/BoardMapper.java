package edu.bit.board.mapper;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardMapper {
	//마이바티스가 들어간다네..
	
	public List<BoardVO> getList();

	public void insert(BoardVO boardVO);
	
}
