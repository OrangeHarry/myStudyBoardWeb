package com.springbook.service;

import java.util.List;

import com.springbook.vo.BoardFileVO;
import com.springbook.vo.BoardVO;

public interface BoardService {
	//CRUD ����� �޼ҵ� ����
	//�� ���
	void insertBoard(BoardVO vo);
	
	//�� ����
	void updateBoard(BoardVO vo);
	
	//�� ����
	void deleteBoard(BoardVO vo);
	
	//�� �� ��ȸ
	BoardVO getBoard(BoardVO vo);
	
	//�� ��� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);
	
	//�� ��� �� ��� �� �Ϸù�ȣ ȹ��
	int getBoardSeq();
	
	//��� ���ϸ���Ʈ ���
	void insertBoardFileList(List<BoardFileVO> filList);
	
	//���ϸ�� ����
	List<BoardFileVO> getBoardFileList(int seq);
	
	//���� ����
	void deleteFile(BoardFileVO vo);
	
	//�Խñ� ���� �� �ش� �Խñ��� ÷�� ���� ��� ����
	void deleteFileList(int seq);
}
