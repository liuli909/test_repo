package liuli.microservice.study;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author leolau
 * @TableName products
 */
@TableName(value ="products")
@Data
public class Products implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Double price;
    private String flag;
    private String goodsDesc;
    private String images;
    private Integer goodsStock;
    private String goodsType;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
