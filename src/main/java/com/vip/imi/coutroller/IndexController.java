package com.vip.imi.coutroller;

import com.vip.imi.service.IndexService;
import com.vip.imi.utils.CateBean;
import com.vip.imi.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class IndexController {
    @Resource
    IndexService indexService;
    @RequestMapping("/heads")
    public Result list(){
        try {
            CateBean header = indexService.getTNavigationVo();
            return Result.success(header);
        }catch (Exception e){
            return Result.error();
        }
    }
}
