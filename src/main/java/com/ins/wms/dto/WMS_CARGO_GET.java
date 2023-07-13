package com.ins.wms.dto;

import lombok.Data;

@Data
public class WMS_CARGO_GET {
  private String cargo_code;
  private String cargo_name;
  private String cargo_code_to;
  private String cargo_name_to;
}
