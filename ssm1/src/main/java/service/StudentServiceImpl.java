package service;

import dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Student;

import javax.annotation.Resource;

/**
 * @Auther:yx
 * @Date:2020/5/23
 * @Description:service
 * @version:1.0
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public StudentServiceImpl() {
        super();
        System.out.println("service");
    }
}
