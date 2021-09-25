package com.icss.hr.common;

/**
 * ��ҳ����
 */
public class Pager {

    private int recordCount;//�ܼ�¼��

    private int pageSize;//ÿҳ������

    private int pageNum;//��ǰҳ��

    private int pageCount;//����ҳ

    private int startIndex;//��ʼ�±�


    public Pager(int recordCount, Integer pageSize, Integer pageNum) {
        this.recordCount = recordCount;
        this.pageSize = pageSize;
        this.pageNum = pageNum;

        //���㹲��ҳ
        this.pageCount = this.recordCount / this.pageSize; //100  10   10
        if (this.recordCount % this.pageSize != 0) {
            this.pageCount++;
        }

        //У��ҳ��
        if (this.pageNum < 1)
            this.pageNum = 1;
        if (this.pageNum > this.pageCount)
            this.pageNum = this.pageCount;

        /*MySql��startIndex Ϊ0 ֱ�ӱ���*/
        /*������û�����ݣ���ҪУ��*/
        if (this.recordCount == 0) {
            this.startIndex = 0;
        }
        //������ʼλ��(mysql�Ǵ�0��ʼ��orcl�Ǵ�1��ʼ)
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
