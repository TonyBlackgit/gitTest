package com.bigAlpha.search;

import java.util.List;

public interface TopDocsCollector {
	List sort(QueryResult[] qr);
	Json resultToWeb(List l);
}
