package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河 \"圣浴\" 引民众担忧"));
        list.add(new News("男子突然想起2个月前钓的鱼还在网兜里， 捞起一看赶紧放生"));
        Collections.reverse(list);
        for (Object obj : list) {
            News news = (News) obj;
            if(news.getTitle().length() > 15) {
                 String str = news.getTitle().substring(0, 15);
                 news.setTitle(str + "...");;
            }
            System.out.print(news);
        }

    }
}


class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "\nNews{" +
                "title='" + title + '\'' +
                '}';
    }
}

