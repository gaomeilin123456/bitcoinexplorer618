package com.gml.bitcoinexplorer618.po;

import java.util.Date;

public class Block {
    private String blockhash;

    private Integer height;

    private Date time;

    private Short txnum;

    private Double outputtotal;

    private Double estimatedtxvolume;

    private Double txfees;

    private String version;

    private Double blockreward;

    private Integer size;

    private Double difficulty;

    private Float weight;

    private String nextBlock;

    private String prevBlock;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash == null ? null : blockhash.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Short getTxnum() {
        return txnum;
    }

    public void setTxnum(Short txnum) {
        this.txnum = txnum;
    }

    public Double getOutputtotal() {
        return outputtotal;
    }

    public void setOutputtotal(Double outputtotal) {
        this.outputtotal = outputtotal;
    }

    public Double getEstimatedtxvolume() {
        return estimatedtxvolume;
    }

    public void setEstimatedtxvolume(Double estimatedtxvolume) {
        this.estimatedtxvolume = estimatedtxvolume;
    }

    public Double getTxfees() {
        return txfees;
    }

    public void setTxfees(Double txfees) {
        this.txfees = txfees;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Double getBlockreward() {
        return blockreward;
    }

    public void setBlockreward(Double blockreward) {
        this.blockreward = blockreward;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getNextBlock() {
        return nextBlock;
    }

    public void setNextBlock(String nextBlock) {
        this.nextBlock = nextBlock == null ? null : nextBlock.trim();
    }

    public String getPrevBlock() {
        return prevBlock;
    }

    public void setPrevBlock(String prevBlock) {
        this.prevBlock = prevBlock == null ? null : prevBlock.trim();
    }
}