/*
 * # iohao.com . 渔民小镇
 * Copyright (C) 2021 - 2022 double joker （262610965@qq.com） . All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iohao.example.jsr.action;

import com.iohao.example.jsr.pb.JsrJakartaPb;
import com.iohao.game.action.skeleton.annotation.ActionController;
import com.iohao.game.action.skeleton.annotation.ActionMethod;
import com.iohao.game.example.common.cmd.JsrCmd;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 渔民小镇
 * @date 2022-10-26
 */
@Slf4j
@ActionController(JsrCmd.cmd)
public class JsrJakartaAction {

    @ActionMethod(JsrCmd.jsr_jakarta)
    public void jsrJakarta(JsrJakartaPb jsrJakartaPb) {
        log.info("jsrJakartaPb : {}", jsrJakartaPb);
        
    }
}
