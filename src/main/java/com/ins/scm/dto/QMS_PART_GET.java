package com.ins.scm.dto;

import lombok.Data;

@Data
public class QMS_PART_GET {
  private String part_code;
  private int seq;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private String result_type;
  private Double qc_spec1;
  private Double qc_spec2;
  private int qc_qty;

  private String val1;
  private String val2;
  private String val3;
  private String val4;
  private String val5;
  private String qc_result;
  private int site_id;
  private String tr_no;
  private double qc_value1;
  private double qc_value2;
  private double qc_value3;
  private double qc_value4;
  private double qc_value5;
  private String qc_result1;
  private String qc_result2;
  private String qc_result3;
  private String qc_result4;
  private String qc_result5;
}
