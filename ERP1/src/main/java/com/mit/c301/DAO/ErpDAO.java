package com.mit.c301.DAO;

import java.util.List;

import com.mit.c301.vo.ErpVO;

public interface ErpDAO {
	
	
	//제품 등록
	int selectinsert(ErpVO erpvo); 
	//제품 조회
	ErpVO selectsearch(String code);
	//제품 삭제
	int selectdelete(String code);
	//제품 수정
	int selectmodify (ErpVO erpVO);

}
