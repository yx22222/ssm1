package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Student;
import service.StudentService;

import javax.annotation.Resource;

/**
 * @Auther:yx
 * @Date:2020/5/23
 * @Description:controller
 * @version:1.0
 */
@Controller
public class StudentController {
    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    public StudentController() {
        super();
        System.out.println("StudentController");
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public String list(Model model){
        int i = studentService.hashCode();
        return "success";
}}
