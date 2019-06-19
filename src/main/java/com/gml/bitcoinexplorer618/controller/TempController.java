package com.gml.bitcoinexplorer618.controller;

import com.alibaba.fastjson.JSONObject;
import com.gml.bitcoinexplorer618.api.BitcoinJsonRpcApi;
import com.gml.bitcoinexplorer618.api.BitcoinRestApi;
import com.gml.bitcoinexplorer618.service.BitcoinService;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;

@RestController
@RequestMapping("/temp")
public class TempController {
    @Autowired
    private BitcoinService bitcoinService;
    @Autowired
    private BitcoinRestApi bitcoinRestApi;
    @Autowired
    private BitcoinJsonRpcApi bitcoinJsonRpcApi;
    @GetMapping("/test")
    public String test() throws  Throwable{
//        JSONObject blockChainInfo = bitcoinRestApi.getBlockChainInfo();
//        String blockChain = blockChainInfo.toJSONString();
//        JSONObject noTxBlock = bitcoinRestApi.getNoTxBlock("00000000000025a0a7355b1479e4ead33b275b10f9bef84f71efb97a0d5484ae");
//        String block = noTxBlock.toJSONString();
//        return block;
//        JSONObject utxo = bitcoinRestApi.getUTXO("1d7d5226bb2d39e328262e9816694458d2ae081af6e380790bdc00b968ce0daf", 0);
//        JSONObject utxoCheckMempool = bitcoinRestApi.getUTXOCheckMempool("0b9a0ea6c034834e79db101967985e1b0d6358cad111444ff52075106acba8d6", 0);
//        HashMap<String, String> headers = new HashMap<>();
//        String authstrorig="root:root";
//        String authstr = Base64.getEncoder().encodeToString(authstrorig.getBytes());
//        String authstrResult = String.format("Basic %s", authstr);
//        headers.put("Authorization",authstrResult);
//
//        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://127.0.0.1:18332/"),headers);
//        JSONObject user = client.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        JSONObject blockChainInfo = bitcoinJsonRpcApi.getBlockChainInfo();
//        JSONObject blockByHash = bitcoinJsonRpcApi.getBlockByHash("");
//        JSONObject byTxhash = bitcoinJsonRpcApi.getTxByTxhash("");
        Integer blockCount = bitcoinJsonRpcApi.getBlockCount();
        Double balace = bitcoinJsonRpcApi.getBalace();
        String tempBlockhash = "0000000000007269a38df4cf2507eb886bc972e611b8130ac193b72a55ea66a7";
        bitcoinService.syncBlockchainFromHash(tempBlockhash);
        return null;
    }
}
