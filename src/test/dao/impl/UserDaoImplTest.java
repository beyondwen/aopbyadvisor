package dao.impl;

import advisor.MyAdvisor;
import dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/10/01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoImplTest {

    @Autowired
    @Qualifier("coustomDaoProxy")
    private IUserDao dao;

    @Test
    public void add() throws Exception {
        dao.add();
        dao.update();
    }

    @Test
    public void update() throws Exception {

    }

}