package com.icss.hr.common;

/**
 * 分页对象
 */
public class Pager {

    private int recordCount;//总记录数

    private int pageSize;//每页多少条

    private int pageNum;//当前页码

    private int pageCount;//共几页

    private int startIndex;//起始下标


    public Pager(int recordCount, Integer pageSize, Integer pageNum) {
        this.recordCount = recordCount;
        this.pageSize = pageSize;
        this.pageNum = pageNum;

        //计算共几页
        this.pageCount = this.recordCount / this.pageSize; //100  10   10
        if (this.recordCount % this.pageSize != 0) {
            this.pageCount++;
        }

        //校正页码
        if (this.pageNum < 1)
            this.pageNum = 1;
        if (this.pageNum > this.pageCount)
            this.pageNum = this.pageCount;

        /*MySql的startIndex 为0 直接报错*/
        /*当表中没有数据，需要校正*/
        if (this.recordCount == 0) {
            this.startIndex = 0;
        }
        //计算起始位置(mysql是从0开始，orcl是从1开始)
        this.startIndex = (this.pageNum - 1) * this.pageSize;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


}
