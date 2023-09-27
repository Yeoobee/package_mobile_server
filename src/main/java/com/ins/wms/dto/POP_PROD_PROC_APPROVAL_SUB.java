package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_PROC_APPROVAL_SUB {
  private int  site_id;
  private String qc_no;
  private int show_seq;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private double qc_value1;
  private double qc_value2;
  private double qc_value3;
  private String qc_result1;
  private String qc_result2;
  private String qc_result3;
  private String qc_result;



}
