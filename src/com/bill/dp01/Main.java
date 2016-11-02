package com.bill.dp01;

import com.bill.dp01.data.Equipment;
import com.bill.dp01.data.EquipmentService;
import com.bill.dp01.docType.ExcelDoc;
import com.bill.dp01.exporter.DataExport;
import com.bill.dp01.exporter.DataExporter;

import java.util.List;

/**
 * 使用工厂方法模式处理数据导出
 * 此处相当于client
 */
public class Main {
    public static void main(String[] args) {
        DataExport dataExport = new DataExporter();

        String titles[] = {"序号", "设备名称", "价格"};
        String colNames[] = {"id", "eqName", "price"};
        EquipmentService equipmentService = new EquipmentService();
        List<Equipment> equipmentList = equipmentService.findAll();

        dataExport.export(new ExcelDoc(), titles, colNames, equipmentList);
    }
}
