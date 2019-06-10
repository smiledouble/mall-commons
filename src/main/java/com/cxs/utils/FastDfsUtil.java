package com.cxs.utils;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.io.IOException;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/3/25 16:55
 */
public class FastDfsUtil {

    private static StorageClient client = null;

    static {
        try {
            ClientGlobal.init("fdfs_client.conf");
            // 连接tracker
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getConnection();
            // 通过tracker 得到一storageclient
            StorageServer storageServer = null;
            client = new StorageClient(trackerServer, storageServer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 文件上传 封装的方法 给文件名
     *
     * @param localFileName 文件名
     * @return
     */
    public static String uploadFile(String localFileName) {
        // d://1111.jpg 字符串的截取
        String extName = localFileName.subSequence(localFileName.lastIndexOf(".") + 1, localFileName.length()).toString();
        String fileRealPath = null;
        String[] filePath = null;
        try {
            //extName是文件的后缀名 也是拓展名
            filePath = client.upload_file(localFileName, extName, null);
        } catch (IOException | MyException e) {
            e.printStackTrace();
        }
        if (filePath != null && filePath.length == 2) {
            fileRealPath = filePath[0] + "/" + filePath[1];
        }
        //拼接成地址
        return fileRealPath;
    }


    /**
     * 字节的上传，更加强大一点
     *
     * @param bs      直接传入字节
     * @param extName
     * @return
     */
    public static String uploadFile(byte[] bs, String extName) {
        String uploadFilePath = null;
        String[] upload_file = null;
        try {
            upload_file = client.upload_file(bs, extName, null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
        if (upload_file != null && upload_file.length == 2) {
            uploadFilePath = upload_file[0] + "/" + upload_file[1];
        }
        return uploadFilePath;
    }


    //测试方法
    public static void main(String[] args) {
        String s = uploadFile("C:\\Users\\86158\\Pictures\\Saved Pictures\\清新.jpg");
        System.out.println(s);
    }

}
