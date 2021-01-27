package edu.bit.board.mapper;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardMapper {
	//���̹�Ƽ���� ���ٳ�..
	
	public List<BoardVO> getList();

	public void insert(BoardVO boardVO);

	public BoardVO read(int bno);
	
	public int delete(int bId);

	public void reply(BoardVO boardVO);

	public void modify(BoardVO boardVO);
	
}
