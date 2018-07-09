

public interface IndexSearcher {
	boolean connectToDB(String host, String name, String pw);
	QueryResult[] getData(int catagory, String[] query);
}