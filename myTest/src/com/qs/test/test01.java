package com.qs.test;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.qs.until.C3p0_Untils;

/**
 * 
 * @author wxk
 * 已修改
 */
public class test01 {
	public static void main(String[] args) {
		// 1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3p0_Untils.getDataSource());
		// 2.执行查询
		String sql = "SELECT a.id aa,b.id bb FROM demo1 a,demo2 b";
		List<Map<String, Object>> maps = null;
		try {
			 maps = qr.query(sql, new MapListHandler());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if (maps==null) {
			System.out.println("1111111");
		}
		System.out.println(maps);
	}
	
}
