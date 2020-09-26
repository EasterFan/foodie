package com.easter.po;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order_status
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("订单状态表 订单的每个状态更改都需要进行记录 " +
        "10：待付款  20：已付款，待发货  30：已发货，待收货（7天自动确认）40：交易成功（此时可以评价）" +
        "50：交易关闭（待付款时，用户取消 或 长时间未付款，系统识别后自动关闭） 退货/退货，此分支流程不做，所以不加入")
public class OrderStatus implements Serializable {
    @ApiModelProperty("订单ID 对应订单表的主键id")
    @TableId
    private String orderId;

    @ApiModelProperty("订单状态")
    private Integer orderStatus;

    @ApiModelProperty("订单创建时间 对应[10:待付款]状态")
    private Date createdTime;

    @ApiModelProperty("支付成功时间 对应[20:已付款，待发货]状态")
    private Date payTime;

    @ApiModelProperty("发货时间 对应[30：已发货，待收货]状态")
    private Date deliverTime;

    @ApiModelProperty("交易成功时间 对应[40：交易成功]状态")
    private Date successTime;

    @ApiModelProperty("交易关闭时间 对应[50：交易关闭]状态")
    private Date closeTime;

    @ApiModelProperty("留言时间 用户在交易成功后的留言时间")
    private Date commentTime;

    private static final long serialVersionUID = 1L;
}
