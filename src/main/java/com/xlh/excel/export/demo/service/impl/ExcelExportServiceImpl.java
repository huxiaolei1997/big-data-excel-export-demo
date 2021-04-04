package com.xlh.excel.export.demo.service.impl;

import com.xlh.excel.export.demo.service.ExcelExportService;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.Random;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2021年04月04日 11:02 胡晓磊 Exp $
 */
@Service
public class ExcelExportServiceImpl implements ExcelExportService {

    private static final int ROW_SIZE = 1000000;

    @Override
    public void excelExportSXSSFWorkBook() {
        try {
            long t1 = System.currentTimeMillis();
//            SXSSFWorkbook workbook = new SXSSFWorkbook(-1);
            // 指定window size 为1000，默认为100
            SXSSFWorkbook workbook = new SXSSFWorkbook(100);
            workbook.createSheet("aaa");
            SXSSFSheet aaa = workbook.getSheetAt(0);
            for (int i = 0; i < ROW_SIZE; i++) {
                aaa.createRow(i);
                aaa.getRow(i).createCell(0).setCellValue("aaabbb" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(1).setCellValue("21dfd测试" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(2).setCellValue("第3列");
                aaa.getRow(i).createCell(3).setCellValue("fadfa3r" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(4).setCellValue("3899193测试" + new Random(1000000).nextInt());
            }

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            workbook.write(byteArrayOutputStream);
            byteArrayOutputStream.close();
            long t2 = System.currentTimeMillis();
            System.out.println("SXSSFWorkbook : 100w条数据写入Excel 消耗时间：" + (t2 - t1) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void excelExportXSSFWorkBook() {
        try {
            long t1 = System.currentTimeMillis();
            XSSFWorkbook workbook = new XSSFWorkbook();
            workbook.createSheet("aaa");
            XSSFSheet aaa = workbook.getSheetAt(0);
            for (int i = 0; i < ROW_SIZE; i++) {
                aaa.createRow(i);
                aaa.getRow(i).createCell(0).setCellValue("aaabbb" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(1).setCellValue("21dfd测试" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(2).setCellValue("第3列");
                aaa.getRow(i).createCell(3).setCellValue("fadfa3r" + new Random(1000000).nextInt());
                aaa.getRow(i).createCell(4).setCellValue("3899193测试" + new Random(1000000).nextInt());
            }

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            workbook.write(byteArrayOutputStream);
            byteArrayOutputStream.close();
            long t2 = System.currentTimeMillis();
            System.out.println("XSSFWorkbook : 100w条数据写入Excel 消耗时间：" + (t2 - t1) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
