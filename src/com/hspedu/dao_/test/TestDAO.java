package com.hspedu.dao_.test;

import com.hspedu.dao_.dao.ActorDAO;
import com.hspedu.dao_.dao.GoodsDAO;
import com.hspedu.dao_.domain.Actor;
import com.hspedu.dao_.domain.Goods;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDAO {
    @Test
    public void testActorDAO() {
        ActorDAO actorDAO = new ActorDAO();
        System.out.println("=======searching results========");
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        for (Actor actor :
                actors) {
            System.out.print(actor);
        }

        Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 3);
        System.out.println(actor);

        Object o = actorDAO.queryScalar("select NAME from actor where id = ?", 3);
        System.out.println(o);

        int update = actorDAO.update("insert into actor values(null, ?,?,?,?)", "jack", "m", "2000-11-11 22:22:22", "999");
        System.out.println(update > 0 ? "succeed" : "failed");
    }

    @Test
    public void testGoodsDAO() {
        GoodsDAO goodsDAO = new GoodsDAO();
        System.out.println("=======searching results========");
        List<Goods> goods = goodsDAO.queryMulti("select * from goods where id >= ?", Goods.class, 1);
        for (Goods good :
                goods) {
            System.out.print(good);
        }

        Goods good = goodsDAO.querySingle("select * from goods where id = ?", Goods.class, 60);
        System.out.println(good);

        Object o = goodsDAO.queryScalar("select goods_name from goods where id = ?", 200);
        System.out.println(o);

        int update = goodsDAO.update("insert into goods values(?, ?,?)", 9, "blackburry", 1000);
        System.out.println(update > 0 ? "succeed" : "failed");
    }
}
