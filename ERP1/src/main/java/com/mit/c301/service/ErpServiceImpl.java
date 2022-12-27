package com.mit.c301.service;

import org.springframework.stereotype.Service;

import com.mit.c301.DAO.ErpDAO;
import com.mit.c301.vo.ErpVO;

@Service
public class ErpServiceImpl implements ErpService {
	private ErpDAO dao;
	

	public ErpServiceImpl(ErpDAO dao) {
		super();
		this.dao = dao;
	}


	@Override  //제품 등록
	public void selectinsert(ErpVO erpvo) {
		dao.selectinsert(erpvo);
	}
	

	@Override //제품 찾기
	public ErpVO selectsearch(String code) {
		return dao.selectsearch(code);
	}


	@Override //제품 삭제
	public void selectdelte(String code) {
		dao.selectdelete(code);
	}


	@Override //제품 수정
	public void selectmodify(ErpVO erpVO) {
		dao.selectmodify(erpVO);
	}

}
