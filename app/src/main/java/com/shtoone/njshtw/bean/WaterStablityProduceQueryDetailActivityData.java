package com.shtoone.njshtw.bean;

import java.util.List;

/**
 * Created by gesangdianzi on 2016/8/31.
 */
public class WaterStablityProduceQueryDetailActivityData {


    /**
     * swHead : {"baocunshijian":"2019-04-04 09:47:08","zcl":"7185.48985011875","bhjName":"盐城码头工程1号水稳站","shijians":"2019-04-03 11:31:55"}
     * data : [{"wucha":"4.78","scpeibi":"4.78","name":"水泥1","yongliang":"328.03","cblx":"","sgpeibi":"5.25","mbpeibi":""},{"wucha":"0.00","scpeibi":"0.00","name":"水泥2","yongliang":"0.00","cblx":"","sgpeibi":"0.00","mbpeibi":""},{"wucha":"0.25","scpeibi":"0.25","name":"实际骨料1","yongliang":"17.39","cblx":"","sgpeibi":"11.00","mbpeibi":""},{"wucha":"33.45","scpeibi":"33.45","name":"实际骨料2","yongliang":"2293.51","cblx":"","sgpeibi":"30.00","mbpeibi":""},{"wucha":"38.18","scpeibi":"38.18","name":"实际骨料3","yongliang":"2618.06","cblx":"","sgpeibi":"34.00","mbpeibi":""},{"wucha":"28.12","scpeibi":"28.12","name":"实际骨料4","yongliang":"1928.51","cblx":"","sgpeibi":"25.00","mbpeibi":""},{"wucha":"0.00","scpeibi":"0.00","name":"实际骨料5","yongliang":"0.00","cblx":"","sgpeibi":"0.00","mbpeibi":""}]
     * swChartDataList : []
     * success : true
     */

    private SwHeadEntity swHead;
    private boolean          success;
    private List<DataEntity> data;
    private List<?>          swChartDataList;

    public SwHeadEntity getSwHead() {
        return swHead;
    }

    public void setSwHead(SwHeadEntity swHead) {
        this.swHead = swHead;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public List<?> getSwChartDataList() {
        return swChartDataList;
    }

    public void setSwChartDataList(List<?> swChartDataList) {
        this.swChartDataList = swChartDataList;
    }

    public static class SwHeadEntity {
        /**
         * baocunshijian : 2019-04-04 09:47:08
         * zcl : 7185.48985011875
         * bhjName : 盐城码头工程1号水稳站
         * shijians : 2019-04-03 11:31:55
         */

        private String baocunshijian;
        private String zcl;
        private String bhjName;
        private String shijians;

        public String getBaocunshijian() {
            return baocunshijian;
        }

        public void setBaocunshijian(String baocunshijian) {
            this.baocunshijian = baocunshijian;
        }

        public String getZcl() {
            return zcl;
        }

        public void setZcl(String zcl) {
            this.zcl = zcl;
        }

        public String getBhjName() {
            return bhjName;
        }

        public void setBhjName(String bhjName) {
            this.bhjName = bhjName;
        }

        public String getShijians() {
            return shijians;
        }

        public void setShijians(String shijians) {
            this.shijians = shijians;
        }
    }

    public static class DataEntity {
        /**
         * wucha : 4.78
         * scpeibi : 4.78
         * name : 水泥1
         * yongliang : 328.03
         * cblx :
         * sgpeibi : 5.25
         * mbpeibi :
         */

        private String wucha;
        private String scpeibi;
        private String name;
        private String yongliang;
        private String cblx;
        private String sgpeibi;
        private String mbpeibi;

        public String getWucha() {
            return wucha;
        }

        public void setWucha(String wucha) {
            this.wucha = wucha;
        }

        public String getScpeibi() {
            return scpeibi;
        }

        public void setScpeibi(String scpeibi) {
            this.scpeibi = scpeibi;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getYongliang() {
            return yongliang;
        }

        public void setYongliang(String yongliang) {
            this.yongliang = yongliang;
        }

        public String getCblx() {
            return cblx;
        }

        public void setCblx(String cblx) {
            this.cblx = cblx;
        }

        public String getSgpeibi() {
            return sgpeibi;
        }

        public void setSgpeibi(String sgpeibi) {
            this.sgpeibi = sgpeibi;
        }

        public String getMbpeibi() {
            return mbpeibi;
        }

        public void setMbpeibi(String mbpeibi) {
            this.mbpeibi = mbpeibi;
        }
    }
}
