package com.xlh.excel.export.demo.controller;

import com.xlh.excel.export.demo.service.ExcelExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2021年04月04日 11:01 胡晓磊 Exp $
 */
@RestController
public class ExcelExportController {

    @Autowired
    private ExcelExportService excelExportService;

    @GetMapping("/excel-export-sxssf")
    public void excelExportSXSSF() {
        excelExportService.excelExportSXSSFWorkBook();
    }


    @GetMapping("/excel-export-xssf")
    public void excelExportXSSF() {
        excelExportService.excelExportXSSFWorkBook();
    }
}
