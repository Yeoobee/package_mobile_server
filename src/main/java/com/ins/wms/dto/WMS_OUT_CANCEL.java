package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_OUT_CANCEL {
  private String result;
  private String msg;
  private String box_no;
  private int box_qty;
  private String car_name;
  private String my_name;
  private String alc_code;
  private String item_code;
  private String part_name;
}
