package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	//Ä¿¸àµå ºÎºÐ
	
	public List<BoardVO> getList();

	public void writeBoard(BoardVO boardVO);

	public BoardVO getBoard(int getbId);
	
	public int delete(int bId);

	public void reply(BoardVO boardVO);

	public void modify(BoardVO boardVO);


	
}
