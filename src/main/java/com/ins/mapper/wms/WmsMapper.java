package com.ins.mapper.wms;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ins.common.dto.Message;
import com.ins.common.dto.Page;
import com.ins.wms.dto.*;

@Repository
public interface WmsMapper {

  List<LINE_CD> lineCdGet(LINE_CD p);
  List<POP_PROD_LIST_GET> prodListGet(POP_PROD_LIST_GET p);
  List<POP_PROD_ADD> prodStart(POP_PROD_ADD p);
  List<MACHINE_CODE_GET> machineGet(MACHINE_CODE_GET p);
  List<POP_PROD_ADD> prodAdd(POP_PROD_ADD p);
  List<POP_PART_BPART> partBpartGet(POP_PART_BPART p);
  List<POP_PROD_SCM_STOCK> prodScmStockGet(POP_PROD_SCM_STOCK p);
  List<POP_PROD_SCM_STOCK> prodScmStockLotGet(POP_PROD_SCM_STOCK p);
  List<POP_PROD_BPART_BCR> prodBpartBcrGet(POP_PROD_BPART_BCR p);
  List<POP_PROD_BPART_BCR> prodBpartBcrAdd(POP_PROD_BPART_BCR p);
  List<POP_PART_BPART> prodBpartGet(POP_PART_BPART p);
  List<POP_PROD_BPART_BCR> prodBpartCancel(POP_PROD_BPART_BCR p);
  List<POP_PROD_BPART_ADD> prodBpartAdd(POP_PROD_BPART_ADD p);
  List<QMS_PROC_CHECK> procCheckGet(QMS_PROC_CHECK p);
  List<PROC_OUTS> outsGet(PROC_OUTS p);
  List<PROC_OUTS> outsAdd(PROC_OUTS p);
  List<POP_PROD_PROC_GET> prodProcGet(POP_PROD_PROC_GET p);
  List<POP_PROD_PROC_ADD> prodProcAdd(POP_PROD_PROC_ADD p);
  List<POP_PROD_PROC_APPROVAL> prodProcApprovalGet(POP_PROD_PROC_APPROVAL p);
  List<POP_PROD_PROC_APPROVAL_SUB> prodProcApprovalSubGet(POP_PROD_PROC_APPROVAL_SUB p);
  List<POP_PROD_PROC_APPROVAL> prodProcApprovalAdd(POP_PROD_PROC_APPROVAL p);
  List<QMS_PROD_CHECK_GET> prodCheckGet(QMS_PROD_CHECK_GET p);
  List<PROC_OUTS> outsInGet(PROC_OUTS p);
  List<PROC_OUTS> outsInAdd(PROC_OUTS p);
  List<QMS_PROD_CD_GET> prodCheckCdGet(QMS_PROD_CD_GET p);
  List<QMS_PROD_CHECK_ADD> prodCheckAdd(QMS_PROD_CHECK_ADD p);
  List<QMS_PROD_APPROVAL> prodApprovalGet(QMS_PROD_APPROVAL p);
  List<QMS_PROD_APPROVAL> prodApprovalAdd(QMS_PROD_APPROVAL p);
  List<WMS_OUT_ORD_GET> wmsOutOrdGet(WMS_OUT_ORD_GET p);


}
