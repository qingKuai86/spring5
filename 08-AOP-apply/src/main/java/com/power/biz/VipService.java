package com.power.biz;

import org.springframework.stereotype.Component;

@Component
public class VipService {

        public void getVip(){
            System.out.println("获取Vip信息");
        }
        public void saveVip(){
            System.out.println("保存Vip信息");
        }
        public void deleteVip(){
            System.out.println("删除Vip信息");
        }
        public void modifyVip(){
            System.out.println("修改Vip信息");
        }
}
