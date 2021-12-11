package Bai3;

import java.util.ArrayList;
import java.util.Random;

public interface INews extends News {
    public void Dislay(){
        System.out.println("Title:"+getTitle());
        System.out.println("PublishDate:"+getPublishDate());
        System.out.println("Author:"+getAuthor());
        System.out.println("Content:"+getContent());
        System.out.println("AverageRate:"+getAverageRate());
    }
    ArrayList<Integer>rateList=new ArrayList<>();
    rateList.add(1);
}
