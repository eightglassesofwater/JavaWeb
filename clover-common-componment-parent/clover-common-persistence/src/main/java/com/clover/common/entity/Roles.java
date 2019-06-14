package com.clover.common.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.io.Serializable;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("ddc_role")
public class Roles{

    private static final long serialVersionUID = 1L;

    private long id;

    private String name;
    private String note;

    @TableField("create_by")
    private Long createBy;


    @TableField("create_time")
    private Long createTime;

    @TableField("update_by")
    private Long updateBy;

    @TableField("update_time")
    private Long updateTime;

    @TableField("delete_flag")
    private boolean deleteFlag;


    protected Serializable pkVal() { return this.id; }

}
