package com.mini.web.mappers;



import com.mini.web.floating.FloatingDTO;
import com.mini.web.proxy.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FloatingMapper {

    public int count();
    public List<FloatingDTO> selectFloatings(Pager pager);
    public FloatingDTO selectFloating(String floatingSeq);
}
