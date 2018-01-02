package com.dhcc.dao;


import com.dhcc.entity.ObdDrivers;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ObdDriversMapper {

    ObdDrivers selectByPrimaryKey(Long cdId);

}