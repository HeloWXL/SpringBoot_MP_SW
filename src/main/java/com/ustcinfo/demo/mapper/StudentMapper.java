package com.ustcinfo.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ustcinfo.demo.model.Student;
import com.ustcinfo.demo.vo.StudentScoreVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

  @Select(" select * from student left join score on student.id = score.id where student.id = #{studentId}")
  List<StudentScoreVo> getStudentScore(@Param("studentId") int studentId);


}
