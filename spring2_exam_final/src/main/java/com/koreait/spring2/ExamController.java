package com.koreait.spring2;

import com.koreait.spring2.vo.ApartmentInfoDTO;
import com.koreait.spring2.vo.ApartmentInfoEntity;
import com.koreait.spring2.vo.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ExamController {
    @Autowired
    private ExamService service;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("locationList", service.selLocationCodeList());
        return "main";
    }
    @GetMapping("/result")
    public String result(Model model){
        System.out.println(model.asMap().get("list"));
        return "view";
    }

    @PostMapping("/result")
    public String result(SearchDTO param, RedirectAttributes redirectAttributes){
        service.saveData(param);
        List<ApartmentInfoDTO> list = service.result(param);
        redirectAttributes.addFlashAttribute("list", list);
        return "redirect:/result";
    }
}
