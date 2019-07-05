package com.shtoone.njshtw.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/5/13.
 */

public class WaterStablityOverprofData {


    /**
     * field : {"clTime":"时间","shenhe":"","chuli":"","usePosition":"","bzhName":"拌合站名称","sbbh":"","zcl":"总产量","shuiwenid":"ShuiwenID","sjg1":"实际骨料1","sjg2":"实际骨料2","sjg3":"实际骨料3","sjf1":"水泥1","sjg4":"实际骨料4","sjshui":"","sjg5":"实际骨料5","sjf2":"水泥2"}
     * data : [{"clTime":"2019-04-03 11:31:55","shenhe":"","chuli":"0","usePosition":"","bzhName":"盐城码头工程1号水稳站","sbbh":"njpfsixsw01","zcl":"7185.50","shuiwenid":"1","sjg1":"3","sjg2":"","sjg3":"","sjg4":"","sjf1":"","sjf2":"","sjg5":"","sjshui":""}]
     * success : true
     * isShow : {"clTime":"1","shenhe":"","chuli":"","usePosition":"1","bzhName":"1","sbbh":"","zcl":"1","shuiwenid":"","sjg1":"1","sjg2":"1","sjg3":"1","sjf1":"1","sjg4":"1","sjshui":"","sjg5":"1","sjf2":"1"}
     */

    private FieldEntity field;
    private boolean          success;
    private IsShowEntity     isShow;
    private List<DataEntity> data;

    public FieldEntity getField() {
        return field;
    }

