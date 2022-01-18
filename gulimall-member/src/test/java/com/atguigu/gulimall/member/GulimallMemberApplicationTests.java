package com.atguigu.gulimall.member;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    private MemberService memberService;

    @Test
    void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setLevelId(1L);
        memberEntity.setUsername("张三");
        memberEntity.setNickname("法外狂徒");
        memberService.save(memberEntity);
        System.out.println("member成员保存成功！");
    }

}
