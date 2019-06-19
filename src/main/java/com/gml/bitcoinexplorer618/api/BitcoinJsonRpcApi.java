package com.gml.bitcoinexplorer618.api;

import com.alibaba.fastjson.JSONObject;


public interface BitcoinJsonRpcApi {
    JSONObject getBlockChainInfo() throws Throwable;

    JSONObject getBlockByHash(String blockhash) throws Throwable;

    JSONObject getTxByTxhash(String txhash) throws Throwable;

    Integer getBlockCount() throws Throwable;

    Double getBalace() throws Throwable;


}