    public void setField(FieldEntity field) {
        this.field = field;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public IsShowEntity getIsShow() {
        return isShow;
    }

    public void setIsShow(IsShowEntity isShow) {
        this.isShow = isShow;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class FieldEntity {
        /**
         * clTime : 时间
         * shenhe :
         * chuli :
         * usePosition :
         * bzhName : 拌合站名称
         * sbbh :
         * zcl : 总产量
         * shuiwenid : ShuiwenID
         * sjg1 : 实际骨料1
         * sjg2 : 实际骨料2
         * sjg3 : 实际骨料3
         * sjf1 : 水泥1
         * sjg4 : 实际骨料4
         * sjshui :
         * sjg5 : 实际骨料5
         * sjf2 : 水泥2
         */

        private String clTime;
        private String shenhe;
        private String chuli;
        private String usePosition;
        private String bzhName;
        private String sbbh;
        private String zcl;
        private String shuiwenid;
        private String sjg1;
        private String sjg2;
        private String sjg3;
        private String sjf1;
        private String sjg4;
        private String sjshui;
        private String sjg5;
        private String sjf2;

        public String getClTime() {
            return clTime;
        }

        public void setClTime(String clTime) {
            this.clTime = clTime;
        }

        public String getShenhe() {
            return shenhe;
        }

        public void setShenhe(String shenhe) {
            this.shenhe = shenhe;
        }

        public String getChuli() {
            return chuli;
        }

        public void setChuli(String chuli) {
            this.chuli = chuli;
        }

        public String getUsePosition() {
            return usePosition;
        }

        public void setUsePosition(String usePosition) {
            this.usePosition = usePosition;
        }

        public String getBzhName() {
            return bzhName;
        }

        public void setBzhName(String bzhName) {
            this.bzhName = bzhName;
        }

        public String getSbbh() {
            return sbbh;
        }

        public void setSbbh(String sbbh) {
            this.sbbh = sbbh;
        }

        public String getZcl() {
            return zcl;
        }

        public void setZcl(String zcl) {
            this.zcl = zcl;
        }

        public String getShuiwenid() {
            return shuiwenid;
        }

        public void setShuiwenid(String shuiwenid) {
            this.shuiwenid = shuiwenid;
        }

        public String getSjg1() {
            return sjg1;
        }

        public void setSjg1(String sjg1) {
            this.sjg1 = sjg1;
        }

        public String getSjg2() {
            return sjg2;
        }

        public void setSjg2(String sjg2) {
            this.sjg2 = sjg2;
        }

        public String getSjg3() {
            return sjg3;
        }

        public void setSjg3(String sjg3) {
            this.sjg3 = sjg3;
        }

        public String getSjf1() {
            return sjf1;
        }

        public void setSjf1(String sjf1) {
            this.sjf1 = sjf1;
        }

        public String getSjg4() {
            return sjg4;
        }

        public void setSjg4(String sjg4) {
            this.sjg4 = sjg4;
        }

        public String getSjshui() {
            return sjshui;
        }

        public void setSjshui(String sjshui) {
            this.sjshui = sjshui;
        }

        public String getSjg5() {
            return sjg5;
        }

        public void setSjg5(String sjg5) {
            this.sjg5 = sjg5;
        }

        public String getSjf2() {
            return sjf2;
        }

        public void setSjf2(String sjf2) {
            this.sjf2 = sjf2;
        }
    }

    public static class IsShowEntity {
        /**
         * clTime : 1
         * shenhe :
         * chuli :
         * usePosition : 1
         * bzhName : 1
         * sbbh :
         * zcl : 1
         * shuiwenid :
         * sjg1 : 1
         * sjg2 : 1
         * sjg3 : 1
         * sjf1 : 1
         * sjg4 : 1
         * sjshui :
         * sjg5 : 1
         * sjf2 : 1
         */

        private String clTime;
        private String shenhe;
        private String chuli;
        private String usePosition;
        private String bzhName;
        private String sbbh;
        private String zcl;
        private String shuiwenid;
        private String sjg1;
        private String sjg2;
        private String sjg3;
        private String sjf1;
        private String sjg4;
        private String sjshui;
        private String sjg5;
        private String sjf2;

        public String getClTime() {
            return clTime;
        }

        public void setClTime(String clTime) {
            this.clTime = clTime;
        }

        public String getShenhe() {
            return shenhe;
        }

        public void setShenhe(String shenhe) {
            this.shenhe = shenhe;
        }

        public String getChuli() {
            return chuli;
        }

        public void setChuli(String chuli) {
            this.chuli = chuli;
        }

        public String getUsePosition() {
            return usePosition;
        }

        public void setUsePosition(String usePosition) {
            this.usePosition = usePosition;
        }

        public String getBzhName() {
            return bzhName;
        }

        public void setBzhName(String bzhName) {
            this.bzhName = bzhName;
        }

        public String getSbbh() {
            return sbbh;
        }

        public void setSbbh(String sbbh) {
            this.sbbh = sbbh;
        }

        public String getZcl() {
            return zcl;
        }

        public void setZcl(String zcl) {
            this.zcl = zcl;
        }

        public String getShuiwenid() {
            return shuiwenid;
        }

        public void setShuiwenid(String shuiwenid) {
            this.shuiwenid = shuiwenid;
        }

        public String getSjg1() {
            return sjg1;
        }

        public void setSjg1(String sjg1) {
            this.sjg1 = sjg1;
        }

        public String getSjg2() {
            return sjg2;
        }

        public void setSjg2(String sjg2) {
            this.sjg2 = sjg2;
        }

        public String getSjg3() {
            return sjg3;
        }

        public void setSjg3(String sjg3) {
            this.sjg3 = sjg3;
        }

        public String getSjf1() {
            return sjf1;
        }

        public void setSjf1(String sjf1) {
            this.sjf1 = sjf1;
        }

        public String getSjg4() {
            return sjg4;
        }

        public void setSjg4(String sjg4) {
            this.sjg4 = sjg4;
        }

        public String getSjshui() {
            return sjshui;
        }

        public void setSjshui(String sjshui) {
            this.sjshui = sjshui;
        }

        public String getSjg5() {
            return sjg5;
        }

        public void setSjg5(String sjg5) {
            this.sjg5 = sjg5;
        }

        public String getSjf2() {
            return sjf2;
        }

        public void setSjf2(String sjf2) {
            this.sjf2 = sjf2;
        }
    }

    public static class DataEntity implements Serializable{
        /**
         * clTime : 2019-04-03 11:31:55
         * shenhe :
         * chuli : 0
         * usePosition :
         * bzhName : 盐城码头工程1号水稳站
         * sbbh : njpfsixsw01
         * zcl : 7185.50
         * shuiwenid : 1
         * sjg1 : 3
         * sjg2 :
         * sjg3 :
         * sjg4 :
         * sjf1 :
         * sjf2 :
         * sjg5 :
         * sjshui :
         */

        private String clTime;
        private String shenhe;
        private String chuli;
        private String usePosition;
        private String bzhName;
        private String sbbh;
        private String zcl;
        private String shuiwenid;
        private String sjg1;
        private String sjg2;
        private String sjg3;
        private String sjg4;
        private String sjf1;
        private String sjf2;
        private String sjg5;
        private String sjshui;

        public String getClTime() {
            return clTime;
        }

        public void setClTime(String clTime) {
            this.clTime = clTime;
        }

        public String getShenhe() {
            return shenhe;
        }

        public void setShenhe(String shenhe) {
            this.shenhe = shenhe;
        }

        public String getChuli() {
            return chuli;
        }

        public void setChuli(String chuli) {
            this.chuli = chuli;
        }

        public String getUsePosition() {
            return usePosition;
        }

        public void setUsePosition(String usePosition) {
            this.usePosition = usePosition;
        }

        public String getBzhName() {
            return bzhName;
        }

        public void setBzhName(String bzhName) {
            this.bzhName = bzhName;
        }

        public String getSbbh() {
            return sbbh;
        }

        public void setSbbh(String sbbh) {
            this.sbbh = sbbh;
        }

        public String getZcl() {
            return zcl;
        }

        public void setZcl(String zcl) {
            this.zcl = zcl;
        }

        public String getShuiwenid() {
            return shuiwenid;
        }

        public void setShuiwenid(String shuiwenid) {
            this.shuiwenid = shuiwenid;
        }

        public String getSjg1() {
            return sjg1;
        }

        public void setSjg1(String sjg1) {
            this.sjg1 = sjg1;
        }

        public String getSjg2() {
            return sjg2;
        }

        public void setSjg2(String sjg2) {
            this.sjg2 = sjg2;
        }

        public String getSjg3() {
            return sjg3;
        }

        public void setSjg3(String sjg3) {
            this.sjg3 = sjg3;
        }

        public String getSjg4() {
            return sjg4;
        }

        public void setSjg4(String sjg4) {
            this.sjg4 = sjg4;
        }

        public String getSjf1() {
            return sjf1;
        }

        public void setSjf1(String sjf1) {
            this.sjf1 = sjf1;
        }

        public String getSjf2() {
            return sjf2;
        }

        public void setSjf2(String sjf2) {
            this.sjf2 = sjf2;
        }

        public String getSjg5() {
            return sjg5;
        }

        public void setSjg5(String sjg5) {
            this.sjg5 = sjg5;
        }

        public String getSjshui() {
            return sjshui;
        }

        public void setSjshui(String sjshui) {
            this.sjshui = sjshui;
        }
    }
}
