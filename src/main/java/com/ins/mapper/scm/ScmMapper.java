package com.ins.mapper.scm;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ins.common.dto.Message;
import com.ins.common.dto.Page;
import com.ins.scm.dto.*;
import com.ins.wms.dto.REASON_CD_GET;

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
}
