package com.yyj.framework.common.core.constant;

import com.yyj.framework.common.util.status.Status;

/**
 * Created by yangyijun on 2018/11/5.
 */
public enum CoreStatus implements Status {

    BUILD_FILTER_ERROR(12001, "构建filter条件失败"),;

    private int code;
    private String desc;

    CoreStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
