package com.ins.mapper.wms;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ins.common.dto.Message;
import com.ins.common.dto.Page;
import com.ins.wms.dto.*;

@Repository
public interface WmsMapper {

  List<WMS_PLAN_GET> wmsPlanGet(Page p);

  List<WMS_BOX_ADD> wmsBoxAdd(Page p);

  List<WMS_BCR_ADD> wmsBcrAdd(Page p);

  List<WMS_IN_ADD> wmsInAdd(Page p);

  List<WMS_OUT_ORD_GET> wmsOutOrdGet(Page p);

  List<WMS_OUT_ADD> wmsOutAdd(Page p);

  List<WMS_OUT_CANCEL> wmsOutCancel(Page p);

  List<WMS_CARGO_GET> wmsCargoGet(Page p);

  List<WMS_MOVE_ADD> wmsMoveAdd(Page p);

  List<WMS_MOVE_IO_ADD> wmsMoveIoAdd(Page p);

  List<WMS_QC_ADD> wmsQcAdd(Page p);

  List<WMS_QC_PROD_ADD> wmsQcProdAdd(Page p);

  List<WMS_NG_LIST_GET> wmsNgListGet(Page p);


List<WMS_BOX_ADD2> wmsBoxAdd2(Page p);

List<WMS_QC_ADD> wmsQcAdd2(Page p);

List<WMS_OUT_ORD_SUB_GET> wmsOutOrdSubGet(Page p);

List<WMS_BCR_GET> wmsBcrGet(Page p);

List<WMS_BOX_STATUS_GET> wmsBoxStatusGet(Page p);

List<WMS_OUT_ADD> wmsOutAdd2(Page p);


  List<WMS_BOX_STOCK_GET> wmsBoxStock(Page p);

  List<WMS_BOX_STOCK_GET> wmsBoxStockAdd(Page p);
}
