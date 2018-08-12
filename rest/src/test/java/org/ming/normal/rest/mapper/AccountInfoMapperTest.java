package org.ming.normal.rest.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ming.normal.rest.RestApplication;
import org.ming.normal.rest.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
public class AccountInfoMapperTest {
    @Autowired
    AccountInfoMapper accountInfoMapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void selectByCondition() throws Exception {
    }

    @Test
    public void selectById(){
        String id = "000004c08ddf42a180a72af93572a636";
        AccountInfo accountInfo = accountInfoMapper.selectById(id);
        log.info("selectById RESULT IS {}",accountInfo.toString());
    }
}