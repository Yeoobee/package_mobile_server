package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_LOT_TRACK_GET {
  private String bcr_no;
  private String work_date;
  private String part_code;
  private String part_name;
  private int qty;
  private String lot_no;
  private Double spec;
  private Double unit_code;
  private Double unit_name;
  private Double reason_code;
  private Double reason_name;
}
