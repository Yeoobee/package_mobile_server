package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_STOCK_SET_GET {
  private String req_no;
  private String cargo_code;
  private String start_date;
  private String stop_date;
  private String remark;
  private String cargo_name;
}
