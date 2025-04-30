package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockFinanceAuditRecord {
    private String tsCode;
    private String annDate;
    private String endDate;
    private String auditResult;
    private Double auditFees;
    private String auditAgency;
    private String auditSign;
}