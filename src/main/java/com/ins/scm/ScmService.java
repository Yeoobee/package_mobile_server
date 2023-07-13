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
}
