package kr.co.serendipity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/travel_info/*")
public class TravelInfoController {
	
	@RequestMapping("travel_info.htm")
	public String travel_info() {
		return "/travel_info/travel_info";
	}
}
