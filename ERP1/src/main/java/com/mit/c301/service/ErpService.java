package com.mit.c301.service;

import com.mit.c301.vo.ErpVO;

public interface ErpService {
	
	//등록
	void selectinsert(ErpVO erpvo) ; 
    //조회 selectsearch
	ErpVO selectsearch(String code); //제품 검색
	//삭제 selectdelte
	void selectdelte(String code); //삭제
	//수정 selectmodify
	void selectmodify(ErpVO erpVO); //제품 수정
    
    
    
    //
//    List<ErpVO> selectFirst();
//    //
//    List<ErpVO> selectFirstmoney();
//    //
//    List<ErpVO> selectGroupclass();
    
    

}
