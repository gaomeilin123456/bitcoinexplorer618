package com.gml.bitcoinexplorer618.service;

import com.gml.bitcoinexplorer618.dto.BlockGetDTO;
import com.gml.bitcoinexplorer618.dto.BlockListDTO;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

public interface BlockService {

    List<BlockListDTO> getRecentBlocks();
    public BlockGetDTO getBlockByBlockhash(@RequestParam String blockhash);
    public BlockGetDTO getBlockByHeight(@RequestParam Integer height);
    public BlockGetDTO getBlockByPrevBlcok(@RequestParam String prevBlock);
    public BlockGetDTO getBlockByNextBlcok(@RequestParam String nextBlock);
}
