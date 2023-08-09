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

  @RequestMapping(value = "/wmsLotTrackGet", method = RequestMethod.POST)
  public List<WMS_LOT_TRACK_GET> wmsLotTrackGet(@RequestBody WMS_LOT_TRACK_GET p) {
    return wmsService.wmsLotTrackGet(p);
  }

  @RequestMapping(value = "/procCdGet", method = RequestMethod.POST)
  public List<PROC_CODE_GET> procCdGet(@RequestBody PROC_CODE_GET p) {
    return wmsService.procCdGet(p);
  }
  @RequestMapping(value = "/popProdListGet", method = RequestMethod.POST)
  public List<POP_PROD_LIST_GET> popProdListGet(@RequestBody POP_PROD_LIST_GET p) {
    return wmsService.popProdListGet(p);}

  @RequestMapping(value = "/machineTypeCdGet", method = RequestMethod.POST)
  public List<MACHINE_TYPE_CODE_GET> machineTypeCdGet(@RequestBody MACHINE_TYPE_CODE_GET p) {
    return wmsService.machineTypeCdGet(p);
  }

  @RequestMapping(value = "/popProdAdd", method = RequestMethod.POST)
  public List<POP_PROD_ADD> popProdAdd(@RequestBody POP_PROD_ADD p) {
    return wmsService.popProdAdd(p);
  }
  @RequestMapping(value = "/popProdProcGet", method = RequestMethod.POST)
  public List<POP_PROD_PROC_GET> popProdProcGet(@RequestBody POP_PROD_PROC_GET p) {
    return wmsService.popProdProcGet(p);
  }
  @RequestMapping(value = "/qmsProdCheckGet", method = RequestMethod.POST)
  public List<QMS_PROD_CHECK_GET> qmsProdCheckGet(@RequestBody QMS_PROD_CHECK_GET p) {
    return wmsService.qmsProdCheckGet(p);
  }
  @RequestMapping(value = "/qmsProdCdGet", method = RequestMethod.POST)
  public List<QMS_PROD_CD_GET> qmsProdCdGet(@RequestBody QMS_PROD_CD_GET p) {
    return wmsService.qmsProdCdGet(p);
  }
  @RequestMapping(value = "/qmsProdCheckAdd", method = RequestMethod.POST)
  public List<QMS_PROD_CHECK_ADD> qmsProdCheckAdd(@RequestBody QMS_PROD_CHECK_ADD p) {
    return wmsService.qmsProdCheckAdd(p);
  }



}
