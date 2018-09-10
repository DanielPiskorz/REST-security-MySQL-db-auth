package pl.danielpiskorz.mysqlauth.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MainController {

		@GetMapping
		public String getResources(){
			return "hello";
		}
		
		@GetMapping("/secured")
		public String getSecuredResources(){
			return "secured data";
		}
		
}
