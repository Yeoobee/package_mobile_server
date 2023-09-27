package com.ins.wms.dto;

import lombok.Data;

@Data
public class QMS_PROD_CHECK_ADD {
  private int  site_id;
  private String plan_no;
  private String data_list;
  private String user_code;
  private String result;
  private String msg;

}
