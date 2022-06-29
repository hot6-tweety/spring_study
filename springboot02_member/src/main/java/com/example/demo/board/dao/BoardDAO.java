package com.example.demo.board.dao;

import java.util.List;

import com.example.demo.board.dto.BoardDTO;
import com.example.demo.board.dto.PageDTO;

public interface BoardDAO {
	public int count();
	public List<BoardDTO> list(PageDTO pv);
	public void readCount(int num);
	public BoardDTO content(int num);
	public void reStepCount(BoardDTO dto);
	public void save(BoardDTO dto);
	public BoardDTO updateNum(int num);
	public void update( BoardDTO dto);
	public void delete(int num);
	public String getFile(int num);
}
