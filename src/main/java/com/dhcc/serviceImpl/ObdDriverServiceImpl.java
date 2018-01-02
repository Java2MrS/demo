package com.dhcc.serviceImpl;

import com.dhcc.dao.ObdDriversMapper;
import com.dhcc.entity.ObdDrivers;
import com.dhcc.service.ObdDriverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *  demo
 *  com.dhcc.serviceImpl
 *  @author:ShenTai
 *  @date: 2017/9/15  17:13
 */
@Service("obdDriverService")
public class ObdDriverServiceImpl implements ObdDriverService {

    @Resource
    private ObdDriversMapper obdDriversMapper;
    @Override
    public ObdDrivers selectByPrimaryKey(Long cbId) {
        System.out.println("---serviceImpl---");
        ObdDrivers obdDrivers = new ObdDrivers();
        try {
            obdDrivers = obdDriversMapper.selectByPrimaryKey(cbId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obdDrivers;
    }
}
