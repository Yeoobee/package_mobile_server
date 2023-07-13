package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_PLAN_GET {
  private String plan_no;
  private String item_code;
  private int plan_qty;
  private int box_usage;
  private String car_name;
  private String part_type;
  private String my_name;
  private String remark;
}
