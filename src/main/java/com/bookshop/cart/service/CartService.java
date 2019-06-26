package com.bookshop.cart.service;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bookshop.cart.vo.CartVO;
import com.bookshop.goods.vo.GoodsVO;

public interface CartService {
	public Map<String ,List> myCartList(CartVO cartVO) throws Exception;
	public boolean findCartGoods(CartVO cartVO) throws Exception;
	public void addGoodsInCart(CartVO cartVO) throws Exception;
	public boolean modifyCartQty(CartVO cartVO) throws Exception;
	public void removeCartGoods(int cart_id) throws Exception;
}
