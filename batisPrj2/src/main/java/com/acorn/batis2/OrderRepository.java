package com.acorn.batis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
	@Autowired
	private SqlSession session;
	private static String namespace = "com.acorn.OrderMapper.";

	public List<OrderDTO> selectAll() throws Exception {
		return session.selectList(namespace + "selectAll");
	} // List<E> selectList(String statement)

	public List<OrderDTO> selectAll2() throws Exception {
		return session.selectList(namespace + "selectAll2");
	} //

	public OrderDTO selectOne(String orderno) {

		return session.selectOne(namespace + "selectOne", orderno);
	}
}
