package org.selflearning.msa.service;

import org.selflearning.msa.dto.ResultDTO;

public interface OrderService {
	
	public ResultDTO getOrderbyUserId(String userId);
}
