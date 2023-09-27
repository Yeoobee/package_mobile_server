package com.ins.mapper.scm;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ins.scm.dto.*;

@Repository
public interface ScmMapper {
  List<SCM_IN> scmInGet(SCM_IN p);

  List<SCM_IN_SUB> scmInSubGet(SCM_IN_SUB p);

  List<SUPP_GET> suppGet(SUPP_GET p);

  List<SCM_OUT_GET> scmOutGet(SCM_OUT_GET p);
  List<SCM_OUT_SUB_GET> scmOutSubGet(SCM_OUT_SUB_GET p);

  List<SCM_BCR_OUT_ADD> scmOutBcrAdd(SCM_BCR_OUT_ADD p);

  List<SCM_PART_GET> scmPartGet(SCM_PART_GET p);

  List<SCM_CARGO_GET> scmCargoGet(SCM_CARGO_GET p);
  List<SCM_OUT_BCR_NON_GET> scmOutBcrNonGet(SCM_OUT_BCR_NON_GET p);
  List<SCM_OUT_BCR_NON_ADD> scmOutBcrNonAdd(SCM_OUT_BCR_NON_ADD p);
  List<TRADING_GET> tradingGet(TRADING_GET p);
  List<TRADING_GET> tradingGetAll(TRADING_GET p);
  List<TRADING_GET> tradingGetAll2(TRADING_GET p);
  List<TRADING_GET> tradingSubGetAll(TRADING_GET p);
  List<QMS_PART_GET> qmsPartGet(QMS_PART_GET p);
  List<QMS_RECV_ADD> qmsRecvAdd(QMS_RECV_ADD p);
  List<QMS_RECV_APPROVAL_GET> qmsRecvApprovalGet(QMS_RECV_APPROVAL_GET p);
  List<QMS_PART_GET> qmsRecvCdApprovalGet(QMS_PART_GET p);
  List<QMS_RECV_CHECK_GET> qmsRecvApprovalSubGet(QMS_RECV_CHECK_GET p);
  List<QMS_RECV_ADD> qmsRecvApprovalAdd(QMS_RECV_ADD p);
  List<TRADING_GET> scmInTradingGet(TRADING_GET p);
  List<SCM_IN> scmIn(SCM_IN p);
  List<BPART_GET> bpartTypeGet(BPART_GET p);
  List<SCM_OUT> scmOut(SCM_OUT p);
  List<QMS_RECV_ADD> qmsRecvComp(QMS_RECV_ADD p);
  List<SCM_QC_ADD> scmQcAdd(SCM_QC_ADD p);
  List<SCM_STOCK_SET_GET> scmStockSetGet(SCM_STOCK_SET_GET p);
  List<SCM_STOCK_SET_ADD> scmStockSetAdd(SCM_STOCK_SET_ADD p);
  List<SCM_STOCK_SET_REASON_CD_GET> scmStockSetReasonCdGet(SCM_STOCK_SET_REASON_CD_GET p);
}
