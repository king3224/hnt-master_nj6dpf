package com.shtoone.njshtw.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2019/5/8.
 */

public class WaterStablityProduceQueryData {


    /**
     * data : [{"id":2,"glchangliang":"78826.3499736785","shijians":"2019-05-07 13:53:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"72101.026058197","shijians":"2019-05-07 13:43:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"76592.7369594573","shijians":"2019-05-07 13:33:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"76087.5785350799","shijians":"2019-05-07 13:23:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78769.193649292","shijians":"2019-05-07 13:13:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"66121.6819286347","shijians":"2019-05-07 13:03:32","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"61870.3768253327","shijians":"2019-05-07 12:53:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78821.135520935","shijians":"2019-05-07 12:43:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78783.5483551025","shijians":"2019-05-07 12:33:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78564.3935203552","shijians":"2019-05-07 12:23:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"76825.5178928375","shijians":"2019-05-07 12:13:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78316.7049884796","shijians":"2019-05-07 12:03:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"78496.4411258697","shijians":"2019-05-07 11:53:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"2349.8555123806","shijians":"2019-05-07 11:43:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"},{"id":2,"glchangliang":"71853.6210060121","shijians":"2019-05-07 10:53:31","jianchen":"盐城码头工程1号水稳站","banhezhanminchen":"盐城码头工程1号水稳站","deptId":"8a9b6e2e66483b59016651a517c4000b","shebeibianhao":"njpfsixsw01","sjshui":"0"}]
     * success : true
     */

    private boolean success;
    private List<DataEntity> data;

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

    public static class DataEntity implements Serializable{
        /**
         * id : 2
         * glchangliang : 78826.3499736785
         * shijians : 2019-05-07 13:53:32
         * jianchen : 盐城码头工程1号水稳站
         * banhezhanminchen : 盐城码头工程1号水稳站
         * deptId : 8a9b6e2e66483b59016651a517c4000b
         * shebeibianhao : njpfsixsw01
         * sjshui : 0
         */

        private int id;
        private String glchangliang;
        private String shijians;
        private String jianchen;
        private String banhezhanminchen;
        private String deptId;
        private String shebeibianhao;
        private String sjshui;
        private String shuiwenid;

        public String getShuiwenid() {
            return shuiwenid;
        }

        public void setShuiwenid(String shuiwenid) {
            this.shuiwenid = shuiwenid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGlchangliang() {
            return glchangliang;
        }

        public void setGlchangliang(String glchangliang) {
            this.glchangliang = glchangliang;
        }

        public String getShijians() {
            return shijians;
        }

        public void setShijians(String shijians) {
            this.shijians = shijians;
        }

        public String getJianchen() {
            return jianchen;
        }

        public void setJianchen(String jianchen) {
            this.jianchen = jianchen;
        }

        public String getBanhezhanminchen() {
            return banhezhanminchen;
        }

        public void setBanhezhanminchen(String banhezhanminchen) {
            this.banhezhanminchen = banhezhanminchen;
        }

        public String getDeptId() {
            return deptId;
        }

        public void setDeptId(String deptId) {
            this.deptId = deptId;
        }

        public String getShebeibianhao() {
            return shebeibianhao;
        }

        public void setShebeibianhao(String shebeibianhao) {
            this.shebeibianhao = shebeibianhao;
        }

        public String getSjshui() {
            return sjshui;
        }

        public void setSjshui(String sjshui) {
            this.sjshui = sjshui;
        }
    }
}
