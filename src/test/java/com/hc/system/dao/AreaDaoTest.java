//package com.hc.system.dao;
//
//import com.hc.system.entity.Area;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Date;
//import java.util.List;
//
//
//import static org.junit.Assert.*;
///**
// * 创建人是: zsg 创建时间: 2018/2/7 0007.
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class AreaDaoTest {
//    @Autowired
//    private AreaDao areaDao;
//
//    @Test
//    public void testQueryArea() throws Exception {
//        List<Area> areaList = areaDao.queryArea();
//        System.out.println("######" + areaList.size());
//    }
//
//    @Test
//    public void testQueryAreaById() throws Exception {
//        Area area = areaDao.queryAreaById(1);
//        System.out.println("######" + area);
//    }
//
//    @Test
//    public void testInsertArea() throws Exception {
//        Area area = new Area();
//        area.setAreaName("东");
//        area.setPriority(5);
//        area.setCreateTime(new Date());
//        area.setLastEditTime(new Date());
//        int i = areaDao.insertArea(area);
//        System.out.println("######" + i);
//        System.out.println("######" + area.getAreaId());
//        assertEquals(1, i);
//    }
//
//    @Test
//    public void testUpdateArea() throws Exception {
//        Area area = new Area();
//        area.setAreaName("西");
//        area.setAreaId(1);
//        area.setLastEditTime(new Date());
//        int i = areaDao.updateArea(area);
//        System.out.println("######" + i);
//    }
//
//    @Test
//    public void testDeleteArea() throws Exception {
//
//    }
//}