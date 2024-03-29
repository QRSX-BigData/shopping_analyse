package com.bigdata.shopping_analyse.service.Impl;

import com.bigdata.shopping_analyse.mapper.ShowShoppingCarMapper;
import com.bigdata.shopping_analyse.pojo.Goods;
import com.bigdata.shopping_analyse.service.ShowShoppingCarService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 购物车展示实现层
 * @author kingz
 *
 */
@Service
@Slf4j
public class ShowShoppingCarServiceImpl implements ShowShoppingCarService {
	@Autowired ShowShoppingCarMapper showshoppingcarmapper;
	public List<Goods> selectGoodsInCarByUserid(int userid) {
		log.warn(0+ " " +6+" "+ userid + " " + 0 + " " + 2 +" "+0);
		return showshoppingcarmapper.selectGoodsInCarByUserid(userid);
	}
}
