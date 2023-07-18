package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_STOCK_SET_ADD {
  private String bcr_no;
  private int qty;
  private String reason_code;
  private String user_code;
  private String result;
  private String msg;

}
