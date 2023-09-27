package com.ins.scm.dto;

import lombok.Data;

@Data
public class TRADING_GET {
  private String result;
  private String msg;
  private String tr_no;
  private String ord_no;
  private String part_code;
  private String part_name;
  private int qty;
  private int in_qty;
  private String lot_yn;
  private String lot_no;
  private String qc_type;
  private String spec;
  private String unit_code;
  private String unit_name;

  private String qc_result;
  private int site_id;

  private String supp_code;
  private String supp_name;
  private String work_date;
  private String type;
}
