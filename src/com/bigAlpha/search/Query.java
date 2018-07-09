package com.bigAlpha.search;


public interface Query {
	//String query;
	//int catagory;
	
	/**
	 * 获取查询语句，类别
	 * @param query
	 * @param catagory
	 * @return
	 */
	boolean getQuestion();
	
	String[] callTokenizer();
	
//	boolean put(String[] query, int catagory);
}
