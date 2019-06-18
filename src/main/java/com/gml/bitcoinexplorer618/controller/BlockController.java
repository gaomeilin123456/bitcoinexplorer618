package com.gml.bitcoinexplorer618.controller;

import com.gml.bitcoinexplorer618.dto.BlockGetDTO;
import com.gml.bitcoinexplorer618.dto.BlockListDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {
    @GetMapping("/getBlockList")
    public List<BlockListDTO> getBlockList(){
        return  null;
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
