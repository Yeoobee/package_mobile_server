package com.ins.wms.dto;

import lombok.Data;

@Data
public class POP_PROD_PROC_GET {
  private int  site_id;
  private String plan_no;
  private String line_code;
  private String user_code;
  private int seq;
  private int show_seq;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private String result_type;
  private String calc_text;
  private double qc_spec1;
  private double qc_spec2;
  private double qc_value1;
  private double qc_value2;
  private double qc_value3;
  private String qc_result1;
  private String qc_result2;
  private String qc_result3;
  private String qc_result;



}
