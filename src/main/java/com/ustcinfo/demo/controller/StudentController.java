package com.ustcinfo.demo.controller;

import com.ustcinfo.demo.config.Result;
import com.ustcinfo.demo.model.Student;
import com.ustcinfo.demo.service.StudentService;
import com.ustcinfo.demo.vo.StudentScoreVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangxl
 * @ClassName StudentController
 * @Description TODO
 * @date 2019/10/15 16:13
 */
@Api(tags = "学生接口")
@RequestMapping("studentApi")
@RestController
public class StudentController {

  @Resource
  private StudentService studentService;

  @ApiOperation("添加学生")
  @PostMapping("/insertStudent")
  public Result insertStudent(@RequestBody Student student) {
    int status =  studentService.insertStudent(student);
    if(status==1){
      return new Result(status,"添加成功");
    }else{
      return new Result(status,"添加失败");
    }

  }


  @ApiOperation("删除学生")
  @GetMapping("/deleteStudentById")
  public Result deleteStudentById(@RequestParam("studentId") Integer studentId) {
    int status = studentService.deleteStudentById(studentId);
    if(status==1){
      return new Result(status,"删除成功");
    }else{
      return new Result(status,"删除失败");
    }
  }


  @ApiOperation("修改学生")
  @PostMapping("/updateStudentById")
  public Result updateStudentById(@RequestBody Student student) {
    int status = studentService.updateStudentById(student);
    if(status==1){
      return new Result(status,"修改成功");
    }else{
      return new Result(status,"修改失败");
    }

  }


  @ApiOperation("获取学生")
  @GetMapping("/getStudentList")
  public Result getStudentList() {
    List<Student> list  = studentService.getStudentList();
    if(list.size()==0){
      return new Result(list,"无数据");
    }else{
      return new Result(list,"获取学生列表成功");
    }
  }


  @ApiOperation("根据Id获取学生")
  @GetMapping("/getStudentById")
  public Result getStudentById(@RequestParam("studentId") Integer studentId) {
    Student student = studentService.getStudentById(studentId);
    if(student==null){
      return new Result(student,"查询无果");
    }else{
      return new Result(student,"查询成功");
    }

  }


  @ApiOperation("根据id获取学生成绩相关信息")
  @GetMapping("/getStudentScoreById")
  public Result getStudentScore(@RequestParam("studentId") Integer studentId) {
    List<StudentScoreVo> list = studentService.getStudentScore(studentId);
    if (list.size() > 0) {
      return new Result(list, "查询成功");
    } else {
      return new Result(null, "无结果");
    }

  }


}
