package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.entity.Products;
import generator.service.ProductsService;
import generator.mapper.ProductsMapper;
import org.springframework.stereotype.Service;

/**
* @author liuli
* @description 针对表【products】的数据库操作Service实现
* @createDate 2022-06-16 10:52:27
*/
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products>
    implements ProductsService{

}




