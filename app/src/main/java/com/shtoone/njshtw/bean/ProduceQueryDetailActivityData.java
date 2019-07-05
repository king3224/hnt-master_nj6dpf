package com.shtoone.njshtw.bean;

import java.util.List;

/**
 * Created by leguang on 2016/7/25 0025.
 */
public class ProduceQueryDetailActivityData {


    /**
     * headMsg : {"chuliaoshijian":"2017-07-10 11:02:00","peifanghao":"6","xinxibianhao":0,"sid":"","qiangdudengji":"C30","shenhe":"","chuli":"","gongchengmingcheng":"G328","chaozuozhe":"夏国喜","id":"","gongdanhao":"95","gujifangshu":"2.799","waijiajipingzhong":"2.8","sigongdidian":"二队","jiaobanshijian":"83","banhezhanminchen":"G328施工2标1号机","shuinipingzhong":"14658|1","jiaozuobuwei":"场地硬化"}
     * data : [{"peibi":"844","name":"细砂","shiji":"823","cbGrade":"","wuchazhi":"-21","wuchalv":"-2.49"},{"peibi":"1154","name":"中粗砂","shiji":"1150","cbGrade":"","wuchazhi":"-4","wuchalv":"-0.35"},{"peibi":"1624","name":"碎石1","shiji":"1623","cbGrade":"","wuchazhi":"-1","wuchalv":"-0.06"},{"peibi":"1680","name":"碎石2","shiji":"1689","cbGrade":"","wuchazhi":"9","wuchalv":"0.54"},{"peibi":"0","name":"碎石3","shiji":"0","cbGrade":"","wuchazhi":"0","wuchalv":"0.00"},{"peibi":"756","name":"水泥","shiji":"769","cbGrade":"","wuchazhi":"13","wuchalv":"1.72"},{"peibi":"0","name":"水泥2","shiji":"0","cbGrade":"","wuchazhi":"0","wuchalv":"0.00"},{"peibi":"0","name":"矿粉","shiji":"0","cbGrade":"","wuchazhi":"0","wuchalv":"0.00"},{"peibi":"112","name":"煤灰","shiji":"112","cbGrade":"","wuchazhi":"0","wuchalv":"0.00"},{"peibi":"368","name":"水","shiji":"369","cbGrade":"","wuchazhi":"1","wuchalv":"0.27"},{"peibi":"12.88","name":"减水剂1","shiji":"12.99","cbGrade":"","wuchazhi":"0.11","wuchalv":"0.85"}]
     * hbfield : {"waijiaji3_lilunzhi":"外加剂3(施工)","feimeihui4_lilunzhi":"煤灰(施工)","shui2_lilunzhi":"水2(施工)","waijiaji1_shijizhi":"减水剂1","waijiaji4_shijizhi":"外加剂4","shi1_lilunzhi":"中粗砂(施工)","shi2_shijizhi":"碎石1","waijiaji1_lilunzhi":"减水剂1(施工)","shi2_lilunzhi":"碎石1(施工)","fenliao6_lilunzhi":"粉料6(施工)","leixin":"1","sha1_lilunzhi":"细砂(施工)","shui1_lilunzhi":"水(施工)","waijiaji2_shijizhi":"减水剂2","peifanghao":"施工配合比编号","waijiaji4_lilunzhi":"外加剂4(施工)","qiangdudengji":"强度等级","smsbaojin":"1","chaozuozhe":"操作者","caijishijian":"采集时间","sigongdidian":"地点/里程","shuinipingzhong":"水泥品种","fenliao5_shijizhi":"粉料5","baocunshijian":"保存时间","guliao5_shijizhi":"碎石3","kuangfen3_lilunzhi":"矿粉(施工)","shuini2_shijizhi":"水泥2","id":"33","gongdanhao":"工单号","sha2_lilunzhi":"碎石2(施工)","shi1_shijizhi":"中粗砂","waijiaji3_shijizhi":"外加剂3","fenliao5_lilunzhi":"粉料5(施工)","jiaobanshijian":"系统参数","chuliaoshijian":"出料时间","shuini1_lilunzhi":"水泥(施工)","shui1_shijizhi":"水","departid":"8a9b6e2e5c2e1ef0015c3a9ffce8008c","kuangfen3_shijizhi":"矿粉","guliao5_lilunzhi":"碎石3(施工)","jianchen":"2标1机","gongchengmingcheng":"工程名称","waijiaji2_lilunzhi":"减水剂2(施工)","shebeibianhao":"设备编号","feimeihui4_shijizhi":"煤灰","gujifangshu":"数量","shuini1_shijizhi":"水泥","waijiajipingzhong":"外加剂品种","sha2_shijizhi":"碎石2","shuini2_lilunzhi":"水泥2(施工)","sha1_shijizhi":"细砂","banhezhanminchen":"G328施工2标1号机","gprsbianhao":"njpfsixhnt0201","shui2_shijizhi":"水2","fenliao6_shijizhi":"粉料6","jiaozuobuwei":"浇筑部位"}
     * success : true
     */

