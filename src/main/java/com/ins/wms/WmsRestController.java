package com.ins.wms;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.ins.common.dto.Page;
import com.ins.wms.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WmsRestController {

  @Autowired
  private WmsService wmsService;

  @RequestMapping(value = "/wmsPlanGet", method = RequestMethod.POST)
  public List<WMS_PLAN_GET> wmsPlanGet(@RequestBody Page p) {
    return wmsService.wmsPlanGet(p);
  }



}
