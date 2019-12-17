package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.ShowShoppingCarMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.ShowShoppingCarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowShoppingCarServiceImpl implements ShowShoppingCarService {
	@Autowired ShowShoppingCarMapper showshoppingcarmapper;
	public List<Goods> selectGoodsInCarByUserid(int user_id) {
		return showshoppingcarmapper.selectGoodsInCarByUserid(user_id);
	}
}
