package com.mmm.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统访问记录
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SysLogininfor对象", description="系统访问记录")
public class SysLogininfor implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "访问ID")
    @TableId(value = "info_id", type = IdType.AUTO)
    private Long infoId;

    @ApiModelProperty(value = "用户账号")
    private String userName;

    @ApiModelProperty(value = "登录IP地址")
    private String ipaddr;

    @ApiModelProperty(value = "登录状态（0成功 1失败）")
    private String status;

    @ApiModelProperty(value = "提示信息")
    private String msg;

    @ApiModelProperty(value = "访问时间")
    private Date accessTime;


}
