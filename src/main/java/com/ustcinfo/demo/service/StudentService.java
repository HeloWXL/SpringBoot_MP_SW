package com.ustcinfo.demo.service;

import com.ustcinfo.demo.model.Student;
import com.ustcinfo.demo.vo.StudentScoreVo;

import java.util.List;

public interface StudentService {

  /**
   * 添加学生
   *
   * @param student
   * @return
   */
  int insertStudent(Student student);


  /**
   * 删除学生信息
   *
   * @param studentId
   * @return
   */
  int deleteStudentById(Integer studentId);


  /**
   * 修改学生信息
   *
   * @param student
   * @return
   */
  int updateStudentById(Student student);


  /**
   * 获取学生列表
   *
   * @return
   */
  List<Student> getStudentList();


  /**
   * 根据学生的id查询学生的信息
   *
   * @param studentId
   * @return
   */
  Student getStudentById(Integer studentId);


  /**
   * 条件查询学生
   * @param sName,sSex
   * @return
   */
  List<Student> getStudentList(String sName, String sSex);


  /**
   * 根据学生的id查询学生的成绩相关信息
   * @param studentId
   * @return
   */
  List<StudentScoreVo> getStudentScore(int studentId);


}
