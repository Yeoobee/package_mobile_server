package com.ins.scm.dto;

import lombok.Data;

@Data
public class TRADING_GET {
  private String in_no;
  private int site_id;
  private String tr_no;
  private String ord_no;
  private String part_code;
  private String part_name;
  private int qty;
  private String spec;
  private String unit_code;
  private String unit_name;
  private String result;
  private String msg;
  private String qc_result;

}
