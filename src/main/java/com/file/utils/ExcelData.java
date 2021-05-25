//package com.file.utils;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * @ClassName ExcelData
// * @Description TODO
// * @Author zouwenhai
// * @Date 2020/4/6 21:03
// * @Version 1.0
// */
//public class ExcelData {
//
//
//    private XSSFSheet sheet;
//
//
//    ExcelData(String filePath, String sheetName) {
//
//        FileInputStream fileInputStream = null;
//
//        try {
//            fileInputStream = new FileInputStream(filePath);
//            XSSFWorkbook sheets = new XSSFWorkbook(fileInputStream);
//            sheet = sheets.getSheet(sheetName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//    /**
//     * 根据行和列的索引获取单元格的数据
//     *
//     * @param row
//     * @param column
//     * @return
//     */
//    public String getExcelDateByIndex(int row, int column) {
//        XSSFRow row1 = sheet.getRow(row);
//        String cell = row1.getCell(column).toString();
//        return cell;
//    }
//
//    /**
//     * 根据某一列值为“******”的这一行，来获取该行第x列的值
//     *
//     * @param caseName
//     * @param currentColumn 当前单元格列的索引
//     * @param targetColumn  目标单元格列的索引
//     * @return
//     */
//    public String getCellByCaseName(String caseName, int currentColumn, int targetColumn) {
//        String operateSteps = "";
//        //获取行数
//        int rows = sheet.getPhysicalNumberOfRows();
//        for (int i = 0; i < rows; i++) {
//            XSSFRow row = sheet.getRow(i);
//            String cell = row.getCell(currentColumn).toString();
//            if (cell.equals(caseName)) {
//                operateSteps = row.getCell(targetColumn).toString();
//                break;
//            }
//        }
//        return operateSteps;
//    }
//
//
//    //打印excel数据
//    public void readExcelData() {
//        //获取行数
//        int rows = sheet.getPhysicalNumberOfRows();
//        for (int i = 1; i < rows; i++) {
//            //获取列数
//            StringBuffer str = new StringBuffer("INSERT INTO TB_YOFISHDK_NIUXIN_CALL_RECORD (THIRD_ID,SIPID,PHONE,PHONE_MD5,PHONE_ENCRYPT,SHOW_PHONE,DURATION,START_TIME,END_TIME,RECORD_URL,ORDER_ID,ANSWER_TIME,DIRECTION,HANGUP_CAUSE,USER_NAME) values(");
//            XSSFRow row = sheet.getRow(i);
//            int columns = row.getPhysicalNumberOfCells();
//            for (int j = 0; j <= columns; j++) {
//
//                if (j == 0 || j == 1 || j == 8) {
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append(",");
//                } else if (j == 2) {
//                    str.append("'");
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append("',");
//                    str.append("'");
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append("',");
//                    str.append("'");
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append("',");
//
//                } else if (j == 12) {
//                    str.append("'");
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append("')");
//                    System.out.println(str.toString());
//                } else {
//                    str.append("'");
//                    str.append(getCellValueByCell(row.getCell(j)));
//                    str.append("',");
//                }
//
//            }
//        }
//    }
//
//
//    public String getCellValueByCell(Cell cell) {
//        //判断是否为null或空串
//        if (cell == null || cell.toString().trim().equals("")) {
//            return "";
//        }
//        String cellValue = "";
//        int cellType = cell.getCellType();
//        switch (cellType) {
//            case Cell.CELL_TYPE_NUMERIC: // 数字
//                short format = cell.getCellStyle().getDataFormat();
//                if (DateUtil.isCellDateFormatted(cell)) {
//                    SimpleDateFormat sdf = null;
//                    //System.out.println("cell.getCellStyle().getDataFormat()="+cell.getCellStyle().getDataFormat());
//                    if (format == 20 || format == 32) {
//                        sdf = new SimpleDateFormat("HH:mm");
//                    } else if (format == 14 || format == 31 || format == 57 || format == 58) {
//                        // 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
//                        sdf = new SimpleDateFormat("yyyy-MM-dd");
//                        double value = cell.getNumericCellValue();
//                        Date date = org.apache.poi.ss.usermodel.DateUtil
//                                .getJavaDate(value);
//                        cellValue = sdf.format(date);
//                    } else {// 日期
//                        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    }
//                    try {
//                        cellValue = sdf.format(cell.getDateCellValue());// 日期
//                    } catch (Exception e) {
//                        try {
//                            throw new Exception("exception on get date data !".concat(e.toString()));
//                        } catch (Exception e1) {
//                            e1.printStackTrace();
//                        }
//                    } finally {
//                        sdf = null;
//                    }
//                } else {
//                    BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
//                    cellValue = bd.toPlainString();// 数值 这种用BigDecimal包装再获取plainString，可以防止获取到科学计数值
//                }
//                break;
//            case Cell.CELL_TYPE_STRING: // 字符串
//                cellValue = cell.getStringCellValue();
//                break;
//            case Cell.CELL_TYPE_BOOLEAN: // Boolean
//                cellValue = cell.getBooleanCellValue() + "";
//                ;
//                break;
//            case Cell.CELL_TYPE_FORMULA: // 公式
//                cellValue = cell.getCellFormula();
//                break;
//            case Cell.CELL_TYPE_BLANK: // 空值
//                cellValue = "";
//                break;
//            case Cell.CELL_TYPE_ERROR: // 故障
//                cellValue = "ERROR VALUE";
//                break;
//            default:
//                cellValue = "UNKNOW VALUE";
//                break;
//        }
//        return cellValue;
//    }
//
//
//    //测试方法
//    public static void main(String[] args) {
//        ExcelData sheet1 = new ExcelData("C:\\Users\\14666\\Desktop\\测试.xlsx", "Sheet1");
//        sheet1.readExcelData();
//
//    }
//
//}
