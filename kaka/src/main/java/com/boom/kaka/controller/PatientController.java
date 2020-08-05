package com.boom.kaka.controller;

import com.boom.kaka.model.Patient;
import com.boom.kaka.model.Patient_msg;
import com.boom.kaka.service.user.PatientMsgService;
import com.boom.kaka.service.user.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

/**

 */
@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientMsgService patientMsgService;



//    @GetMapping("/emps")
//    public String list(Model model)
//    {
//        Collection<Employee> employees = employeeDao.getAll();
//        //放在请求域中共享
//        model.addAttribute("emps",employees);
//        //thymeleaf默认就会拼串
//        return "emp/list";
//    }
    //显示单个病人全部信息
    @GetMapping("/all")
    public String findAllUser(Model model, HttpSession session){

        Patient loginUser = (Patient)session.getAttribute("loginUser");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "emp/list";
    }
    @GetMapping("/bloodpre")
    public String findAllbloodpre(Model model, HttpSession session){
        Patient loginUser = (Patient)session.getAttribute("loginUser");
        //int pid = (Integer)session.getAttribute("pid");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "graph/bloodpre";
    }
    @GetMapping("/heartrate")
    public String findAllheartrate(Model model, HttpSession session){
        Patient loginUser = (Patient)session.getAttribute("loginUser");
        //int pid = (Integer)session.getAttribute("pid");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "graph/heartrate";
    }
    @GetMapping("/weight")
    public String findAllweight(Model model, HttpSession session){
        Patient loginUser = (Patient)session.getAttribute("loginUser");
        //int pid = (Integer)session.getAttribute("pid");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "graph/weight";
    }
    @GetMapping("/temperature")
    public String findAlltemperature(Model model, HttpSession session){
        Patient loginUser = (Patient)session.getAttribute("loginUser");
        //int pid = (Integer)session.getAttribute("pid");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "graph/temperature";
    }
    @GetMapping("/SaO2")
    public String findAllSaO2(Model model, HttpSession session){
        Patient loginUser = (Patient)session.getAttribute("loginUser");
        //int pid = (Integer)session.getAttribute("pid");
        int pid=loginUser.getPid();
        Collection<Patient_msg> patient_msgs=patientMsgService.findMsgById(pid);
        model.addAttribute("patientMsg",patient_msgs);
        return "graph/SaO2";
    }
    @GetMapping("/users")
    public String findAllUsers(Model model, HttpSession session){

        List<Patient> patients = patientService.findAllPatient();
        model.addAttribute("patients",patients);
        return "emp/user";
    }
    @GetMapping("/user/{id}")
    public String findUserById(@PathVariable("id") Integer id, Model model){

        List<Patient_msg> patient_msgs = patientMsgService.findMsgById(id);
        Patient user= patientService.findPatientById(id);
        model.addAttribute("user",user);
        model.addAttribute("patientMsg",patient_msgs);
        return "emp/usermsg";
    }
}
