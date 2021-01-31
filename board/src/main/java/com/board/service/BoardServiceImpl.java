package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 @Override
 public List list() throws Exception {

  return dao.list();
 }

@Override
public void write(BoardVO vo) throws Exception {
	// TODO Auto-generated method stub
	dao.write(vo);
}

@Override
public BoardVO view(int bno) throws Exception {
	// TODO Auto-generated method stub
	return dao.view(bno);
}

@Override
public void modify(BoardVO vo) throws Exception {
	 dao.modify(vo);
}

@Override
public void delete(int bno) throws Exception {
	dao.delete(bno);
	
}

@Override
public int count() throws Exception {
	// TODO Auto-generated method stub
	return dao.count();
}


@Override
public List listPage(int displayPost, int postNum) throws Exception {
return dao.listPage(displayPost, postNum);
}


@Override
public List<BoardVO> listPageSearch(
int displayPost, int postNum, String searchType, String keyword) throws Exception {
return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
}

@Override
public int searchCount(String searchType, String keyword) throws Exception {
return dao.searchCount(searchType, keyword);
}

}