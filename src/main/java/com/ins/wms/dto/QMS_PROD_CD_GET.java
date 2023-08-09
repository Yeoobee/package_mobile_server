package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROD_CD_GET {
  private String plan_no;
  private String part_code;
  private String prod_code;
  private int seq;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private String result_type;
  private String result_text;
  private double qc_spec1;
  private double qc_spec2;
  private String prod_type;

}
