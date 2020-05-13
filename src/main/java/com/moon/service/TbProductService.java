package com.moon.service;

import com.moon.dao.TbProductMapper;
import com.moon.entity.TbProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TbProductService {
	@Autowired
	private TbProductMapper tbproductMapper;

	public TbProductMapper getTbProductMapper() {
		return tbproductMapper;
	}

	public List<TbProduct> showproduct(){
		List<TbProduct> product = tbproductMapper.selectAll();
		return product;
	}
	public TbProduct selectById(int id) {
		return tbproductMapper.selectByPrimaryKey(id);
	}

	public void updateImg(int id, String imgsrc) {
		TbProduct prod = new TbProduct();
		prod.setId(id);
		prod.setImg(imgsrc);
		tbproductMapper.updateByPrimaryKeySelective(prod);
	}
}