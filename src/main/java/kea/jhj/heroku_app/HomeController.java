package kea.jhj.heroku_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/hejhej")
  public String greeting() {
    return "hej";
  }

}
