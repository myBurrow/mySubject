package webproj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("index Controller");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","spring mvc~~");
		mv.setViewName("index.jsp");
		return mv;
	}

}
