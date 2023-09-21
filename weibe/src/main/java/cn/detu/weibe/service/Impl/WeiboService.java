package cn.detu.weibe.service.Impl;

import cn.detu.weibe.mapper.WeiboMapper;
import cn.detu.weibe.pojo.vo.WeiboIndexVO;
import cn.detu.weibe.service.IWeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeiboService implements IWeiboService {

    @Autowired
    WeiboMapper mapper;
    @Override
    public List<WeiboIndexVO>list(){
        return mapper.selectForIndex();
    }




}
