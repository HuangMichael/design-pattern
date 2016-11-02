package com.bill.dp01;

import com.bill.dp01.docType.ExcelDoc;
import com.bill.dp01.docType.PdfDoc;
import com.bill.dp01.exporter.DataExport;
import com.bill.dp01.exporter.DataExporter;

/**
 * 使用工厂方法模式处理数据导出
 * 此处相当于client
 */
public class Main {
    public static void main(String[] args) {
        DataExport dataExport = new DataExporter();
        dataExport.export(new ExcelDoc());
        dataExport.export(new PdfDoc());
    }
}
