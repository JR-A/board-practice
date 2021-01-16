package kr.spring.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
		
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		//뷰 이름 지정
		mav.setViewName("home"); //.jsp확장자는 제외하고 명시
		
		//뷰에서 사용할 데이터 세팅
		mav.addObject("greeting", "안녕하세요");
		
		return mav;
	}
	
}
