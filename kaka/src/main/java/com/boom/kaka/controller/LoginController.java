package com.boom.kaka.controller;
import com.boom.kaka.model.Patient;
import com.boom.kaka.model.QueryVo;
import com.boom.kaka.service.user.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.Map;
/**
 * @Auther:yx
 * @Date:2020/6/12
 * @version:1.0
 */
@Controller
public class LoginController {
    @Autowired
    PatientService patientService;
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map
    , HttpSession session){
        QueryVo queryVo=new QueryVo(username,password);
        Patient patient=patientService.isExists(queryVo);
        if(!StringUtils.isEmpty(username)&&patient!=null)
        {
            //登陆成功,防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser",patient);
            //session.setAttribute("loginUser",patient.getPname());
            //session.setAttribute("pid",patient.getPid());
            return "redirect:/main.html";
        }
        else{
            //登陆失败
            map.put("msg","用户名密码错误");
        return "login";
    }
    }
    @PostMapping(value = "/admin/login")
    public String adminLogin(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map
            , HttpSession session){
         if(username.equals("admin") && "123456".equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("adminUser",username);
             return "redirect:/adminmain.html";
        }else{
            //登陆失败
            map.put("msg","管理员用户名密码错误");
            return  "adminLogin";
        }
    }
}
