package com.ustcinfo.demo.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.util.Date;

@Data
public class Score {

  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;
    private Integer studentId;
    private Integer score;
    private Date createTime;

}
