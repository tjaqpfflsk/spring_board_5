package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	//Ä¿¸àµå ºÎºÐ
	
	public List<BoardVO> getList();

	public void writeBoard(BoardVO boardVO);
}
