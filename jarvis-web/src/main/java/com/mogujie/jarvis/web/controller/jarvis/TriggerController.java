package com.mogujie.jarvis.web.controller.jarvis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hejian on 15/9/15.
 */
@Controller
@RequestMapping("/jarvis/trigger")
public class TriggerController extends BaseController{

    @RequestMapping
    public String index(){

        return "trigger/index";
    }
}