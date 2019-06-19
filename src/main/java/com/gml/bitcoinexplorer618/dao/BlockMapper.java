package com.gml.bitcoinexplorer618.dao;

import com.gml.bitcoinexplorer618.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    //    custom
    List<Block> selectRecentBlocks();
}