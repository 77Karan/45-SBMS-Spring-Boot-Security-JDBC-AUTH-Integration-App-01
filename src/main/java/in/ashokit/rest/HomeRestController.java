package in.ashokit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeRestController 
{
	@GetMapping("/home")
	public String getHomePage()
	{
		return "home";
	}
	
	@GetMapping("/admin")
	public String getAdminPage()
	{
		return "admin";
	}
	
	@GetMapping("/welcome")
	public String getWelcomePage()
	{
		return "welcome";
	}
	
	@GetMapping("/emp")
	public String getEmpPage()
	{
		return "emp";
	}
	
	@GetMapping("/mgr")
	public String getMgrPage()
	{
		return "mgr";
	}
	
	@GetMapping("/common")
	public String getCommonPage()
	{
		return "common";
	}
	
	@GetMapping("/accessDenied")
	public String getDeniedPage()
	{
		return "accesdenied";
	}

}
