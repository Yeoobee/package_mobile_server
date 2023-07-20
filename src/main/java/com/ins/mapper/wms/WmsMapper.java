package com.ins.mapper.wms;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.ins.common.dto.Message;
import com.ins.common.dto.Page;
import com.ins.wms.dto.*;

@Repository
public interface WmsMapper {

  List<QMS_PROC_ROUTE_CD_GET> qmsProcRouteCdGet(QMS_PROC_ROUTE_CD_GET p);
  List<QMS_PROC_ROUTE_CD_ADD> qmsProcRouteCdAdd(QMS_PROC_ROUTE_CD_ADD p);
  List<WMS_LOT_TRACK_GET> wmsLotTrackGet(WMS_LOT_TRACK_GET p);
  List<PROC_CODE_GET> procCdGet(PROC_CODE_GET p);
  List<POP_PROD_LIST_GET> popProdListGet(POP_PROD_LIST_GET p);
  List<MACHINE_TYPE_CODE_GET> machineTypeCdGet(MACHINE_TYPE_CODE_GET p);
  List<POP_PROD_ADD> popProdAdd(POP_PROD_ADD p);
  List<POP_PROD_PROC_GET> popProdProcGet(POP_PROD_PROC_GET p);


}
