package com.gml.bitcoinexplorer618.api.impl;

import com.alibaba.fastjson.JSONObject;
import com.gml.bitcoinexplorer618.api.BitcoinJsonRpcApi;
import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.HashMap;


@Component
public class BitcoinJsonRpcApiImpl implements BitcoinJsonRpcApi {

    private JsonRpcHttpClient jsonRpcHttpClient;

    public BitcoinJsonRpcApiImpl(@Value("${bitcoin.jsonrpc.username}") String username,
                                 @Value("${bitcoin.jsonrpc.password}") String password,
                                 @Value("${bitcoin.jsonrpc.url}") String url) throws MalformedURLException {
        HashMap<String, String> headers = new HashMap<>();
        String authStrOrig = String.format("%s:%s",username,password);
        String authStr = Base64.getEncoder().encodeToString(authStrOrig.getBytes());
        String authStrResult = String.format("Basic %s",authStr);
        headers.put("Authorization",authStrResult);
        jsonRpcHttpClient = new JsonRpcHttpClient(new URL(url),headers);
    }

    @Override
    public JSONObject getBlockChainInfo() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getNoTxBlock(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getnotxblock", new Object[]{blockhash}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getHeadersByblockhash(String blockhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getheadersbyblockhash", new Object[]{blockhash}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getTxByTxhash(String txhash) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("gettxbytxhash", new Object[]{txhash}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getByHeight(Integer height) throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getbyheight", new Object[]{height}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getMempool() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        return jsonObject;
    }

    @Override
    public JSONObject getMempoolContents() throws Throwable {
        JSONObject jsonObject = jsonRpcHttpClient.invoke("getblockchaininfo", new Object[]{}, JSONObject.class);
        return jsonObject;
    }
}
