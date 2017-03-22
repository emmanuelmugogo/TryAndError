package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
//	 annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.
//	we can Use @RequestMapping(method=GET) to narrow this mapping.
//	@RequestParam binds the value of the query String parameter name 
//	into the name parameter of the greeting() method. This query String
//	parameter is not required; if it is absent in the request, 
//	the defaultValue of "World" is used. The value of the name parameter 
//	is added to a Model object, ultimately making it accessible to the view template.
	
	@RequestMapping("/greeting") 
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
	
	@RequestMapping("/cashMeOutside")
	public String cashMeOutside(Model model) {
		return "cashMeOutside";
	}

}
