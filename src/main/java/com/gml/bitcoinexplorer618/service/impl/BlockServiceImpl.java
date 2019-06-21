package com.gml.bitcoinexplorer618.service.impl;


import com.gml.bitcoinexplorer618.dao.BlockMapper;
import com.gml.bitcoinexplorer618.dto.BlockGetDTO;
import com.gml.bitcoinexplorer618.dto.BlockListDTO;
import com.gml.bitcoinexplorer618.po.Block;
import com.gml.bitcoinexplorer618.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<BlockListDTO> getRecentBlocks() {
        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();

        List<Block> blocks = blockMapper.selectRecentBlocks();

        for (Block block : blocks) {
            BlockListDTO blockListDTO = new BlockListDTO();
           blockListDTO.setBlockhash(block.getBlockhash());
           blockListDTO.setHeight(block.getHeight());
           blockListDTO.setSize(block.getSize());
           blockListDTO.setTime(block.getTime());
           blockListDTO.setTxsize(block.getTxnum());
            blockListDTOS.add(blockListDTO);
        }

        return blockListDTOS;
    }

    @Override
    public BlockGetDTO getBlockByBlockhash(String blockhash) {
        BlockGetDTO blockByBlockhash = blockMapper.getBlockByBlockhash(blockhash);
        return blockByBlockhash;
    }

    @Override
    public BlockGetDTO getBlockByHeight(Integer height) {
        BlockGetDTO blockByHeight = blockMapper.getBlockByHeight(height);
        return blockByHeight;
    }

    @Override
    public BlockGetDTO getBlockByPrevBlcok(String prevBlock) {
        BlockGetDTO blockByPrevBlcok = blockMapper.getBlockByPrevBlcok(prevBlock);
        return blockByPrevBlcok;
    }

    @Override
    public BlockGetDTO getBlockByNextBlcok(String nextBlock) {
        BlockGetDTO blockByNextBlcok = blockMapper.getBlockByNextBlcok(nextBlock);
        return blockByNextBlcok;
    }
}
