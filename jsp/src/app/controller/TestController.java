package app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String getAccessToken(HttpServletRequest request)
	{
		return  "{\"id\":1,\"name\":\"joy\"}";
	}
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	@ResponseBody
	public String postAccessToken(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		return  "{\"name\":\""+name+"\"}";
	}
}