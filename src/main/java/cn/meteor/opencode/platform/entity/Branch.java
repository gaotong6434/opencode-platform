package cn.meteor.opencode.platform.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("branch")
//@TableName("User")
public class Branch {

    @TableField("branch_id")
    //分支id
    private String branchId;

    @TableField("repo_id")
    //仓库id
    private String repoId;

    @TableField("branch_status")
    //分支状态 可用：1  （真）删除：0
    private Integer branchStatus;

    //判断是否为主支
    private Integer master;


}
