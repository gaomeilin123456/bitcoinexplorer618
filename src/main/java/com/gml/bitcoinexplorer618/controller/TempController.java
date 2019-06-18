package com.gml.bitcoinexplorer618.controller;

import com.alibaba.fastjson.JSONObject;
import com.gml.bitcoinexplorer618.api.BitcoinRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/temp")
public class TempController {
    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @GetMapping("/test")
    public String test(){
//        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
//        String blockChain = blockChainInfo.toJSONString();
        JSONObject noTxBlock = bitcoinRestApi.getNoTxBlock("00000000000025a0a7355b1479e4ead33b275b10f9bef84f71efb97a0d5484ae");
        String block = noTxBlock.toJSONString();
        return block;
    }
}
