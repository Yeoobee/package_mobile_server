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

  @RequestMapping(value = "/qmsProcRouteCdGet", method = RequestMethod.POST)
  public List<QMS_PROC_ROUTE_CD_GET> qmsProcRouteCdGet(@RequestBody QMS_PROC_ROUTE_CD_GET p) {
    return wmsService.qmsProcRouteCdGet(p);
  }

  @RequestMapping(value = "/qmsProcRouteCdAdd", method = RequestMethod.POST)
  public List<QMS_PROC_ROUTE_CD_ADD> qmsProcRouteCdAdd(@RequestBody QMS_PROC_ROUTE_CD_ADD p) {
    return wmsService.qmsProcRouteCdAdd(p);
  }



}
