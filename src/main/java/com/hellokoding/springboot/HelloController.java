package com.hellokoding.springboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hellokoding.model.NewTable;
import com.hellokoding.service.NewTableService;

@Controller
public class HelloController {
	
	private final NewTableService NewTableService;
	
	@Autowired
    public HelloController(NewTableService newTableService) {
		NewTableService = newTableService;
	}
	@RequestMapping(value ="/", method = RequestMethod.GET ) 
    public String hello(Model model) {
    	model.addAttribute("MODE", "MODE_HOME");
        return "Index";
    }
    @RequestMapping(value ="/edit", method = RequestMethod.GET ) 
    public String edit(Model model) {
    	model.addAttribute("MODE", "MODE_EDIT");
    	model.addAttribute("noidung", NewTableService.getOne(1).getNoidung());
        return "Index";
    }
    @RequestMapping(value ="/edit", method = RequestMethod.POST ) 
    public String editpost(Model model,@RequestParam("noidung") String noidung) {
    	model.addAttribute("MODE", "MODE_EDIT");
    	NewTableService.save(new NewTable(1,noidung));
        return "redirect:/edit";
    }
    /*
    @RequestMapping(value ="/edit", method = RequestMethod.GET ) 
    public String edit(Model model) {
    	model.addAttribute("MODE", "MODE_EDIT");
    	model.addAttribute("noidung", newService.getOne(1).getNoidung());
        return "Index";
    }
    
    @RequestMapping(value ="/edit", method = RequestMethod.POST ) 
    public String editpost(Model model,@RequestParam("noidung") String noidung) {
    	model.addAttribute("MODE", "MODE_EDIT");
    	newService.save(new New(1,noidung));
        return "Index";
    }*/
}
