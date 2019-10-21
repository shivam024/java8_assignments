package com.training.myapp.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.training.myapp.model.News;

public class MyNews {
public static void main(String[] args) {
	List<News> news=new ArrayList<News>();
	
	news.add(new News(101, "Khairu", "sundaram", "good news"));
	
	//HashMap<String, String> comment=new HashMap<String, String>();
	HashMap comment=new HashMap();
	comment.put(news.get(0).getCommentByUser(), news.get(0).getComment());
	comment.put("Rahul", "Awesome News");
	comment.put("Mahesh","gjgjgjh");
	HashMap news1=new HashMap();
	news1.put(news.get(0).getNewsId(),comment );
	System.out.println(news1);
	//System.out.println(news1.values().size());
            //System.out.println(a);
            
          
	

	
	
			
	
	
	
	
}
}
