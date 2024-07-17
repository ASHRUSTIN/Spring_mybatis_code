package com.syq.code.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("t_euser")//当实体类和表名不一致的时候，用@tablename来指定表名
public class Euser {
    private Integer id;
    private String eusername;
    private String epermission;
}
