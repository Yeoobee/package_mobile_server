package com.ins.scm;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.ins.scm.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ScmRestController {

  @Autowired
  private ScmService scmService;

  @RequestMapping(value = "/scmInGet", method = RequestMethod.POST)
  public List<SCM_IN> scmInGet(@RequestBody SCM_IN p) {
    return scmService.scmInGet(p);
  }

  @RequestMapping(value = "/scmInSubGet", method = RequestMethod.POST)
  public List<SCM_IN_SUB> scmInSubGet(@RequestBody SCM_IN_SUB p) {
    return scmService.scmInSubGet(p);
  }

  @RequestMapping(value = "/suppGet", method = RequestMethod.POST)
  public List<SUPP_GET> suppGet(@RequestBody SUPP_GET p) {
    return scmService.suppGet(p);
  }

  @RequestMapping(value = "/scmOutGet", method = RequestMethod.POST)
  public List<SCM_OUT_GET> scmOutGet(@RequestBody SCM_OUT_GET p) {
    return scmService.scmOutGet(p);
  }

  @RequestMapping(value = "/scmOutSubGet", method = RequestMethod.POST)
  public List<SCM_OUT_SUB_GET> scmOutGet(@RequestBody SCM_OUT_SUB_GET p) {
    return scmService.scmOutSubGet(p);
  }

  @RequestMapping(value = "/scmOutBcrAdd", method = RequestMethod.POST)
  public List<SCM_BCR_OUT_ADD> scmOutBcrAdd(@RequestBody SCM_BCR_OUT_ADD p) {
    return scmService.scmOutBcrAdd(p);
  }
  @RequestMapping(value = "/scmPartGet", method = RequestMethod.POST)
  public List<SCM_PART_GET> scmPartGet(@RequestBody SCM_PART_GET p) {
    return scmService.scmPartGet(p);
  }

  @RequestMapping(value = "/scmCargoGet", method = RequestMethod.POST)
  public List<SCM_CARGO_GET> scmCargoGet(@RequestBody SCM_CARGO_GET p) {
    return scmService.scmCargoGet(p);
  }
  @RequestMapping(value = "/scmOutBcrNonGet", method = RequestMethod.POST)
  public List<SCM_OUT_BCR_NON_GET> scmOutBcrNonGet(@RequestBody SCM_OUT_BCR_NON_GET p) {
    return scmService.scmOutBcrNonGet(p);
  }
  @RequestMapping(value = "/scmOutBcrNonAdd", method = RequestMethod.POST)
  public List<SCM_OUT_BCR_NON_ADD> scmOutBcrNonAdd(@RequestBody SCM_OUT_BCR_NON_ADD p) {
    return scmService.scmOutBcrNonAdd(p);
  }
  @RequestMapping(value = "/tradingGet", method = RequestMethod.POST)
  public List<TRADING_GET> tradingGet(@RequestBody TRADING_GET p) {
    return scmService.tradingGet(p);
  }
  @RequestMapping(value = "/qmsPartGet", method = RequestMethod.POST)
  public List<QMS_PART_GET> qmsPartGet(@RequestBody QMS_PART_GET p) {
    return scmService.qmsPartGet(p);
  }

  @RequestMapping(value = "/qmsRecvAdd", method = RequestMethod.POST)
  public List<QMS_RECV_ADD> qmsPartGet(@RequestBody QMS_RECV_ADD p) {
    return scmService.qmsRecvAdd(p);
  }
  @RequestMapping(value = "/scmQcAdd", method = RequestMethod.POST)
  public List<SCM_QC_ADD> scmQcAdd(@RequestBody SCM_QC_ADD p) {
    return scmService.scmQcAdd(p);
  }
  @RequestMapping(value = "/scmStockSetGet", method = RequestMethod.POST)
  public List<SCM_STOCK_SET_GET> scmStockSetGet(@RequestBody SCM_STOCK_SET_GET p) {
    return scmService.scmStockSetGet(p);
  }
  @RequestMapping(value = "/scmStockSetAdd", method = RequestMethod.POST)
  public List<SCM_STOCK_SET_ADD> scmStockSetAdd(@RequestBody SCM_STOCK_SET_ADD p) {
    return scmService.scmStockSetAdd(p);
  }

  @RequestMapping(value = "/scmStockSetReasonCdGet", method = RequestMethod.POST)
  public List<SCM_STOCK_SET_REASON_CD_GET> scmStockSetReasonCdGet(@RequestBody SCM_STOCK_SET_REASON_CD_GET p) {
    return scmService.scmStockSetReasonCdGet(p);
  }

}
