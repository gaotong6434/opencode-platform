package cn.meteor.opencode.platform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("repository")
public class Repository {

    /**
     * 仓库id
     */
    @TableField("repo_id")
    private String repoId;

    /**
     * 仓库名字
     */
    @TableField("")
    private String repoName;

    /**
     * 仓库状态 可用：1  删除：0
     */
    private Integer repoStatus;

    /**
     * 仓库描述
     */
    private String repoDescription;

    /**
     * 仓库属性
     * 共有：1
     * 私有：2
     */
    private Integer repoProperty;

    /**
     * 是否创建readme.md文件
     * 创建：1  如果为1，直接创建主支master
     * 不创建：0
     */
    private Integer repoReadme;

    /**
     * 仓库创建时间
     */
    private Date repoCreateAt;

    /**
     * 仓库更新时间
     */
    private Date repoUpdateAt;

    /**
     * 仓库地址
     */
    @TableField("repo_url")
    private String repoUrl;
}
