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
}