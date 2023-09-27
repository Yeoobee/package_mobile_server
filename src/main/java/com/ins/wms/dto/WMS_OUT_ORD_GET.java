package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_OUT_ORD_GET {
  private int site_id;
  private String req_no;
  private String ord_no;
  private String place_name;
  private String supp_name;
  private String remark;
}
