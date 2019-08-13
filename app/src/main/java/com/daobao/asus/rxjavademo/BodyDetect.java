package com.daobao.asus.rxjavademo;

public class BodyDetect {

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 必填
     * 图片信息(总数据大小应小于10M)，图片上传方式根据image_type来判断
     */
    private String image;

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    /**
     * 必填
     * 图片类型
     * BASE64:图片的base64值，base64编码后的图片数据，编码后的图片大小不超过2M；
     * URL:图片的 URL地址( 可能由于网络等原因导致下载图片时间过长)；
     * FACE_TOKEN: 人脸图片的唯一标识，调用人脸检测接口时，会为每个人脸图片赋予一个唯一的FACE_TOKEN，同一张图片多次检测得到的FACE_TOKEN是同一个。
     */
    private String image_type;

    public void setGroup_id_list(String group_id_list) {
        this.group_id_list = group_id_list;
    }

    private String group_id_list;

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    private String access_token;
}