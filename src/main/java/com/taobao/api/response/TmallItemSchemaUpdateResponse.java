package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TmallItemSchemaUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7755656141653663763L;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiField("update_item_result")
    private String updateItemResult;

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setUpdateItemResult(String updateItemResult) {
        this.updateItemResult = updateItemResult;
    }

    public String getUpdateItemResult() {
        return this.updateItemResult;
    }
}


