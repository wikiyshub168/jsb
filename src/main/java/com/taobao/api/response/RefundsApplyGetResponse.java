package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Refund;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class RefundsApplyGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2713647691132689648L;
    @ApiListField("refunds")
    @ApiField("refund")
    private List<Refund> refunds;
    @ApiField("total_results")
    private Long totalResults;

    public void setRefunds(List<Refund> refunds) {
        this.refunds = refunds;
    }

    public List<Refund> getRefunds() {
        return this.refunds;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


