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

  public List<QMS_PROC_ROUTE_CD_GET> qmsProcRouteCdGet(QMS_PROC_ROUTE_CD_GET p) {return WmsMapper.qmsProcRouteCdGet(p);
  }

  public List<QMS_PROC_ROUTE_CD_ADD> qmsProcRouteCdAdd(QMS_PROC_ROUTE_CD_ADD p) {return WmsMapper.qmsProcRouteCdAdd(p);
  }

  public List<WMS_LOT_TRACK_GET> wmsLotTrackGet(WMS_LOT_TRACK_GET p) {return WmsMapper.wmsLotTrackGet(p);
  }

  public List<PROC_CODE_GET> procCdGet(PROC_CODE_GET p) {return WmsMapper.procCdGet(p);
  }

  public List<POP_PROD_LIST_GET> popProdListGet(POP_PROD_LIST_GET p) {return WmsMapper.popProdListGet(p);
  }

  public List<MACHINE_TYPE_CODE_GET> machineTypeCdGet(MACHINE_TYPE_CODE_GET p) {return WmsMapper.machineTypeCdGet(p);
  }

  public List<POP_PROD_ADD> popProdAdd(POP_PROD_ADD p) {return WmsMapper.popProdAdd(p);
  }

  public List<POP_PROD_PROC_GET> popProdProcGet(POP_PROD_PROC_GET p) {return WmsMapper.popProdProcGet(p);
  }
}