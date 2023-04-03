package com.findbang.login.controller;

import com.findbang.login.service.LoginMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class LoginMainController {

    // @Autowired 사용 금지, 객체주입은 생성자를 만들어서 주입한다. 순환참조 방지
    private static LoginMainService loginMainService;



}
