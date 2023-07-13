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

  public List<WMS_PLAN_GET> wmsPlanGet(Page p) {
    return WmsMapper.wmsPlanGet(p);
  }

  public List<WMS_BOX_ADD> wmsBoxAdd(Page p) {
    return WmsMapper.wmsBoxAdd(p);
  }

  public List<WMS_BCR_ADD> wmsBcrAdd(Page p) {
    return WmsMapper.wmsBcrAdd(p);
  }

  public List<WMS_IN_ADD> wmsInAdd(Page p) {
    return WmsMapper.wmsInAdd(p);
  }

  public List<WMS_OUT_ORD_GET> wmsOutOrdGet(Page p) {
    return WmsMapper.wmsOutOrdGet(p);
  }

  public List<WMS_OUT_ADD> wmsOutAdd(Page p) {
    return WmsMapper.wmsOutAdd(p);
  }

  public List<WMS_OUT_CANCEL> wmsOutCancel(Page p) {
    return WmsMapper.wmsOutCancel(p);
  }

  public List<WMS_CARGO_GET> wmsCargoGet(Page p) {
    return WmsMapper.wmsCargoGet(p);
  }

  public List<WMS_MOVE_ADD> wmsMoveAdd(Page p) {
    return WmsMapper.wmsMoveAdd(p);
  }

  public List<WMS_MOVE_IO_ADD> wmsMoveIoAdd(Page p) {
    return WmsMapper.wmsMoveIoAdd(p);
  }

  public List<WMS_QC_ADD> wmsQcAdd(Page p) {
    return WmsMapper.wmsQcAdd(p);
  }

  public List<WMS_QC_PROD_ADD> wmsQcProdAdd(Page p) {
    return WmsMapper.wmsQcProdAdd(p);
  }

  public List<WMS_NG_LIST_GET> wmsNgListGet(Page p) {
    return WmsMapper.wmsNgListGet(p);
  }



}