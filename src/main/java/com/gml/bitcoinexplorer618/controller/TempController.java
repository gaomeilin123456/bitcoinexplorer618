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
//        JSONObject noTxBlock = bitcoinRestApi.getNoTxBlock("00000000000025a0a7355b1479e4ead33b275b10f9bef84f71efb97a0d5484ae");
//        String block = noTxBlock.toJSONString();
//        return block;
//        JSONObject utxo = bitcoinRestApi.getUTXO("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf", 0);
//        JSONObject utxoCheckMempool = bitcoinRestApi.getUTXOCheckMempool("0b9a0ea6c034834e79db101967985e1b0d6358cad111444ff52075106acba8d6", 0);

        return null;
    }
}
