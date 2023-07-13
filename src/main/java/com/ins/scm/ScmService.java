package com.ins.scm;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ins.common.dto.Page;
import com.ins.mapper.scm.ScmMapper;
import com.ins.scm.dto.*;
import com.ins.wms.dto.REASON_CD_GET;

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
}
