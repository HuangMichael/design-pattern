package com.bill.dp01.exporter;

import com.bill.dp01.docType.DocType;

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
    public void export(DocType doc) {
        System.out.println("you are exporting a(n) " + doc.getDocType() + " file");
    }
}
