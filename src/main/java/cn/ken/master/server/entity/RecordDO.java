package cn.ken.master.server.entity;

import cn.ken.master.server.common.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("master_record")
public class RecordDO extends BaseDO {

    /**
     * 应用id
     */
    private Long appId;

    /**
     * 应用名
     */
    private String appName;

    /**
     * 变更机器的IP地址
     */
    private String ipAddress;

    /**
     * 变更机器的端口号
     */
    private Integer port;

    /**
     * 变更的命名空间
     */
    private String namespace;

    /**
     * 变更的字段名
     */
    private String fieldName;

    /**
     * 变更前的值
     */
    private String beforeValue;

    /**
     * 变更后的值
     */
    private String afterValue;

    /**
     * 变更状态
     */
    private Integer status;

    /**
     * 推送类型
     */
    private Integer pushType;

    /**
     * 场景模板id
     */
    private Long templateId;

    /**
     * 归属父变更id（用于场景模板）
     */
    private Long parentId;
}
