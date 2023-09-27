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

  @RequestMapping(value = "/lineCdGet", method = RequestMethod.POST)
  public List<LINE_CD> lineCdGet(@RequestBody LINE_CD p) {
    return wmsService.lineCdGet(p);
  }
  @RequestMapping(value = "/prodListGet", method = RequestMethod.POST)
  public List<POP_PROD_LIST_GET> prodListGet(@RequestBody POP_PROD_LIST_GET p) {
    return wmsService.prodListGet(p);
  }
  @RequestMapping(value = "/prodStart", method = RequestMethod.POST)
  public List<POP_PROD_ADD> prodStart(@RequestBody POP_PROD_ADD p) {
    return wmsService.prodStart(p);
  }

  @RequestMapping(value = "/machineGet", method = RequestMethod.POST)
  public List<MACHINE_CODE_GET> machineGet(@RequestBody MACHINE_CODE_GET p) {
    return wmsService.machineGet(p);
  }
  @RequestMapping(value = "/prodAdd", method = RequestMethod.POST)
  public List<POP_PROD_ADD> prodAdd(@RequestBody POP_PROD_ADD p) {
    return wmsService.prodAdd(p);
  }
  @RequestMapping(value = "/partBpartGet", method = RequestMethod.POST)
  public List<POP_PART_BPART> partBpartGet(@RequestBody POP_PART_BPART p) {
    return wmsService.partBpartGet(p);
  }
  @RequestMapping(value = "/prodScmStockGet", method = RequestMethod.POST)
  public List<POP_PROD_SCM_STOCK> prodScmStockGet(@RequestBody POP_PROD_SCM_STOCK p) {
    return wmsService.prodScmStockGet(p);
  }
  @RequestMapping(value = "/prodScmStockLotGet", method = RequestMethod.POST)
  public List<POP_PROD_SCM_STOCK> prodScmStockLotGet(@RequestBody POP_PROD_SCM_STOCK p) {
    return wmsService.prodScmStockLotGet(p);
  }
  @RequestMapping(value = "/prodBpartBcrGet", method = RequestMethod.POST)
  public List<POP_PROD_BPART_BCR> prodBpartBcrGet(@RequestBody POP_PROD_BPART_BCR p) {
    return wmsService.prodBpartBcrGet(p);
  }
  @RequestMapping(value = "/prodBpartBcrAdd", method = RequestMethod.POST)
  public List<POP_PROD_BPART_BCR> prodBpartBcrAdd(@RequestBody POP_PROD_BPART_BCR p) {
    return wmsService.prodBpartBcrAdd(p);
  }
  @RequestMapping(value = "/prodBpartGet", method = RequestMethod.POST)
  public List<POP_PART_BPART> prodBpartGet(@RequestBody POP_PART_BPART p) {
    return wmsService.prodBpartGet(p);
  }
  @RequestMapping(value = "/prodBpartCancel", method = RequestMethod.POST)
  public List<POP_PROD_BPART_BCR> prodBpartCancel(@RequestBody POP_PROD_BPART_BCR p) {
    return wmsService.prodBpartCancel(p);
  }
  @RequestMapping(value = "/prodBpartAdd", method = RequestMethod.POST)
  public List<POP_PROD_BPART_ADD> prodBpartAdd(@RequestBody POP_PROD_BPART_ADD p) {
    return wmsService.prodBpartAdd(p);
  }
  @RequestMapping(value = "/procCheckGet", method = RequestMethod.POST)
  public List<QMS_PROC_CHECK> procCheckGet(@RequestBody QMS_PROC_CHECK p) {
    return wmsService.procCheckGet(p);
  }
  @RequestMapping(value = "/outsGet", method = RequestMethod.POST)
  public List<PROC_OUTS> outsGet(@RequestBody PROC_OUTS p) {
    return wmsService.outsGet(p);
  }
  @RequestMapping(value = "/outsAdd", method = RequestMethod.POST)
  public List<PROC_OUTS> outsAdd(@RequestBody PROC_OUTS p) {
    return wmsService.outsAdd(p);
  }
  @RequestMapping(value = "/prodProcGet", method = RequestMethod.POST)
  public List<POP_PROD_PROC_GET> prodProcGet(@RequestBody POP_PROD_PROC_GET p) {
    return wmsService.prodProcGet(p);
  }
  @RequestMapping(value = "/prodProcAdd", method = RequestMethod.POST)
  public List<POP_PROD_PROC_ADD> prodProcAdd(@RequestBody POP_PROD_PROC_ADD p) {
    return wmsService.prodProcAdd(p);
  }
  @RequestMapping(value = "/prodProcApprovalGet", method = RequestMethod.POST)
  public List<POP_PROD_PROC_APPROVAL> prodProcApprovalGet(@RequestBody POP_PROD_PROC_APPROVAL p) {
    return wmsService.prodProcApprovalGet(p);
  }
  @RequestMapping(value = "/prodProcApprovalSubGet", method = RequestMethod.POST)
  public List<POP_PROD_PROC_APPROVAL_SUB> prodProcApprovalSubGet(@RequestBody POP_PROD_PROC_APPROVAL_SUB p) {
    return wmsService.prodProcApprovalSubGet(p);
  }
  @RequestMapping(value = "/prodProcApprovalAdd", method = RequestMethod.POST)
  public List<POP_PROD_PROC_APPROVAL> prodProcApprovalAdd(@RequestBody POP_PROD_PROC_APPROVAL p) {
    return wmsService.prodProcApprovalAdd(p);
  }
  @RequestMapping(value = "/prodCheckGet", method = RequestMethod.POST)
  public List<QMS_PROD_CHECK_GET> prodCheckGet(@RequestBody QMS_PROD_CHECK_GET p) {
    return wmsService.prodCheckGet(p);
  }
  @RequestMapping(value = "/outsInGet", method = RequestMethod.POST)
  public List<PROC_OUTS> outsInGet(@RequestBody PROC_OUTS p) {
    return wmsService.outsInGet(p);
  }
  @RequestMapping(value = "/outsInAdd", method = RequestMethod.POST)
  public List<PROC_OUTS> outsInAdd(@RequestBody PROC_OUTS p) {
    return wmsService.outsInAdd(p);
  }
  @RequestMapping(value = "/prodCheckCdGet", method = RequestMethod.POST)
  public List<QMS_PROD_CD_GET> prodCheckCdGet(@RequestBody QMS_PROD_CD_GET p) {
    return wmsService.prodCheckCdGet(p);
  }
  @RequestMapping(value = "/prodCheckAdd", method = RequestMethod.POST)
  public List<QMS_PROD_CHECK_ADD> prodCheckAdd(@RequestBody QMS_PROD_CHECK_ADD p) {
    return wmsService.prodCheckAdd(p);
  }
  @RequestMapping(value = "/prodApprovalGet", method = RequestMethod.POST)
  public List<QMS_PROD_APPROVAL> prodApprovalGet(@RequestBody QMS_PROD_APPROVAL p) {
    return wmsService.prodApprovalGet(p);
  }
  @RequestMapping(value = "/prodApprovalAdd", method = RequestMethod.POST)
  public List<QMS_PROD_APPROVAL> prodApprovalAdd(@RequestBody QMS_PROD_APPROVAL p) {
    return wmsService.prodApprovalAdd(p);
  }
  @RequestMapping(value = "/wmsOutOrdGet", method = RequestMethod.POST)
  public List<WMS_OUT_ORD_GET> wmsOutOrdGet(@RequestBody WMS_OUT_ORD_GET p) {
    return wmsService.wmsOutOrdGet(p);
  }


}
