package com.ustcinfo.demo.vo;

import lombok.Data;

/**
 * @author wangxl
 * @ClassName StudentScoreVo
 * @Description TODO
 * @date 2019/11/4 16:57
 */
@Data
public class StudentScoreVo {

  private String name;
  private Integer age;
  private String sex;
  private String school;
  private String createTime;
  /**
   * 考试分数
   */
  private Integer score;

}
