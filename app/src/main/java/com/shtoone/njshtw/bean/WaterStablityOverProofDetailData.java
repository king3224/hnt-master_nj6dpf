package com.shtoone.njshtw.bean;

import java.util.List;

/**
 * Created by Administrator on 2019/5/14.
 */

public class WaterStablityOverProofDetailData {


    /**
     * swHead : {"chuliaoshijian":"2019-04-03 11:31:55","baocunshijian":"","zcl":"7185.48985011875","bhjName":"盐城码头工程1号水稳站","shijians":""}
     * swjg : {"chulishijian":"","chuliren":"","filePath":"","yztime":"","zxdwyijian":"","shenpiyijian":"","yz":"","yzyj":"","chulifangshi":"","zxdwdate":"","shenpiuser":"","zxdw":"","chulijieguo":"","shenpidate":"","wentiyuanyin":""}
     * swData : [{"wucha":"4.78","scpeibi":"4.78","name":"水泥1","yongliang":"328.03","cblx":"","sgpeibi":"","mbpeibi":""},{"wucha":"0.00","scpeibi":"0.00","name":"水泥2","yongliang":"0.00","cblx":"","sgpeibi":"","mbpeibi":""},{"wucha":"0.25","scpeibi":"0.25","name":"实际骨料1","yongliang":"17.39","cblx":"3","sgpeibi":"","mbpeibi":""},{"wucha":"33.45","scpeibi":"33.45","name":"实际骨料2","yongliang":"2293.51","cblx":"","sgpeibi":"","mbpeibi":""},{"wucha":"38.18","scpeibi":"38.18","name":"实际骨料3","yongliang":"2618.06","cblx":"","sgpeibi":"","mbpeibi":""},{"wucha":"28.12","scpeibi":"28.12","name":"实际骨料4","yongliang":"1928.51","cblx":"","sgpeibi":"","mbpeibi":""},{"wucha":"0.00","scpeibi":"0.00","name":"实际骨料5","yongliang":"0.00","cblx":"","sgpeibi":"","mbpeibi":""}]
     * success : true
     */

    private SwHeadEntity swHead;
    private SwjgEntity         swjg;
    private boolean            success;
    private List<SwDataEntity> swData;

    public SwHeadEntity getSwHead() {
        return swHead;
    }

    public void setSwHead(SwHeadEntity swHead) {
        this.swHead = swHead;
    }

    public SwjgEntity getSwjg() {
        return swjg;
    }

    public void setSwjg(SwjgEntity swjg) {
        this.swjg = swjg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<SwDataEntity> getSwData() {
        return swData;
    }

    public void setSwData(List<SwDataEntity> swData) {
        this.swData = swData;
    }

    public static class SwHeadEntity {
        /**
         * chuliaoshijian : 2019-04-03 11:31:55
         * baocunshijian :
         * zcl : 7185.48985011875
         * bhjName : 盐城码头工程1号水稳站
         * shijians :
         */

        private String chuliaoshijian;
        private String baocunshijian;
        private String zcl;
        private String bhjName;
        private String shijians;

        public String getChuliaoshijian() {
            return chuliaoshijian;
        }

        public void setChuliaoshijian(String chuliaoshijian) {
            this.chuliaoshijian = chuliaoshijian;
        }

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

    public static class SwjgEntity {
        /**
         * chulishijian :
         * chuliren :
         * filePath :
         * yztime :
         * zxdwyijian :
         * shenpiyijian :
         * yz :
         * yzyj :
         * chulifangshi :
         * zxdwdate :
         * shenpiuser :
         * zxdw :
         * chulijieguo :
         * shenpidate :
         * wentiyuanyin :
         */

        private String chulishijian;
        private String chuliren;
        private String filePath;
        private String yztime;
        private String zxdwyijian;
        private String shenpiyijian;
        private String yz;
        private String yzyj;
        private String chulifangshi;
        private String zxdwdate;
        private String shenpiuser;
        private String zxdw;
        private String chulijieguo;
        private String shenpidate;
        private String wentiyuanyin;

        public String getChulishijian() {
            return chulishijian;
        }

        public void setChulishijian(String chulishijian) {
            this.chulishijian = chulishijian;
        }

        public String getChuliren() {
            return chuliren;
        }

        public void setChuliren(String chuliren) {
            this.chuliren = chuliren;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }

        public String getYztime() {
            return yztime;
        }

        public void setYztime(String yztime) {
            this.yztime = yztime;
        }

        public String getZxdwyijian() {
            return zxdwyijian;
        }

        public void setZxdwyijian(String zxdwyijian) {
            this.zxdwyijian = zxdwyijian;
        }

        public String getShenpiyijian() {
            return shenpiyijian;
        }

        public void setShenpiyijian(String shenpiyijian) {
            this.shenpiyijian = shenpiyijian;
        }

        public String getYz() {
            return yz;
        }

        public void setYz(String yz) {
            this.yz = yz;
        }

        public String getYzyj() {
            return yzyj;
        }

        public void setYzyj(String yzyj) {
            this.yzyj = yzyj;
        }

        public String getChulifangshi() {
            return chulifangshi;
        }

        public void setChulifangshi(String chulifangshi) {
            this.chulifangshi = chulifangshi;
        }

        public String getZxdwdate() {
            return zxdwdate;
        }

        public void setZxdwdate(String zxdwdate) {
            this.zxdwdate = zxdwdate;
        }

        public String getShenpiuser() {
            return shenpiuser;
        }

        public void setShenpiuser(String shenpiuser) {
            this.shenpiuser = shenpiuser;
        }

        public String getZxdw() {
            return zxdw;
        }

        public void setZxdw(String zxdw) {
            this.zxdw = zxdw;
        }

        public String getChulijieguo() {
            return chulijieguo;
        }

        public void setChulijieguo(String chulijieguo) {
            this.chulijieguo = chulijieguo;
        }

        public String getShenpidate() {
            return shenpidate;
        }

        public void setShenpidate(String shenpidate) {
            this.shenpidate = shenpidate;
        }

        public String getWentiyuanyin() {
            return wentiyuanyin;
        }

        public void setWentiyuanyin(String wentiyuanyin) {
            this.wentiyuanyin = wentiyuanyin;
        }
    }

    public static class SwDataEntity {
        /**
         * wucha : 4.78
         * scpeibi : 4.78
         * name : 水泥1
         * yongliang : 328.03
         * cblx :
         * sgpeibi :
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
