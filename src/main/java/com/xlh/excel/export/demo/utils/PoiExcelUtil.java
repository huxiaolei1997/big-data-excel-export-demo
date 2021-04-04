//package com.xlh.excel.export.demo.utils;
//
//import com.java.exportbigdatatoexcel.model.PurchaseOrderItem;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.streaming.SXSSFRow;
//import org.apache.poi.xssf.streaming.SXSSFSheet;
//import org.apache.poi.xssf.streaming.SXSSFWorkbook;
//
//import java.util.Iterator;
//import java.util.List;
//
//public class PoiExcelUtil {
//
////    private static final Logger logger = LoggerFactory.getLogger(PoiExcelUtil.class);
//
//
//    public static void userList2Excel(SXSSFSheet sxssfSheet, SXSSFWorkbook wb, List<PurchaseOrderItem> userList, int start) {
//        //创建一个webbook，对应一个Excel文件
//        //在webbook中添加一个sheet,对应Excel文件中的sheet
////        String sheetName = "sheet0";
////        SXSSFSheet userSheet = wb.createSheet(sheetName);
//        //在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
//        SXSSFRow titleRow = sxssfSheet.createRow(start + 1);
//        sxssfSheet.setDefaultColumnWidth(20);
//        //创建单元格，并设置值表头 设置表头居中
//        CellStyle style = wb.createCellStyle();
//        Cell cell = null;
//        //标题行抽出字段
//        String[] title = {"1", "2", "33", "44", "55", "66", "77", "88", "99", "10", "11","12","13","14","15","16","17"};
//        //把已经写好的标题行写入excel文件中
//        for (int i = 0; i < title.length; i++) {
//            cell = titleRow.createCell(i);
//            cell.setCellValue(title[i]);
//            cell.setCellStyle(style);
//        }
//
//        //把从数据库中取得的数据一一写入excel文件中
//        Row row = null;
//        Iterator<PurchaseOrderItem> it = userList.iterator();
//        int i = 0;
//        while (it.hasNext()) {
//
//            //for (int i = 0; i < userList.size(); i++) {
//            //创建list.size()行数据
//            row = sxssfSheet.createRow(i + 1);
//            //把值一一写进单元格里
//            //设置第一列为自动递增的序号
//            row.createCell(0).setCellValue(i + 1);
//            PurchaseOrderItem purchaseOrderItem = it.next();
//            row.createCell(1).setCellValue(purchaseOrderItem.getEnterpriseNo());
//            row.createCell(2).setCellValue(purchaseOrderItem.getSkuNo());
//            row.createCell(3).setCellValue(purchaseOrderItem.getSkuCode());
//            row.createCell(4).setCellValue(purchaseOrderItem.getArticleCode());
//            row.createCell(5).setCellValue(purchaseOrderItem.getGoodsName());
//            row.createCell(6).setCellValue(purchaseOrderItem.getCommonName());
//            row.createCell(7).setCellValue(purchaseOrderItem.getSpec());
//            row.createCell(8).setCellValue(purchaseOrderItem.getUnit());
//            row.createCell(9).setCellValue(purchaseOrderItem.getSupplierNo());
//            row.createCell(10).setCellValue(purchaseOrderItem.getCustomerNo());
//            row.createCell(11).setCellValue(purchaseOrderItem.getEndCustomerNo());
//            row.createCell(12).setCellValue(purchaseOrderItem.getContractCode());
//            row.createCell(13).setCellValue(purchaseOrderItem.getContractNo());
//            row.createCell(14).setCellValue(String.valueOf(purchaseOrderItem.getPurchaseNum()));
//            row.createCell(15).setCellValue(String.valueOf(purchaseOrderItem.getReceiveNum()));
//            row.createCell(16).setCellValue(String.valueOf(purchaseOrderItem.getCancelNum()));
//            row.createCell(17).setCellValue(String.valueOf(purchaseOrderItem.getReturnNum()));
//            //卡号
////            if (user.getUserSource() == 0) {
////                row.createCell(7).setCellValue("INVESTOR");
////            } else {
////                row.createCell(7).setCellValue("BORROWER");
////            }
////            row.createCell(8).setCellValue("CREDIT_ASSIGNMENT&TENDER");
////            row.createCell(9).setCellValue("PRC_ID");
////            logger.info("##create cell No={}", i);
//            it.remove();
//            i++;
//        }
//
//        //设置单元格宽度自适应，在此基础上把宽度调至1.5倍
//        sxssfSheet.trackAllColumnsForAutoSizing();
//        for (int j = 0; j < title.length; j++) {
//            sxssfSheet.autoSizeColumn(j, true);
//            sxssfSheet.setColumnWidth(j, sxssfSheet.getColumnWidth(i) * 15 / 10);
//        }
//
//    }
//}
