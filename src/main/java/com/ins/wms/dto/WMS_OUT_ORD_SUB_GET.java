package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_OUT_ORD_SUB_GET {
  private String req_no;
  private String ord_no;
  private String part_code;
  private String part_name;
  private String spec;
  private int qty;
  private int out_qty;
  private String ord_type;

}
