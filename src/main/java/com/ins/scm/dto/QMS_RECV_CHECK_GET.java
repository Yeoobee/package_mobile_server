package com.ins.scm.dto;

import lombok.Data;

@Data
public class QMS_RECV_CHECK_GET {
  private int site_id;
  private int seq;
  private String qc_no;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private String result_type;
  private double qc_spec1;
  private double qc_spec2;
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
  private String qc_result;
  private String part_code;
  private double qc_qty;

}
