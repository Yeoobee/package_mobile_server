package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_QC_ADD {
  private int site_id;
  private String tr_no;
  private String remark;
  private String user_code;
  private String result;
  private String msg;

}
