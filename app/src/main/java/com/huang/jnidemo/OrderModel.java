package com.huang.jnidemo;

import java.util.List;

/**
 * Created by Administrator on 2016/8/12.
 */
public class OrderModel {
    public int status;
    public String msg;
    public String totalPriceAll;
    public String totalFreight;
    public AddressBean address;
    public List<InfoBean> info;
    public static class AddressBean {
        public String id;
        public String uid;
        public String province;
        public String city;
        public String district;
        public String is_default;
        public String consignee;
        public String province_name;
        public String city_name;
        public String district_name;
        public String address;
        public String zip;
        public String mobile;
        public String area_code;
        public String landline_number;
        public String extension_number;
    }
    public static class InfoBean {
        public ShopInformationBean shopInformation;
        public int status;
        public int sum;
        public int totalPrice;
        public int freight;
        public List<?> couponInformation;
        public List<ShoppingSBean> shoppingS;
        public static class ShopInformationBean {
            public String id;
            public String uid;
            public String daren;
            public String menu_id;
            public String mould_id;
            public String shop_name;
            public String email;
            public String shop_hours_stat_h;
            public String shop_hours_end_h;
            public String tell;
            public String address;
            public String map_remark;
            public String logo_img;
            public String time;
            public String status;
            public String phone;
            public String shop_remark;
            public String store_bm;
            public String bm_img;
            public String store_url;
            public String lng;
            public String lat;
            public String ap;
            public String ac;
            public String ax;
            public String shanquan;
            public String banner_img;
            public String order;
            public String contents;
            public String store_img_id;
            public String cate_id;
            public String tui;
            public String username;
            public String store_ad;
            public String lastsave;
            public String close;
            public String store_big_ad;
            public String ad_title;
            public String ad_contents;
            public String compete;
            public String time1;
            public String time2;

        }
        public static class ShoppingSBean {
            public String id;
            public String userid;
            public String itemid;
            public String num;
            public String price;
            public ShuxingBean shuxing;
            public String numid;
            public String time;
            public String type;
            public String storeid;
            public String fid;
            public String newid;
            public String price_status;
            public String productImg;
            public String productName;
            public ProductBean product;
            public int promotion_markup;
            public String promotion_price;
            public static class ShuxingBean {
                public String id;
                public String pay;
                public String num;
                public String itemid;
                public String price;
                public String cle_price;
                public String start_time;
                public String end_time;
            }
            public static class ProductBean {
                public String id;
                public String img;
                public String price;
                public String over;
                public String title;
                public String clearance;
                public String uname;
            }
        }
    }
}
