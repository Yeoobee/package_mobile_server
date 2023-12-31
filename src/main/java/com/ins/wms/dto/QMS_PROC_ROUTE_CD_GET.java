package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROC_ROUTE_CD_GET {
  private int seq;
  private String proc_type;
  private String qc_item1;
  private String qc_item2;
  private String qc_item3;
  private String result_type;
  private Double qc_spec1;
  private Double qc_spec2;
  private Double qc_value_am;
  private Double qc_value_pm;
  private String qc_result_am;
  private String qc_result_pm;
  private String qc_result;
}
