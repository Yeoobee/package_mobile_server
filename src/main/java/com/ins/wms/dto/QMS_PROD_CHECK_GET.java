package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROD_CHECK_GET {
  private String plan_no;
  private String proc_code;
  private String work_date;
  private String part_code;
  private String part_name;
  private int qty;

}
