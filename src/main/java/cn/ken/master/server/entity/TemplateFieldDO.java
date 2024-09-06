package cn.ken.master.server.entity;

import cn.ken.master.server.common.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("master_template_field")
public class TemplateFieldDO extends BaseDO {

    /**
     * 所属模板id
     */
    private Long templateId;

    /**
     * 变量所属命名空间
     */
    private String namespace;

    /**
     * 变量名称
     */
    private String fieldName;

    /**
     * 变量值
     */
    private String fieldValue;
}
