package com.xlh.excel.export.demo.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2021年04月04日 11:10 胡晓磊 Exp $
 */
@Data
public class OrderItem implements Serializable {
    private static final long serialVersionUID = -8511595378519677150L;

    /**
     *
     */
    private Long id;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 企业编号
     */

    private String enterpriseNo;
    /**
     * 物料SKU_NO
     */
    private String skuNo;
    /**
     * 物料编码
     */
    private String skuCode;
    /**
     * 产品货号
     */
    private String articleCode;
    /**
     * 产品名称
     */
    private String goodsName;
    /**
     * 通用名称
     */
    private String commonName;
    /**
     * 最小起订量
     */
    private BigDecimal cartonSize;
    /**
     * 是否倍数叠加：0-否、1-是
     */
    private Integer isMultiple;
    /**
     * 业务类型 0:销售,1:投放,2:赠品
     */
    private Integer bizType;
    /**
     * 产品规格
     */
    private String spec;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 供应商编号
     */
    private String supplierNo;
    /**
     * 客户编号
     */
    private String customerNo;
    /**
     * 终端客户编号
     */
    private String endCustomerNo;
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 返利单号
     */
    private String rebateNo;
    /**
     * 采购数量
     */
    private BigDecimal purchaseNum;
    /**
     * 收货数量
     */
    private BigDecimal receiveNum;
    /**
     * 取消数量
     */
    private BigDecimal cancelNum;
    /**
     * 退货数量
     */
    private BigDecimal returnNum;
    /**
     * 含税单价
     */
    private BigDecimal ratePrice;
    /**
     * 含税金额
     */
    private BigDecimal rateAmount;
    /**
     * 不含税价格
     */
    private BigDecimal price;
    /**
     * 不含税金额
     */
    private BigDecimal amount;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 税额
     */
    private BigDecimal tax;
    /**
     * 折后单价
     */
    private BigDecimal rebatePrice;
    /**
     * 折后含税单价
     */
    private BigDecimal rebateRatePrice;
    /**
     * 折扣率
     */
    private BigDecimal rebateRate;
    /**
     * 返利金额
     */
    private BigDecimal rebateAmount;
    /**
     * 折后不含税金额
     */
    private BigDecimal realAmount;
    /**
     * 折后含税金额
     */
    private BigDecimal realRateAmount;
    /**
     * 是否加急:1加急 0非加急(默认)
     */
    private Integer urgent;
    /**
     * 页面排序值
     */
    private Integer sortNum;
    /**
     * 行备注
     */
    private String remark;
    /**
     * 删除标记：0未删除,1已删除
     */
    private Integer deleted;
    /**
     * 操作人编号
     */
    private String operateNo;
    /**
     * 操作人名称
     */
    private String operateName;
    /**
     * 最后操作时间戳
     */
    private Date opTimestamp;
    /**
     * 数据记录版本
     */
    private Integer opRevsion;
    /**
     * 数据操作类型 I:新增 U：更新 D:删除
     */
    private String opType;

    private String contractCode;

    private String sourceBillNo;

    private BigDecimal saleOrderItemNum;

    private Integer start;

    private Integer end;
}
