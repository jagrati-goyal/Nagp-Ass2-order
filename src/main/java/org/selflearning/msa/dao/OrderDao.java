package org.selflearning.msa.dao;

import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;

public interface OrderDao {

	public ResultDTO getOrderByUserid(String userId);
}
