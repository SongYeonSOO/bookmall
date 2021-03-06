package com.estsoft.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.estsoft.db.DBConnection;

public class BookMallDBConnection implements DBConnection {

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			//1. 드라이버 로드
			Class.forName( "com.mysql.jdbc.Driver" );

			//2. Connection 얻기
			String url = "jdbc:mysql://localhost/bookmall";
			conn = DriverManager.getConnection( url, "bookmall", "bookmall" );

		} catch (ClassNotFoundException ex) {
			System.out.println( "드라이버를 찾을 수 없습니다:" + ex );
		}
		
		return conn;		
	}

}
