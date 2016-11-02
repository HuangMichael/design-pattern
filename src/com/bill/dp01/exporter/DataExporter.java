package com.bill.dp01.exporter;

import com.bill.dp01.docType.DocType;

import java.util.List;

/**
 * Created by bill on 2016/11/2.
 * 数据导出实现类
 */
public class DataExporter implements DataExport {


    /**
     * @param doc 传入文档类型
     *            重写抽象类的导出方法
     */
    @Override
    public void export(DocType doc, String[] titles, String[] colNames, List list) {

        System.out.println("you are exporting a(n) " + doc.getDocType() + " file");

        for (String title : titles) {
            System.out.println("导出标题描述:" + title);
        }
        for (String colName : colNames) {
            System.out.println("导出字段描述:" + colName);
        }

        for (Object object : list) {
            System.out.println("导出对象信息:" + object.toString());
        }


    }
}
