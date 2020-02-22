/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCCFrequencyRulesRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 匹配规则，取值["include"(前缀匹配)，"equal"(完全匹配)]
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 统计周期，单位秒，取值[10, 30, 60]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 访问次数，取值[1-10000]
    */
    @SerializedName("ReqNumber")
    @Expose
    private Long ReqNumber;

    /**
    * 执行动作，取值["alg"（人机识别）, "drop"（拦截）]
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
    * 执行时间，单位秒，取值[1-900]
    */
    @SerializedName("ExeDuration")
    @Expose
    private Long ExeDuration;

    /**
    * URI字符串，必须以/开头，例如/abc/a.php，长度不超过31；当URI=/时，匹配模式只能选择前缀匹配；
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * User-Agent字符串，长度不超过80
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Cookie字符串，长度不超过40
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID） 
     * @return RuleId 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     * @param RuleId 7层转发规则ID（通过获取7层转发规则接口可以获取规则ID）
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 匹配规则，取值["include"(前缀匹配)，"equal"(完全匹配)] 
     * @return Mode 匹配规则，取值["include"(前缀匹配)，"equal"(完全匹配)]
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 匹配规则，取值["include"(前缀匹配)，"equal"(完全匹配)]
     * @param Mode 匹配规则，取值["include"(前缀匹配)，"equal"(完全匹配)]
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 统计周期，单位秒，取值[10, 30, 60] 
     * @return Period 统计周期，单位秒，取值[10, 30, 60]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期，单位秒，取值[10, 30, 60]
     * @param Period 统计周期，单位秒，取值[10, 30, 60]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 访问次数，取值[1-10000] 
     * @return ReqNumber 访问次数，取值[1-10000]
     */
    public Long getReqNumber() {
        return this.ReqNumber;
    }

    /**
     * Set 访问次数，取值[1-10000]
     * @param ReqNumber 访问次数，取值[1-10000]
     */
    public void setReqNumber(Long ReqNumber) {
        this.ReqNumber = ReqNumber;
    }

    /**
     * Get 执行动作，取值["alg"（人机识别）, "drop"（拦截）] 
     * @return Act 执行动作，取值["alg"（人机识别）, "drop"（拦截）]
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set 执行动作，取值["alg"（人机识别）, "drop"（拦截）]
     * @param Act 执行动作，取值["alg"（人机识别）, "drop"（拦截）]
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    /**
     * Get 执行时间，单位秒，取值[1-900] 
     * @return ExeDuration 执行时间，单位秒，取值[1-900]
     */
    public Long getExeDuration() {
        return this.ExeDuration;
    }

    /**
     * Set 执行时间，单位秒，取值[1-900]
     * @param ExeDuration 执行时间，单位秒，取值[1-900]
     */
    public void setExeDuration(Long ExeDuration) {
        this.ExeDuration = ExeDuration;
    }

    /**
     * Get URI字符串，必须以/开头，例如/abc/a.php，长度不超过31；当URI=/时，匹配模式只能选择前缀匹配； 
     * @return Uri URI字符串，必须以/开头，例如/abc/a.php，长度不超过31；当URI=/时，匹配模式只能选择前缀匹配；
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set URI字符串，必须以/开头，例如/abc/a.php，长度不超过31；当URI=/时，匹配模式只能选择前缀匹配；
     * @param Uri URI字符串，必须以/开头，例如/abc/a.php，长度不超过31；当URI=/时，匹配模式只能选择前缀匹配；
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get User-Agent字符串，长度不超过80 
     * @return UserAgent User-Agent字符串，长度不超过80
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set User-Agent字符串，长度不超过80
     * @param UserAgent User-Agent字符串，长度不超过80
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Cookie字符串，长度不超过40 
     * @return Cookie Cookie字符串，长度不超过40
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie字符串，长度不超过40
     * @param Cookie Cookie字符串，长度不超过40
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ReqNumber", this.ReqNumber);
        this.setParamSimple(map, prefix + "Act", this.Act);
        this.setParamSimple(map, prefix + "ExeDuration", this.ExeDuration);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);

    }
}
