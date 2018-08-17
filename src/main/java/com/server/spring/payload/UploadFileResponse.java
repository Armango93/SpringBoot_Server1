package com.server.spring.payload;


import java.util.ArrayList;
import java.util.List;

public class UploadFileResponse {
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
//    private List<String> wordsCountList = new ArrayList<>();
//    private boolean isBracketsOk;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

//    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size, List<String> wordsCountList) {
//        this.fileName = fileName;
//        this.fileDownloadUri = fileDownloadUri;
//        this.fileType = fileType;
//        this.size = size;
//        this.wordsCountList = wordsCountList;
//    }
//
//    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size, List<String> wordsCountList, boolean isBracketsOk) {
//        this.fileName = fileName;
//        this.fileDownloadUri = fileDownloadUri;
//        this.fileType = fileType;
//        this.size = size;
//        this.wordsCountList = wordsCountList;
//        this.isBracketsOk = isBracketsOk;
//    }

//    public boolean isBracketsOk() {
//        return isBracketsOk;
//    }
//
//    public void setBracketsOk(boolean bracketsOk) {
//        isBracketsOk = bracketsOk;
//    }
//
//    public List<String> getWordsCountList() {
//        return wordsCountList;
//    }
//
//    public void setWordsCountList(List<String> wordsCountList) {
//        this.wordsCountList = wordsCountList;
//    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
