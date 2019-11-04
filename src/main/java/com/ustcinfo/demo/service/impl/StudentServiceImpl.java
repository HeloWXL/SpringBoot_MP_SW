package com.ustcinfo.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ustcinfo.demo.mapper.StudentMapper;
import com.ustcinfo.demo.model.Student;
import com.ustcinfo.demo.service.StudentService;
import com.ustcinfo.demo.vo.StudentScoreVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
  public List<Student> getStudentList(String sName, String sSex) {
    Map<String, Object> map = new HashMap<>();
    if (!("").equals(sName) && sName != null) {
      map.put("sname", sName);
    }
    if (!("").equals(sSex) && sSex == null) {
      map.put("ssex", sName);
    }
    List<Student> list = studentMapper.selectByMap(map);
    return list;
  }


  @Override
  public List<StudentScoreVo> getStudentScore(int studentId) {
    return null;
  }


}
