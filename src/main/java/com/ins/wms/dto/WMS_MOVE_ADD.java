package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_MOVE_ADD {
  private String result;
  private String msg;
  private String move_no;
  private String bcr_no;
  private int qty;
  private String car_name;
  private String my_name;
  private String alc_code;
  private String item_code;
}
