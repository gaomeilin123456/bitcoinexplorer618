package com.gml.bitcoinexplorer618.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BitcoinJsonRpcApi {
    JSONObject getBlockChainInfo() throws Throwable;

    JSONObject getNoTxBlock(String blockhash) throws Throwable;

    JSONObject getHeadersByblockhash(String blockhash) throws Throwable;

    JSONObject getTxByTxhash(String txhash) throws Throwable;

    JSONObject getByHeight(Integer height) throws Throwable;

    JSONObject getMempool() throws Throwable;

    JSONObject getMempoolContents() throws Throwable;
}
