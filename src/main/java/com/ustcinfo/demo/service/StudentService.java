package com.ustcinfo.demo.service;

import com.ustcinfo.demo.model.Student;

import java.util.List;

public interface StudentService {

  /**
   * 添加学生
   * @param student
   * @return
   */
  int insertStudent(Student student);

  /**
   * 删除学生信息
   * @param studentId
   * @return
   */
  int deleteStudentById(Integer studentId);

  /**
   * 修改学生信息
   * @param student
   * @return
   */
  int updateStudentById(Student student);

  /**
   * 获取学生列表
   * @return
   */
   List<Student> getStudentList();

  /**
   * 根据学生的id查询学生的信息
   * @param studentId
   * @return
   */
  Student getStudentById(Integer studentId);




}
