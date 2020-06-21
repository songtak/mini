package com.mini.web.proxy;


import com.mini.web.mappers.FloatingMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pager {
    @Autowired FloatingMapper floatingMapper;
    private int rowCount, startRow, endRow,
            pageCount, pageSize, startPage, endPage, nowPage,
            blockCount, blockSize, prevBlock, nextBlock, nowBlock;
    private boolean existPrev, existNext;
    private String searchWord;

    public void paging(){
        nowBlock = nowPage/blockSize;
        rowCount = floatingMapper.count();
        pageCount = (rowCount % pageSize != 0) ? (rowCount/pageSize + 1) : (rowCount/pageSize);
        blockCount = (pageCount % blockSize != 0) ? (pageCount/blockSize + 1) : (pageCount/blockSize);
        startRow = nowPage * pageSize;
        endRow = (nowPage != (pageCount - 1)) ? (nowPage+1)*pageSize - 1 : rowCount - 1;
        startPage = nowBlock * blockSize;
        endPage = (nowBlock != (blockCount - 1))? (nowBlock+1)*blockSize - 1 : pageCount - 1;
        prevBlock = startPage - blockSize;
        nextBlock = startPage + blockSize;
        existPrev = nowBlock != 0;
        existNext = nowBlock != (blockCount-1);
    }
}