package com.ins.scm;

import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;

import com.ins.common.dto.Message;
import com.ins.common.dto.Page;
import com.ins.scm.dto.*;
import com.ins.wms.dto.REASON_CD_GET;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

}
