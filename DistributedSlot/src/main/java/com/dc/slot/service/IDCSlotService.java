package com.dc.slot.service;

import java.util.List;

import com.dc.slot.dto.DCSlotDTO;
import com.dc.slot.exception.DCSlotException;

public interface IDCSlotService {

	DCSlotDTO addDCSlot(DCSlotDTO dcSlotDTO) throws DCSlotException;

	List<DCSlotDTO> getAllDCSlots();

	DCSlotDTO searchDCSlotById(Integer dcSlotId);

	DCSlotDTO deleteDCSlotById(Integer dcSlotId);

	List<DCSlotDTO> deleteAllDCSlots();

	DCSlotDTO updateDCSlot(DCSlotDTO dcSlotDTO) throws DCSlotException;

}
