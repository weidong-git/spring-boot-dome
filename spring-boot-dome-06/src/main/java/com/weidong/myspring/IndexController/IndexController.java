/**
 * Copyright (C), 2017-2017, 1130160475@qq.com
 * FileName: IndexController
 * Author:   ${1130160475@qq.com}
 * Date:     2017/11/15 0015 下午 9:43
 * Description: 主控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.weidong.myspring.IndexController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("index")
    public String index(ModelMap map){
        logger.info("这里是controller");
        map.put("title", "hello world");
        return "index"; // 注意，不要在最前面加上/，linux下面会出错
    }

}