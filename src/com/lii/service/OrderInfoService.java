package com.lii.service;

import java.util.List;

import com.lii.entity.OrderDetail;
import com.lii.entity.OrderInfo;

public interface OrderInfoService {
	public List<OrderInfo> getAllOrderInfoByPage(int pageIndex, int pageSize, OrderInfo oi);
	public OrderInfo getOrderInfoById(int id);
	public int getTotalPages(int pageSize, OrderInfo oi);
	public int getTotalCount(OrderInfo oi);
	public int addOrder(OrderInfo oi);
	public int deleteOrder(String oids);
	public List<OrderDetail> getOrderDetailByOid(int oid);
	public int modifyOrder(OrderInfo oi);
	public int deleteOrderDetail(OrderDetail od);
	
	//获取指定用户的订单列表
	public List getOrderInfoByUserInfoId(int userInfoId);
	//删除指定订单编号的订单
	public void deleteOrderInfoById(int id);
}
