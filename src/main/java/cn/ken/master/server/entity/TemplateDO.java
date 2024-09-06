package cn.ken.master.server.entity;

import cn.ken.master.server.common.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TemplateDO extends BaseDO {

    /**
     * 模板所属应用id
     */
    private Long appId;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 模板描述
     */
    private String description;
}