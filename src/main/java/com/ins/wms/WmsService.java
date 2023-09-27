package com.ins.wms;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ins.common.dto.Page;
import com.ins.mapper.wms.WmsMapper;
import com.ins.wms.dto.*;

@Service
public class WmsService {

  @Autowired
  private WmsMapper WmsMapper;

  public List<LINE_CD> lineCdGet(LINE_CD p) {return WmsMapper.lineCdGet(p);
  }

  public List<POP_PROD_LIST_GET> prodListGet(POP_PROD_LIST_GET p) {return WmsMapper.prodListGet(p);
  }

  public List<POP_PROD_ADD> prodStart(POP_PROD_ADD p) {return WmsMapper.prodStart(p);
  }


  public List<MACHINE_CODE_GET> machineGet(MACHINE_CODE_GET p) {return WmsMapper.machineGet(p);
  }

  public List<POP_PROD_ADD> prodAdd(POP_PROD_ADD p) {return WmsMapper.prodAdd(p);
  }

  public List<POP_PART_BPART> partBpartGet(POP_PART_BPART p) {return WmsMapper.partBpartGet(p);
  }

  public List<POP_PROD_SCM_STOCK> prodScmStockGet(POP_PROD_SCM_STOCK p) {return WmsMapper.prodScmStockGet(p);
  }

  public List<POP_PROD_SCM_STOCK> prodScmStockLotGet(POP_PROD_SCM_STOCK p) {return WmsMapper.prodScmStockLotGet(p);
  }

  public List<POP_PROD_BPART_BCR> prodBpartBcrGet(POP_PROD_BPART_BCR p) {return WmsMapper.prodBpartBcrGet(p);
  }

  public List<POP_PROD_BPART_BCR> prodBpartBcrAdd(POP_PROD_BPART_BCR p) {return WmsMapper.prodBpartBcrAdd(p);
  }

  public List<POP_PART_BPART> prodBpartGet(POP_PART_BPART p) {return WmsMapper.prodBpartGet(p);
  }

  public List<POP_PROD_BPART_BCR> prodBpartCancel(POP_PROD_BPART_BCR p) {return WmsMapper.prodBpartCancel(p);
  }

  public List<POP_PROD_BPART_ADD> prodBpartAdd(POP_PROD_BPART_ADD p) {return WmsMapper.prodBpartAdd(p);
  }

  public List<QMS_PROC_CHECK> procCheckGet(QMS_PROC_CHECK p) {return WmsMapper.procCheckGet(p);
  }

  public List<PROC_OUTS> outsGet(PROC_OUTS p) {return WmsMapper.outsGet(p);
  }

  public List<PROC_OUTS> outsAdd(PROC_OUTS p) {return WmsMapper.outsAdd(p);
  }

  public List<POP_PROD_PROC_GET> prodProcGet(POP_PROD_PROC_GET p) {return WmsMapper.prodProcGet(p);
  }

  public List<POP_PROD_PROC_ADD> prodProcAdd(POP_PROD_PROC_ADD p) {return WmsMapper.prodProcAdd(p);
  }

  public List<POP_PROD_PROC_APPROVAL> prodProcApprovalGet(POP_PROD_PROC_APPROVAL p) {return WmsMapper.prodProcApprovalGet(p);
  }

  public List<POP_PROD_PROC_APPROVAL_SUB> prodProcApprovalSubGet(POP_PROD_PROC_APPROVAL_SUB p) {return WmsMapper.prodProcApprovalSubGet(p);
  }

  public List<POP_PROD_PROC_APPROVAL> prodProcApprovalAdd(POP_PROD_PROC_APPROVAL p) {return WmsMapper.prodProcApprovalAdd(p);
  }

  public List<QMS_PROD_CHECK_GET> prodCheckGet(QMS_PROD_CHECK_GET p) {return WmsMapper.prodCheckGet(p);
  }

  public List<PROC_OUTS> outsInGet(PROC_OUTS p) {return WmsMapper.outsInGet(p);
  }

  public List<PROC_OUTS> outsInAdd(PROC_OUTS p) {return WmsMapper.outsInAdd(p);
  }

  public List<QMS_PROD_CD_GET> prodCheckCdGet(QMS_PROD_CD_GET p) {return WmsMapper.prodCheckCdGet(p);
  }

  public List<QMS_PROD_CHECK_ADD> prodCheckAdd(QMS_PROD_CHECK_ADD p) {return WmsMapper.prodCheckAdd(p);
  }

  public List<QMS_PROD_APPROVAL> prodApprovalGet(QMS_PROD_APPROVAL p) {return WmsMapper.prodApprovalGet(p);
  }

  public List<QMS_PROD_APPROVAL> prodApprovalAdd(QMS_PROD_APPROVAL p) {return WmsMapper.prodApprovalAdd(p);
  }

  public List<WMS_OUT_ORD_GET> wmsOutOrdGet(WMS_OUT_ORD_GET p) {return WmsMapper.wmsOutOrdGet(p);
  }
}