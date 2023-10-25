package com.mmm.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AerodynamicRef对象", description="")
@Mapper
public class AerodynamicRef implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "height", type = IdType.ASSIGN_ID)
    private Double height;

    private Double angle;

    private Double relaSpeed;

    private Double aeroVal;


}
