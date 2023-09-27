package com.ins.scm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ins.mapper.scm.ScmMapper;
import com.ins.scm.dto.*;

@Service
public class ScmService {

  @Autowired
  private ScmMapper ScmMapper;




  public List<SCM_IN> scmInGet(SCM_IN p) {
    return ScmMapper.scmInGet(p);
  }

  public List<SCM_IN_SUB> scmInSubGet(SCM_IN_SUB p) {
    return ScmMapper.scmInSubGet(p);
  }

  public List<SUPP_GET> suppGet(SUPP_GET p) {
    return ScmMapper.suppGet(p);
  }

  public List<SCM_OUT_GET> scmOutGet(SCM_OUT_GET p) {
    return ScmMapper.scmOutGet(p);
  }

  public List<SCM_OUT_SUB_GET> scmOutSubGet(SCM_OUT_SUB_GET p) {
    return ScmMapper.scmOutSubGet(p);
  }

    public List<SCM_BCR_OUT_ADD> scmOutBcrAdd(SCM_BCR_OUT_ADD p) {
      return ScmMapper.scmOutBcrAdd(p);
    }

  public List<SCM_PART_GET> scmPartGet(SCM_PART_GET p) {
    return ScmMapper.scmPartGet(p);
  }

  public List<SCM_CARGO_GET> scmCargoGet(SCM_CARGO_GET p) { return ScmMapper.scmCargoGet(p);
  }

  public List<SCM_OUT_BCR_NON_GET> scmOutBcrNonGet(SCM_OUT_BCR_NON_GET p) {return ScmMapper.scmOutBcrNonGet(p);
  }

  public List<SCM_OUT_BCR_NON_ADD> scmOutBcrNonAdd(SCM_OUT_BCR_NON_ADD p) {return ScmMapper.scmOutBcrNonAdd(p);
  }

  public List<TRADING_GET> tradingGet(TRADING_GET p) {return ScmMapper.tradingGet(p);
  }

  public List<QMS_PART_GET> qmsPartGet(QMS_PART_GET p) {return ScmMapper.qmsPartGet(p);
  }

  public List<QMS_RECV_ADD> qmsRecvAdd(QMS_RECV_ADD p) {return ScmMapper.qmsRecvAdd(p);
  }

  public List<SCM_QC_ADD> scmQcAdd(SCM_QC_ADD p) {return ScmMapper.scmQcAdd(p);
  }

  public List<SCM_STOCK_SET_GET> scmStockSetGet(SCM_STOCK_SET_GET p) {return ScmMapper.scmStockSetGet(p);
  }

  public List<SCM_STOCK_SET_ADD> scmStockSetAdd(SCM_STOCK_SET_ADD p) {return ScmMapper.scmStockSetAdd(p);
  }

  public List<SCM_STOCK_SET_REASON_CD_GET> scmStockSetReasonCdGet(SCM_STOCK_SET_REASON_CD_GET p) {return ScmMapper.scmStockSetReasonCdGet(p);
  }

    public List<TRADING_GET> tradingGetAll(TRADING_GET p) {return ScmMapper.tradingGetAll(p);
    }

  public List<TRADING_GET> tradingSubGetAll(TRADING_GET p) {return ScmMapper.tradingSubGetAll(p);
  }

  public List<TRADING_GET> tradingGetAll2(TRADING_GET p) {return ScmMapper.tradingGetAll2(p);
  }

  public List<QMS_RECV_APPROVAL_GET> qmsRecvApprovalGet(QMS_RECV_APPROVAL_GET p) {return ScmMapper.qmsRecvApprovalGet(p);
  }

  public List<QMS_PART_GET> qmsRecvCdApprovalGet(QMS_PART_GET p) {return ScmMapper.qmsRecvCdApprovalGet(p);
  }

  public List<QMS_RECV_CHECK_GET> qmsRecvApprovalSubGet(QMS_RECV_CHECK_GET p) {return ScmMapper.qmsRecvApprovalSubGet(p);
  }

  public List<QMS_RECV_ADD> qmsRecvApprovalAdd(QMS_RECV_ADD p) {return ScmMapper.qmsRecvApprovalAdd(p);
  }

  public List<TRADING_GET> scmInTradingGet(TRADING_GET p) {return ScmMapper.scmInTradingGet(p);
  }

  public List<SCM_IN> scmIn(SCM_IN p) {return ScmMapper.scmIn(p);
  }

  public List<BPART_GET> bpartTypeGet(BPART_GET p) {return ScmMapper.bpartTypeGet(p);
  }

  public List<SCM_OUT> scmOut(SCM_OUT p) {return ScmMapper.scmOut(p);
  }

  public List<QMS_RECV_ADD> qmsRecvComp(QMS_RECV_ADD p) {return ScmMapper.qmsRecvComp(p);
  }
}
