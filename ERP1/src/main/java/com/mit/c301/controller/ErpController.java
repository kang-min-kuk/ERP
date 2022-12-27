package com.mit.c301.controller;

import java.util.Locale;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mit.c301.service.ErpService;
import com.mit.c301.vo.ErpVO;






@Controller //컨트롤러 bean으로 등록
public class ErpController {

//private static final Logger logger =  (Logger) LoggerFactory.getLogger(ErpController.class);	
	
//	@Resource(name="ErpService")
	
	
	ErpService erpservice;
	
	public ErpController(ErpService erpservice) {
		super();
		this.erpservice=erpservice;
	}
	

	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
//		logger.info("main");
	
		return "main"; // main화면으로 넘기자
	}
	
	@GetMapping("/insert") //제품 등록 화면
	void insert() {
		
	}

	@GetMapping("/selectinsert") 
		String selectInsert(ErpVO erpvo) {
			
			erpservice.selectinsert(erpvo);
			return "/main";
		
	} 
	
	
	   @GetMapping("/search") //제품조회
	   void search(){
		   
	   }
	   
	   @GetMapping("/selectsearch") //제품조회
	   String inquiry(Model model, ErpVO erpvo){
		   model.addAttribute("selectsearch", erpservice.selectsearch(erpvo.getCode()));
	      return "/search2";
	   }
	   
	   @GetMapping("/delete") //제품삭제
	   String selectdelete(ErpVO erpvo){
		   erpservice.selectdelte(erpvo.getCode());
	      return "/delete";
	   }
	   
////	   @GetMapping("/inquiryList")
////		String inquiryList(Model model, ProductVO productVO) {
////			
////			model.addAttribute("inquirylist", examservice.productRead());
////								//이름 짓고 		수행결과를 바로 보낼 것
////			return "/inquiry";
////			
////		}
//	   
//	   @GetMapping("/delete") //제품삭제
//	   String delete(ProductVO productVO){
//		   examservice.delete(productVO.getCode());
//	      return "/delete";
//	   }
//	   
//	   @GetMapping("/modify") //제품수정
//	   void modify(){
//		   
//	   }
//	   
//	   @GetMapping("/revise") //제품수정
//	   String modify(ProductVO productVO){
//		  examservice.revise(productVO);
//	      return "/modify2";
//	   }
//	   
//	   @GetMapping("/above") //우선제품
//	   void above(Model model){
//		   model.addAttribute("gjlist", examservice.gjRead());
////	      return "/above";
//	   }
//	   
//	   @GetMapping("/score") //이익순위
//	   void score(Model model){
//		   model.addAttribute("rcjlist", examservice.rcjRead());
//	   }
//	
//	   @GetMapping("/groupcount") //그룹별재고수량
//	   void groupcount(Model model){
//		   model.addAttribute("abclist", examservice.abcRead());
//	   }
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	private ErpService erpservice;
//	
//	public ErpController(ErpService erpservice) {
//		super();
//		this.erpservice=erpservice;
//	}
//	


//	
//	//insertProcess
//	@GetMapping ("/insertProcess") //insert에서 나온걸 처리
//	String insert1(ErpVO vo) {  
//		ErpService.selectInsert(vo);
//		return "insert";
//	}

}