    private HeadMsgBean headMsg;
    private HbfieldBean hbfield;
    private boolean success;
    private List<DataBean> data;

    public HeadMsgBean getHeadMsg() {
        return headMsg;
    }

    public void setHeadMsg(HeadMsgBean headMsg) {
        this.headMsg = headMsg;
    }

    public HbfieldBean getHbfield() {
        return hbfield;
    }

    public void setHbfield(HbfieldBean hbfield) {
        this.hbfield = hbfield;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class HeadMsgBean {
        /**
         * chuliaoshijian : 2017-07-10 11:02:00
         * peifanghao : 6
         * xinxibianhao : 0
         * sid :
         * qiangdudengji : C30
         * shenhe :
         * chuli :
         * gongchengmingcheng : G328
         * chaozuozhe : 夏国喜
         * id :
         * gongdanhao : 95
         * gujifangshu : 2.799
         * waijiajipingzhong : 2.8
         * sigongdidian : 二队
         * jiaobanshijian : 83
         * banhezhanminchen : G328施工2标1号机
         * shuinipingzhong : 14658|1
         * jiaozuobuwei : 场地硬化
         */

        private String chuliaoshijian;
        private String peifanghao;
        private int xinxibianhao;
        private String sid;
        private String qiangdudengji;
        private String shenhe;
        private String chuli;
        private String gongchengmingcheng;
        private String chaozuozhe;
        private String id;
        private String gongdanhao;
        private String gujifangshu;
        private String waijiajipingzhong;
        private String sigongdidian;
        private String jiaobanshijian;
        private String banhezhanminchen;
        private String shuinipingzhong;
        private String jiaozuobuwei;

        public String getChuliaoshijian() {
            return chuliaoshijian;
        }

        public void setChuliaoshijian(String chuliaoshijian) {
            this.chuliaoshijian = chuliaoshijian;
        }

        public String getPeifanghao() {
            return peifanghao;
        }

        public void setPeifanghao(String peifanghao) {
            this.peifanghao = peifanghao;
        }

        public int getXinxibianhao() {
            return xinxibianhao;
        }

        public void setXinxibianhao(int xinxibianhao) {
            this.xinxibianhao = xinxibianhao;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getQiangdudengji() {
            return qiangdudengji;
        }

        public void setQiangdudengji(String qiangdudengji) {
            this.qiangdudengji = qiangdudengji;
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

        public String getGongchengmingcheng() {
            return gongchengmingcheng;
        }

        public void setGongchengmingcheng(String gongchengmingcheng) {
            this.gongchengmingcheng = gongchengmingcheng;
        }

        public String getChaozuozhe() {
            return chaozuozhe;
        }

        public void setChaozuozhe(String chaozuozhe) {
            this.chaozuozhe = chaozuozhe;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGongdanhao() {
            return gongdanhao;
        }

        public void setGongdanhao(String gongdanhao) {
            this.gongdanhao = gongdanhao;
        }

        public String getGujifangshu() {
            return gujifangshu;
        }

        public void setGujifangshu(String gujifangshu) {
            this.gujifangshu = gujifangshu;
        }

        public String getWaijiajipingzhong() {
            return waijiajipingzhong;
        }

        public void setWaijiajipingzhong(String waijiajipingzhong) {
            this.waijiajipingzhong = waijiajipingzhong;
        }

        public String getSigongdidian() {
            return sigongdidian;
        }

        public void setSigongdidian(String sigongdidian) {
            this.sigongdidian = sigongdidian;
        }

        public String getJiaobanshijian() {
            return jiaobanshijian;
        }

        public void setJiaobanshijian(String jiaobanshijian) {
            this.jiaobanshijian = jiaobanshijian;
        }

        public String getBanhezhanminchen() {
            return banhezhanminchen;
        }

        public void setBanhezhanminchen(String banhezhanminchen) {
            this.banhezhanminchen = banhezhanminchen;
        }

        public String getShuinipingzhong() {
            return shuinipingzhong;
        }

        public void setShuinipingzhong(String shuinipingzhong) {
            this.shuinipingzhong = shuinipingzhong;
        }

        public String getJiaozuobuwei() {
            return jiaozuobuwei;
        }

        public void setJiaozuobuwei(String jiaozuobuwei) {
            this.jiaozuobuwei = jiaozuobuwei;
        }
    }

    public static class HbfieldBean {
        /**
         * waijiaji3_lilunzhi : 外加剂3(施工)
         * feimeihui4_lilunzhi : 煤灰(施工)
         * shui2_lilunzhi : 水2(施工)
         * waijiaji1_shijizhi : 减水剂1
         * waijiaji4_shijizhi : 外加剂4
         * shi1_lilunzhi : 中粗砂(施工)
         * shi2_shijizhi : 碎石1
         * waijiaji1_lilunzhi : 减水剂1(施工)
         * shi2_lilunzhi : 碎石1(施工)
         * fenliao6_lilunzhi : 粉料6(施工)
         * leixin : 1
         * sha1_lilunzhi : 细砂(施工)
         * shui1_lilunzhi : 水(施工)
         * waijiaji2_shijizhi : 减水剂2
         * peifanghao : 施工配合比编号
         * waijiaji4_lilunzhi : 外加剂4(施工)
         * qiangdudengji : 强度等级
         * smsbaojin : 1
         * chaozuozhe : 操作者
         * caijishijian : 采集时间
         * sigongdidian : 地点/里程
         * shuinipingzhong : 水泥品种
         * fenliao5_shijizhi : 粉料5
         * baocunshijian : 保存时间
         * guliao5_shijizhi : 碎石3
         * kuangfen3_lilunzhi : 矿粉(施工)
         * shuini2_shijizhi : 水泥2
         * id : 33
         * gongdanhao : 工单号
         * sha2_lilunzhi : 碎石2(施工)
         * shi1_shijizhi : 中粗砂
         * waijiaji3_shijizhi : 外加剂3
         * fenliao5_lilunzhi : 粉料5(施工)
         * jiaobanshijian : 系统参数
         * chuliaoshijian : 出料时间
         * shuini1_lilunzhi : 水泥(施工)
         * shui1_shijizhi : 水
         * departid : 8a9b6e2e5c2e1ef0015c3a9ffce8008c
         * kuangfen3_shijizhi : 矿粉
         * guliao5_lilunzhi : 碎石3(施工)
         * jianchen : 2标1机
         * gongchengmingcheng : 工程名称
         * waijiaji2_lilunzhi : 减水剂2(施工)
         * shebeibianhao : 设备编号
         * feimeihui4_shijizhi : 煤灰
         * gujifangshu : 数量
         * shuini1_shijizhi : 水泥
         * waijiajipingzhong : 外加剂品种
         * sha2_shijizhi : 碎石2
         * shuini2_lilunzhi : 水泥2(施工)
         * sha1_shijizhi : 细砂
         * banhezhanminchen : G328施工2标1号机
         * gprsbianhao : njpfsixhnt0201
         * shui2_shijizhi : 水2
         * fenliao6_shijizhi : 粉料6
         * jiaozuobuwei : 浇筑部位
         */

        private String waijiaji3_lilunzhi;
        private String feimeihui4_lilunzhi;
        private String shui2_lilunzhi;
        private String waijiaji1_shijizhi;
        private String waijiaji4_shijizhi;
        private String shi1_lilunzhi;
        private String shi2_shijizhi;
        private String waijiaji1_lilunzhi;
        private String shi2_lilunzhi;
        private String fenliao6_lilunzhi;
        private String leixin;
        private String sha1_lilunzhi;
        private String shui1_lilunzhi;
        private String waijiaji2_shijizhi;
        private String peifanghao;
        private String waijiaji4_lilunzhi;
        private String qiangdudengji;
        private String smsbaojin;
        private String chaozuozhe;
        private String caijishijian;
        private String sigongdidian;
        private String shuinipingzhong;
        private String fenliao5_shijizhi;
        private String baocunshijian;
        private String guliao5_shijizhi;
        private String kuangfen3_lilunzhi;
        private String shuini2_shijizhi;
        private String id;
        private String gongdanhao;
        private String sha2_lilunzhi;
        private String shi1_shijizhi;
        private String waijiaji3_shijizhi;
        private String fenliao5_lilunzhi;
        private String jiaobanshijian;
        private String chuliaoshijian;
        private String shuini1_lilunzhi;
        private String shui1_shijizhi;
        private String departid;
        private String kuangfen3_shijizhi;
        private String guliao5_lilunzhi;
        private String jianchen;
        private String gongchengmingcheng;
        private String waijiaji2_lilunzhi;
        private String shebeibianhao;
        private String feimeihui4_shijizhi;
        private String gujifangshu;
        private String shuini1_shijizhi;
        private String waijiajipingzhong;
        private String sha2_shijizhi;
        private String shuini2_lilunzhi;
        private String sha1_shijizhi;
        private String banhezhanminchen;
        private String gprsbianhao;
        private String shui2_shijizhi;
        private String fenliao6_shijizhi;
        private String jiaozuobuwei;

        public String getWaijiaji3_lilunzhi() {
            return waijiaji3_lilunzhi;
        }

        public void setWaijiaji3_lilunzhi(String waijiaji3_lilunzhi) {
            this.waijiaji3_lilunzhi = waijiaji3_lilunzhi;
        }

        public String getFeimeihui4_lilunzhi() {
            return feimeihui4_lilunzhi;
        }

        public void setFeimeihui4_lilunzhi(String feimeihui4_lilunzhi) {
            this.feimeihui4_lilunzhi = feimeihui4_lilunzhi;
        }

        public String getShui2_lilunzhi() {
            return shui2_lilunzhi;
        }

        public void setShui2_lilunzhi(String shui2_lilunzhi) {
            this.shui2_lilunzhi = shui2_lilunzhi;
        }

        public String getWaijiaji1_shijizhi() {
            return waijiaji1_shijizhi;
        }

        public void setWaijiaji1_shijizhi(String waijiaji1_shijizhi) {
            this.waijiaji1_shijizhi = waijiaji1_shijizhi;
        }

        public String getWaijiaji4_shijizhi() {
            return waijiaji4_shijizhi;
        }

        public void setWaijiaji4_shijizhi(String waijiaji4_shijizhi) {
            this.waijiaji4_shijizhi = waijiaji4_shijizhi;
        }

        public String getShi1_lilunzhi() {
            return shi1_lilunzhi;
        }

        public void setShi1_lilunzhi(String shi1_lilunzhi) {
            this.shi1_lilunzhi = shi1_lilunzhi;
        }

        public String getShi2_shijizhi() {
            return shi2_shijizhi;
        }

        public void setShi2_shijizhi(String shi2_shijizhi) {
            this.shi2_shijizhi = shi2_shijizhi;
        }

        public String getWaijiaji1_lilunzhi() {
            return waijiaji1_lilunzhi;
        }

        public void setWaijiaji1_lilunzhi(String waijiaji1_lilunzhi) {
            this.waijiaji1_lilunzhi = waijiaji1_lilunzhi;
        }

        public String getShi2_lilunzhi() {
            return shi2_lilunzhi;
        }

        public void setShi2_lilunzhi(String shi2_lilunzhi) {
            this.shi2_lilunzhi = shi2_lilunzhi;
        }

        public String getFenliao6_lilunzhi() {
            return fenliao6_lilunzhi;
        }

        public void setFenliao6_lilunzhi(String fenliao6_lilunzhi) {
            this.fenliao6_lilunzhi = fenliao6_lilunzhi;
        }

        public String getLeixin() {
            return leixin;
        }

        public void setLeixin(String leixin) {
            this.leixin = leixin;
        }

        public String getSha1_lilunzhi() {
            return sha1_lilunzhi;
        }

        public void setSha1_lilunzhi(String sha1_lilunzhi) {
            this.sha1_lilunzhi = sha1_lilunzhi;
        }

        public String getShui1_lilunzhi() {
            return shui1_lilunzhi;
        }

        public void setShui1_lilunzhi(String shui1_lilunzhi) {
            this.shui1_lilunzhi = shui1_lilunzhi;
        }

        public String getWaijiaji2_shijizhi() {
            return waijiaji2_shijizhi;
        }

        public void setWaijiaji2_shijizhi(String waijiaji2_shijizhi) {
            this.waijiaji2_shijizhi = waijiaji2_shijizhi;
        }

        public String getPeifanghao() {
            return peifanghao;
        }

        public void setPeifanghao(String peifanghao) {
            this.peifanghao = peifanghao;
        }

        public String getWaijiaji4_lilunzhi() {
            return waijiaji4_lilunzhi;
        }

        public void setWaijiaji4_lilunzhi(String waijiaji4_lilunzhi) {
            this.waijiaji4_lilunzhi = waijiaji4_lilunzhi;
        }

        public String getQiangdudengji() {
            return qiangdudengji;
        }

        public void setQiangdudengji(String qiangdudengji) {
            this.qiangdudengji = qiangdudengji;
        }

        public String getSmsbaojin() {
            return smsbaojin;
        }

        public void setSmsbaojin(String smsbaojin) {
            this.smsbaojin = smsbaojin;
        }

        public String getChaozuozhe() {
            return chaozuozhe;
        }

        public void setChaozuozhe(String chaozuozhe) {
            this.chaozuozhe = chaozuozhe;
        }

        public String getCaijishijian() {
            return caijishijian;
        }

        public void setCaijishijian(String caijishijian) {
            this.caijishijian = caijishijian;
        }

        public String getSigongdidian() {
            return sigongdidian;
        }

        public void setSigongdidian(String sigongdidian) {
            this.sigongdidian = sigongdidian;
        }

        public String getShuinipingzhong() {
            return shuinipingzhong;
        }

        public void setShuinipingzhong(String shuinipingzhong) {
            this.shuinipingzhong = shuinipingzhong;
        }

        public String getFenliao5_shijizhi() {
            return fenliao5_shijizhi;
        }

        public void setFenliao5_shijizhi(String fenliao5_shijizhi) {
            this.fenliao5_shijizhi = fenliao5_shijizhi;
        }

        public String getBaocunshijian() {
            return baocunshijian;
        }

        public void setBaocunshijian(String baocunshijian) {
            this.baocunshijian = baocunshijian;
        }

        public String getGuliao5_shijizhi() {
            return guliao5_shijizhi;
        }

        public void setGuliao5_shijizhi(String guliao5_shijizhi) {
            this.guliao5_shijizhi = guliao5_shijizhi;
        }

        public String getKuangfen3_lilunzhi() {
            return kuangfen3_lilunzhi;
        }

        public void setKuangfen3_lilunzhi(String kuangfen3_lilunzhi) {
            this.kuangfen3_lilunzhi = kuangfen3_lilunzhi;
        }

        public String getShuini2_shijizhi() {
            return shuini2_shijizhi;
        }

        public void setShuini2_shijizhi(String shuini2_shijizhi) {
            this.shuini2_shijizhi = shuini2_shijizhi;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGongdanhao() {
            return gongdanhao;
        }

        public void setGongdanhao(String gongdanhao) {
            this.gongdanhao = gongdanhao;
        }

        public String getSha2_lilunzhi() {
            return sha2_lilunzhi;
        }

        public void setSha2_lilunzhi(String sha2_lilunzhi) {
            this.sha2_lilunzhi = sha2_lilunzhi;
        }

        public String getShi1_shijizhi() {
            return shi1_shijizhi;
        }

        public void setShi1_shijizhi(String shi1_shijizhi) {
            this.shi1_shijizhi = shi1_shijizhi;
        }

        public String getWaijiaji3_shijizhi() {
            return waijiaji3_shijizhi;
        }

        public void setWaijiaji3_shijizhi(String waijiaji3_shijizhi) {
            this.waijiaji3_shijizhi = waijiaji3_shijizhi;
        }

        public String getFenliao5_lilunzhi() {
            return fenliao5_lilunzhi;
        }

        public void setFenliao5_lilunzhi(String fenliao5_lilunzhi) {
            this.fenliao5_lilunzhi = fenliao5_lilunzhi;
        }

        public String getJiaobanshijian() {
            return jiaobanshijian;
        }

        public void setJiaobanshijian(String jiaobanshijian) {
            this.jiaobanshijian = jiaobanshijian;
        }

        public String getChuliaoshijian() {
            return chuliaoshijian;
        }

        public void setChuliaoshijian(String chuliaoshijian) {
            this.chuliaoshijian = chuliaoshijian;
        }

        public String getShuini1_lilunzhi() {
            return shuini1_lilunzhi;
        }

        public void setShuini1_lilunzhi(String shuini1_lilunzhi) {
            this.shuini1_lilunzhi = shuini1_lilunzhi;
        }

        public String getShui1_shijizhi() {
            return shui1_shijizhi;
        }

        public void setShui1_shijizhi(String shui1_shijizhi) {
            this.shui1_shijizhi = shui1_shijizhi;
        }

        public String getDepartid() {
            return departid;
        }

        public void setDepartid(String departid) {
            this.departid = departid;
        }

        public String getKuangfen3_shijizhi() {
            return kuangfen3_shijizhi;
        }

        public void setKuangfen3_shijizhi(String kuangfen3_shijizhi) {
            this.kuangfen3_shijizhi = kuangfen3_shijizhi;
        }

        public String getGuliao5_lilunzhi() {
            return guliao5_lilunzhi;
        }

        public void setGuliao5_lilunzhi(String guliao5_lilunzhi) {
            this.guliao5_lilunzhi = guliao5_lilunzhi;
        }

        public String getJianchen() {
            return jianchen;
        }

        public void setJianchen(String jianchen) {
            this.jianchen = jianchen;
        }

        public String getGongchengmingcheng() {
            return gongchengmingcheng;
        }

        public void setGongchengmingcheng(String gongchengmingcheng) {
            this.gongchengmingcheng = gongchengmingcheng;
        }

        public String getWaijiaji2_lilunzhi() {
            return waijiaji2_lilunzhi;
        }

        public void setWaijiaji2_lilunzhi(String waijiaji2_lilunzhi) {
            this.waijiaji2_lilunzhi = waijiaji2_lilunzhi;
        }

        public String getShebeibianhao() {
            return shebeibianhao;
        }

        public void setShebeibianhao(String shebeibianhao) {
            this.shebeibianhao = shebeibianhao;
        }

        public String getFeimeihui4_shijizhi() {
            return feimeihui4_shijizhi;
        }

        public void setFeimeihui4_shijizhi(String feimeihui4_shijizhi) {
            this.feimeihui4_shijizhi = feimeihui4_shijizhi;
        }

        public String getGujifangshu() {
            return gujifangshu;
        }

        public void setGujifangshu(String gujifangshu) {
            this.gujifangshu = gujifangshu;
        }

        public String getShuini1_shijizhi() {
            return shuini1_shijizhi;
        }

        public void setShuini1_shijizhi(String shuini1_shijizhi) {
            this.shuini1_shijizhi = shuini1_shijizhi;
        }

        public String getWaijiajipingzhong() {
            return waijiajipingzhong;
        }

        public void setWaijiajipingzhong(String waijiajipingzhong) {
            this.waijiajipingzhong = waijiajipingzhong;
        }

        public String getSha2_shijizhi() {
            return sha2_shijizhi;
        }

        public void setSha2_shijizhi(String sha2_shijizhi) {
            this.sha2_shijizhi = sha2_shijizhi;
        }

        public String getShuini2_lilunzhi() {
            return shuini2_lilunzhi;
        }

        public void setShuini2_lilunzhi(String shuini2_lilunzhi) {
            this.shuini2_lilunzhi = shuini2_lilunzhi;
        }

        public String getSha1_shijizhi() {
            return sha1_shijizhi;
        }

        public void setSha1_shijizhi(String sha1_shijizhi) {
            this.sha1_shijizhi = sha1_shijizhi;
        }

        public String getBanhezhanminchen() {
            return banhezhanminchen;
        }

        public void setBanhezhanminchen(String banhezhanminchen) {
            this.banhezhanminchen = banhezhanminchen;
        }

        public String getGprsbianhao() {
            return gprsbianhao;
        }

        public void setGprsbianhao(String gprsbianhao) {
            this.gprsbianhao = gprsbianhao;
        }

        public String getShui2_shijizhi() {
            return shui2_shijizhi;
        }

        public void setShui2_shijizhi(String shui2_shijizhi) {
            this.shui2_shijizhi = shui2_shijizhi;
        }

        public String getFenliao6_shijizhi() {
            return fenliao6_shijizhi;
        }

        public void setFenliao6_shijizhi(String fenliao6_shijizhi) {
            this.fenliao6_shijizhi = fenliao6_shijizhi;
        }

        public String getJiaozuobuwei() {
            return jiaozuobuwei;
        }

        public void setJiaozuobuwei(String jiaozuobuwei) {
            this.jiaozuobuwei = jiaozuobuwei;
        }
    }

    public static class DataBean {
        /**
         * peibi : 844
         * name : 细砂
         * shiji : 823
         * cbGrade :
         * wuchazhi : -21
         * wuchalv : -2.49
         */

        private String peibi;
        private String name;
        private String shiji;
        private String cbGrade;
        private String wuchazhi;
        private String wuchalv;

        public String getPeibi() {
            return peibi;
        }

        public void setPeibi(String peibi) {
            this.peibi = peibi;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShiji() {
            return shiji;
        }

        public void setShiji(String shiji) {
            this.shiji = shiji;
        }

        public String getCbGrade() {
            return cbGrade;
        }

        public void setCbGrade(String cbGrade) {
            this.cbGrade = cbGrade;
        }

        public String getWuchazhi() {
            return wuchazhi;
        }

        public void setWuchazhi(String wuchazhi) {
            this.wuchazhi = wuchazhi;
        }

        public String getWuchalv() {
            return wuchalv;
        }

        public void setWuchalv(String wuchalv) {
            this.wuchalv = wuchalv;
        }
    }
}
