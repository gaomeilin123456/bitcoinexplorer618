package com.gml.bitcoinexplorer618.controller;

import com.gml.bitcoinexplorer618.dto.BlockGetDTO;
import com.gml.bitcoinexplorer618.dto.BlockListDTO;
import com.gml.bitcoinexplorer618.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {


    @Autowired
    private BlockService blockService;


    @GetMapping("/getBlockList")
    public List<BlockListDTO> getBlockList() throws Throwable {
//        ArrayList<BlockListDTO> blockListDTOS = new ArrayList<>();
//        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
//        Integer blockHeight = blockChainInfo.getInteger("blocks");
//        Integer blockFromHeight = blockHeight - 5;
//
//        String blockhash = bitcoinJsonRpcApi.getByHeight(blockFromHeight).toJSONString();
//
//
//        List<JSONObject> blockHeaders = bitcoinRestApi.getBlockHeaders(blockhash, 5);
//
//        for (Object blockHeader : blockHeaders) {
//            JSONObject jsonObject = (JSONObject) blockHeader;
//            BlockListDTO blockListDTO = new BlockListDTO();
//            blockListDTO.setBlockhash(jsonObject.getString("hash"));
//            blockListDTO.setHeight(jsonObject.getInteger("height"));
//            Long time = jsonObject.getLong("time");
//            blockListDTO.setTime(new Date(1000*time));
//            blockListDTO.setTxsize(jsonObject.getShort("nTx"));
//            //todo
//            blockListDTO.setSize(null);
//            blockListDTOS.add(blockListDTO);
//        }
//
        List<BlockListDTO> recentBlocks = blockService.getRecentBlocks();
        return recentBlocks;
    }
    @GetMapping("/getBlockByBlockhash")
    public BlockGetDTO getBlockByBlockhash(@RequestParam String blockhash){
        return  null;
    }
    @GetMapping("/getBlockByHeight")
    public BlockGetDTO getBlockByHeight(@RequestParam Integer height){
        return  null;
    }
    @GetMapping("/getBlockByPrevBlcok")
    public BlockGetDTO getBlockByPrevBlcok(@RequestParam String prevBlock){
        return null;
    }

    @GetMapping("/getBlockByNextBlcok")
    public BlockGetDTO getBlockByNextBlcok(@RequestParam String nextBlock){
        return null;
    }
}
