package cn.tedu.baking.mapper.impl;

import cn.tedu.baking.mapper.BannerMapper;
import cn.tedu.baking.pojo.vo.BannerindexVO;
import cn.tedu.baking.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService implements IBannerService {
    @Autowired
    BannerMapper mapper;
    @Override
    public List<BannerindexVO> listForIndex() {
        return mapper.selectForIndex();
    }
}
