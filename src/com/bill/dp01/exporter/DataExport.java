package com.bill.dp01.exporter;

import com.bill.dp01.docType.DocType;

import java.util.List;

/**
 * Created by Bill on 2016/11/2.
 * 数据导出接口
 */
public interface DataExport {


    /**
     * @param doc 文档类型
     *            定义数据导出接口
     */
    void export(DocType doc, String[] titles, String[] colNames, List list);


}
