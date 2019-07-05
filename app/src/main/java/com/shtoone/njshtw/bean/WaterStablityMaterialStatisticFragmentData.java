package com.shtoone.njshtw.bean;

import java.util.List;

/**
 * Created by leguang on 2016/7/20 0020.
 */
public class WaterStablityMaterialStatisticFragmentData {


    /**
     * tableName : 盐城内河港市区港区新兴作业区码头工程
     * data : [{"wucha":"0.00","scpeibi":"","name":"实际粉料1","yongliang":"2140.72","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际粉料2","yongliang":"0.00","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际骨料1","yongliang":"9770.06","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际骨料2","yongliang":"13163.80","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际骨料3","yongliang":"11767.07","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际骨料4","yongliang":"12339.57","cblx":"","sgpeibi":"","mbpeibi":"0.0"},{"wucha":"0.00","scpeibi":"","name":"实际骨料5","yongliang":"538.06","cblx":"","sgpeibi":"","mbpeibi":"0.0"}]
     * success : true
     */

    private String tableName;
    private boolean          success;
    private List<DataEntity> data;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    public static class DataEntity {
        /**
         * wucha : 0.00
         * scpeibi :
         * name : 实际粉料1
         * yongliang : 2140.72
         * cblx :
         * sgpeibi :
         * mbpeibi : 0.0
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
