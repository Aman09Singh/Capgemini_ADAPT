import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;


class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    public News() {
    	
    }
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
    
}

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
    	Optional<News> comments = news.stream().max(Comparator.comparing(News::getComment));
    	//int cOfs =(int) comments.stream().count();
    	List<Integer> it = new ArrayList<>();
    	comments.stream().forEach(i->{int id =i.getNewsId(); it.add(id);});
    	int i = it.stream().findFirst().get();
    	return i;
    	
    }

    public static int budgetCount (List < News > news) {
    	//int c = (int) news.stream().filter(i->i.getCommentByUser().contains("budget")).count();
    	//return c;
    	int count = 0;
    	List<String> allComments = new ArrayList<>();
    	news.stream().forEach(i->allComments.add(i.getComment()));
    	for(String s:allComments) {
    		if(s.contains("budget")) {
    			count++;
    		}
    	}
    	return count;
    }
    public static String maxCommentsByUser (List < News > news) {
    	
    	Optional<News> toSL = news.stream().min(Comparator.comparing(News::getCommentByUser));  //max is not working here
    	List<String> userNames = new ArrayList<>(); 
    	toSL.stream().forEach(j->userNames.add(j.getCommentByUser()));
    	String finalName = userNames.stream().findFirst().get();
    	return finalName;
    }
    //below method is to sort treemap based on values
    public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map) {
    Comparator<K> valueComparator = 
             new Comparator<K>() {
      public int compare(K k1, K k2) {
        int compare = 
              map.get(k2).compareTo(map.get(k1));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
 
    Map<K, V> sortedByValues = 
      new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
    	/*TreeSet<String> users = new TreeSet<>();
    	Map<String,Integer> uc = new TreeMap<>();
    	news.stream().forEach(i->{String nam = i.getCommentByUser(); uc.put(nam, 0);});
    	return uc;*/
    	Map<String,Integer> mp = new TreeMap<>();
    	List<String> allUsers = new ArrayList<String>();
    	news.stream().forEach(i->allUsers.add(i.getCommentByUser()));
    	for(String userName: allUsers) {
    		mp.put(userName,0);
    	}
    	for(String userName: allUsers) {
    		mp.put(userName,mp.get(userName)+1);
    	}
    	Map<String, Integer> mp2 = sortByValues(mp);
    	return mp2;
    	
    }

    public static void main(String[] args) {
    	/*
    	 *  News [newsId=1, postedByUser=Ajay, commentByUser=Prasanth, comment=comment]     
			News [newsId=2, postedByUser=Ajay1, commentByUser=Prasanth1, comment=budget]    
			News [newsId=1, postedByUser=Ajay2, commentByUser=Prasanth2, comment=comment]   
			News [newsId=3, postedByUser=Ajay3, commentByUser=Prasanth, comment=budget]     
			News [newsId=1, postedByUser=Ajay4, commentByUser=Prasanth2, comment=comment]   
			News [newsId=3, postedByUser=Ajay5, commentByUser=Prasanth, comment=budget]     
			News [newsId=1, postedByUser=Ajay6, commentByUser=Prasanth6, comment=comment] */
    	News n1 = new News(1,"Ajay","Prashanth","comment");
    	News n2 = new News(2,"Ajay1","Prashanth1","budget");
    	News n3 = new News(1,"Ajay2","Prashanth2","comment");
    	News n4 = new News(3,"Ajay3","Prashanth","budget");
    	News n5 = new News(1,"Ajay4","Prashanth2","comment");
    	News n6 = new News(3,"Ajay5","Prashanth","budget");
    	News n7 = new News(1,"Ajay6","Prashanth6","comment");
    	List<News> news = new ArrayList<News>();
    	news.add(n1);
    	news.add(n2);
    	news.add(n3);
    	news.add(n4);
    	news.add(n5);
    	news.add(n6);
    	news.add(n7);
    	// Find out newsId which has recieved maximum comments
    	int x = maxComments(news);
    	System.out.println("Maximum comments by news ID: "+x);
    	// Find out how many times the word 'budget' arrived in user comments all news.
    	int y = budgetCount(news);
    	System.out.println("Budget count is: "+ y);
    	// Find out which user has posted maximum comments.
    	String nameOfUser = maxCommentsByUser(news);
    	System.out.println("Maximum comments posted by user: "+nameOfUser);
    	// Display commentByUser wise number of comments.
    	Map<String,Integer> map = sortMaxCommentsByUser(news);
    	for(Map.Entry<String, Integer> mMap: map.entrySet()) {
    		System.out.println(mMap.getKey()+": "+mMap.getValue());
    	}
    }
}











