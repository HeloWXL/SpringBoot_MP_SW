package com.ustcinfo.demo.config;

import lombok.Data;

/**
 * @author wangxl
 * @ClassName Result
 * @Description 返回值类型封装
 * @date 2019/10/15 16:31
 */
@Data
public class Result {
  private int code = 200;
  private String msg = "操作成功";
  private Object data;
  private int total;

  public Result(int code,String msg){
    this.code = code;
    this.msg = msg;
  }
  public Result(Object data){
    this.data = data;
  }
  public Result(Object data,String msg){
    this.data = data;
    this.msg = msg;
  }
}
