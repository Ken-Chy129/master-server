package cn.ken.master.server.entity;

import cn.ken.master.server.common.BaseDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Ken-Chy129
 * @date 2024/8/28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("master_app")
public class AppDO extends BaseDO {

    private String name;

    private String description;

    private String ipAddress;

    private Integer port;

    private Integer status;
}
