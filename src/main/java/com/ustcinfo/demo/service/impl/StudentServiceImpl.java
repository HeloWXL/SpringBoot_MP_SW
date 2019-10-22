package com.ustcinfo.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ustcinfo.demo.mapper.StudentMapper;
import com.ustcinfo.demo.model.Student;
import com.ustcinfo.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxl
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @date 2019/10/15 16:15
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Resource
  private StudentMapper studentMapper;

  @Override
  public int insertStudent(Student student) {
    return studentMapper.insert(student);
  }


  @Override
  public int deleteStudentById(Integer studentId) {
    return studentMapper.deleteById(studentId);
  }


  @Override
  public int updateStudentById(Student student) {
    return studentMapper.updateById(student);
  }


  @Override
  public List<Student> getStudentList() {
    return studentMapper.selectList(new EntityWrapper<>());
  }


  @Override
  public Student getStudentById(Integer studentId) {
    return studentMapper.selectById(studentId);
  }


  @Override
  public List<Student> getStudentByPage() {

    return null;
  }


}
