package com.ins.scm.dto;

import lombok.Data;

@Data
public class SCM_CARGO_GET {
  private String cargo_code;
  private String cargo_name;
  private String cargo_code_to;
  private String cargo_name_next;
}
