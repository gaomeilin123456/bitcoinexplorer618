package com.gml.bitcoinexplorer618.api;


import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "BitcoinRestApi", url = "http://localhost:18332")
public interface BitcoinRestApi {
    @GetMapping("/rest/chaininfo.json")
    JSONObject getBlockChainInfo();

    @GetMapping("/rest/block/notxdetails/{blockhash}.json")
    JSONObject getNoTxBlock(@PathVariable(value = "blockhash") String blockhash);

    @GetMapping("/rest/headers/5/{blockhash}.json")
    JSONObject getHeadersByblockhash(@PathVariable(value = "blockhash") String blockhash);

    @GetMapping("/rest/tx/{txhash}.json")
    JSONObject getTxByTxhash(@PathVariable(value = "txhash") String txhash);

    @GetMapping("/rest/blockhashbyheight/{height}.json")
    JSONObject getByHeight(@PathVariable(value = "height") Integer height);

    @GetMapping("/rest/mempool/info.json")
    JSONObject getMempool();

    @GetMapping("/rest/mempool/contents.json")
    JSONObject getMempoolContents();




    @GetMapping("/rest/getutxos/{txhash}-{num}.json")
    JSONObject getUTXO(@PathVariable(value = "txhash") String txhash, @PathVariable(value = "num") Integer num);

    @GetMapping("/rest/getutxos/checkmempool/{{txhash}-{num}.json")
    JSONObject getUTXOCheckMempool(@PathVariable(value = "txhash") String txhash, @PathVariable(value = "num") Integer num);

    @GetMapping("/rest/headers/{count}/{blockhash}.json")
    List<JSONObject> getBlockHeaders(@PathVariable(value = "blockhash") String blockhash, @PathVariable(value = "count") Integer count);
}
