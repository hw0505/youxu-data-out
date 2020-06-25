package output.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class outputdata {
    @RequestMapping("/output")
    public String output(@RequestParam("datatable") String datatable){
        System.out.println(datatable);

        return "hello world";
    }
}
