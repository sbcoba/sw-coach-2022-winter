package com.swcoaching.example1.controller;

import com.swcoaching.example1.member.Member;
import com.swcoaching.example1.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MemberController {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final MemberService memberService;

  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/member")
  public Member getHello(String username) {
    Member member = memberService.findByUsername(username);
    logger.info("Member: {}", member);
    return member;
  }
}
