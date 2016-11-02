package com.bill.dp01.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Bill on 2016/11/2.
 * <p>
 * 虚拟设备信息查询数据
 */
public class EquipmentService {


    public List<Equipment> findAll() {
        List<Equipment> equipmentList = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            Equipment equipment = new Equipment();
            equipment.setId(i + 1);
            equipment.setEqName("设备名称" + i);
            equipment.setPrice(new Random().nextDouble());
            equipmentList.add(equipment);
        }
        return equipmentList;
    }
}
