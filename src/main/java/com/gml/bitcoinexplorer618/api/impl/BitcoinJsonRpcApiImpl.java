package com.gml.bitcoinexplorer618.api.impl;

import com.alibaba.fastjson.JSONObject;
import com.gml.bitcoinexplorer618.api.BitcoinJsonRpcApi;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Base64;
import java.util.HashMap;


@Component
public class BitcoinJsonRpcApiImpl implements BitcoinJsonRpcApi {

    private JsonRpcHttpClient jsonRpcHttpClient;

    public BitcoinJsonRpcApiImpl(@Value("${bitcoin.jsonrpc.username}") String username,
                                 @Value("${bitcoin.jsonrpc.password}") String password,
                                 @Value("${bitcoin.jsonrpc.url}") String url) throws Throwable {
        HashMap<String, String> headers = new HashMap<>();
        String authStrOrig = String.format("%s:%s",username,password);
        String authStr = Base64.getEncoder().encodeToString(authStrOrig.getBytes());
        String authStrResult = String.format("Basic %s",authStr);
        headers.put("Authorization",authStrResult);
        jsonRpcHttpClient = new JsonRpcHttpClient(new URL(url),headers);
    }


    @Override
    public JSONObject getBlockChainInfo() throws Throwable {
        JSONObject result = jsonRpcHttpClient.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        return result;
    }

    @Override
    public JSONObject getBlockByHash(String blockhash) throws Throwable {
        JSONObject result = jsonRpcHttpClient.invoke("getblock", new Object[]{blockhash}, JSONObject.class);
        return result;
    }

    @Override
    public JSONObject getTxByTxhash(String txhash) throws Throwable {
        JSONObject result = jsonRpcHttpClient.invoke("getrawtransaction", new Object[]{txhash}, JSONObject.class);
        return result;
    }

    @Override
    public Integer getBlockCount() throws Throwable {
        Integer result = jsonRpcHttpClient.invoke("getblockcount", new Object[]{}, Integer.class);
        return result;
    }

    @Override
    public Double getBalace() throws Throwable {
        Double result = jsonRpcHttpClient.invoke("getbalance", new Object[]{"*",6}, Double.class);
        return result;
    }


}
